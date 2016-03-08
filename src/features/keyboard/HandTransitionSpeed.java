package features.keyboard;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

import extractors.data.Answer;
import extractors.data.DataNode;
import extractors.data.ExtractionModule;
import extractors.data.Feature;
import features.pause.KSE;

/**
 * @author agoodkind
 * Transition times between L-L, L-R, L-?,
 * 							R-L, R-R, R-?,
 * 							?-L, ?-R, ?-?,
 */
public class HandTransitionSpeed implements ExtractionModule {
	
	public final Set<String> handNames = new HashSet<String>(Arrays.asList("Left_Hand","Right_Hand","None"));
	private Set<String> searchSpace = new TreeSet<String>();
	private HashMap<String, LinkedList<Long>> featureMap = new HashMap<String, LinkedList<Long>>();
	
	public HandTransitionSpeed() {
		searchSpace.clear();
		featureMap.clear();
		generateSearchSpace();
	}
	
	public void generateSearchSpace() {
		for (String hand1 : handNames)
			for (String hand2 : handNames)
				searchSpace.add(hand1+"_TO_"+hand2);
	}
	
	@Override
	public Collection<Feature> extract(DataNode data) {
		
		for (String s : searchSpace)
			featureMap.put(s, new LinkedList<Long>());
		
		//create a buffer to hold the KSEs during processing
		LinkedList<KSE> buffer = new LinkedList<KSE>();
		//String used to hold transition type
		String transition_category;
		for (Answer a : data) {
			
			Collection<KSE> kseArray = KSE.parseSessionToKSE(a.getKeyStrokes());	// create KSE array from KeyStrokes
			
			for (KSE kse : kseArray) {
				if (kse.isKeyPress()) {									//only look at keypresses
					buffer.add(kse);									//add a keypress to the buffer
					if (buffer.size() > 2)								//if the buffer contains more than 2 keypresses
						buffer.poll();									//remove the first keystroke in the buffer
					if (buffer.size() == 2) {							//if buffer has 2 keystrokes in it
						transition_category = getTransitionType(buffer);
						if (searchSpace.contains(transition_category)) {
							// add the latency between the two keys to the existing list
							featureMap.get(transition_category).add(kse.getM_pauseMs());
						}
					}
				}
			}
		}
		
		//create output feature list.
		LinkedList<Feature> output = new LinkedList<Feature>();
		//iterate over the featureMap using searchSpace because it is auto-sorted by TreeSet class.
		for (String s : searchSpace)
			output.add(new Feature(s, featureMap.get(s)));
//	    for (Feature f : output) System.out.println(f.toTemplate());
		return output;
	}

	// determine the type of transition, by determining the category of each keystroke
	public String getTransitionType(LinkedList<KSE> buffer) {
		String keystroke1Category = buffer.getFirst().kseGetHand();
		String keystroke2Category = buffer.getLast().kseGetHand();
		String transitionType = keystroke1Category+"_TO_"+keystroke2Category;
//		System.out.println(buffer.get(0).getKeyChar()+" "+buffer.get(1).getKeyChar()+"\t"+transitionType+"\t"+
//				(buffer.getLast().getWhen() - buffer.getFirst().getWhen()));
		return transitionType;
	}
	
	@Override
	public String getName() {
		return "Hand_Transition_Speed";
	}

}
