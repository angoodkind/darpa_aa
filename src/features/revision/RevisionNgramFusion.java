package features.revision;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.TreeSet;

import extractors.data.Answer;
import extractors.data.DataNode;
import extractors.data.ExtractionModule;
import extractors.data.Feature;
import extractors.data.TestVectorShutdownModule;
import features.revision.Revision.KeystrokeRevision;
import features.revision.Revision.KeystrokeRevision.RevisionStatus;
import keystroke.KeyStroke;
import keytouch.KeyTouch;

public class RevisionNgramFusion implements ExtractionModule, TestVectorShutdownModule {

	/**
	 *  For intermediate TestVector file processing<p><p>
	 *  < User : < LinkedList<HashMap < Feature : Value > > > >
	 */
	private static LinkedHashMap<Integer,LinkedList<LinkedHashMap<String,String>>> vectorFileMap =
			new LinkedHashMap<Integer,LinkedList<LinkedHashMap<String,String>>>();;
			public static final String vectorMapFileName = "vectorFile.map";
			private static boolean preliminaryScan = false;

			//			private static final RevisionStatus[] revStatusList = KeystrokeRevision.RevisionStatus.values();
			private HashMap<String, LinkedList<Double>> featureMap = new HashMap<String, LinkedList<Double>>(10000);
			private static final int NGRAM_SIZE = 2;
			private static final boolean EXCLUDE_DELETIONS = true;
			private static final boolean EXCLUDE_REPLACEMENTS = false;		

			public RevisionNgramFusion() {
				featureMap.clear();
			}

			@Override
			public Collection<Feature> extract(DataNode data) {
				//		createSearchSpace();

				featureMap.clear();
				int userID = data.getUserID();
				//create user's hashmap
				if (!vectorFileMap.containsKey(userID)) {
					vectorFileMap.put(userID, new LinkedList<LinkedHashMap<String,String>>());
				}
				//create HashMap to be placed in LinkedList, only if this is not a 
				//pre-processing scan
				LinkedHashMap<String,String> sliceMap = null;
				if (!preliminaryScan) {
					sliceMap = new LinkedHashMap<String,String>();
				}

				for (Answer a : data) {
					LinkedList<KeyTouch> ktList = KeyTouch.parseSessionToKeyTouches(a.getKeyStrokes());
					ArrayList<KeystrokeRevision> krList = Revision.extendKeystrokesToRevisions(ktList);
					for (int i=0; i < krList.size()-NGRAM_SIZE; i++) {
						// construct ngram
						String ngramStr = "";
						//						double ngramTiming = 0.0;
						double ngramHoldTiming = 0.0;
						double ngramIntervalTiming = 0.0;
						int nSize = NGRAM_SIZE;
						int actualGramSize = 0;

						for (int n=0; n < nSize; n++) {
							// since nSize could be expanded below, check that we are still
							// within the list's range
							if ((i+n) < krList.size()) {
								KeystrokeRevision k = krList.get(i+n);
								// if excluding certain types of keystrokes, increment temporary
								// n size and skip this keystroke
								if ((k.getRevisionStatus().equals(RevisionStatus.Deletion) && EXCLUDE_DELETIONS)
										|| (k.getRevisionStatus().equals(RevisionStatus.Replacement) && EXCLUDE_REPLACEMENTS)) {
									nSize++;
									continue;
								}
								// construct ngram name
								ngramStr += (k.toString()+"_");
								
								// construct hold timing metric
								ngramHoldTiming += ((double) krList.get(i+n).kt.getHoldTime());
								// construct interval timing
								if (actualGramSize != 0 || NGRAM_SIZE == 1)
									ngramIntervalTiming += ((double) krList.get(i+n).kt.getPrecedingPause());
								actualGramSize++;
							}
							// only add a complete n-gram
							if (actualGramSize == NGRAM_SIZE) {
								//trim trailing _ from ngram string
								ngramStr = ngramStr.substring(0, ngramStr.length()-1);
								String holdStr = "H__"+ngramStr;
								String intervalStr = "I__"+ngramStr;

								// add to existing entry or create new entry
								if (featureMap.keySet().contains(holdStr)) {
									featureMap.get(holdStr).add(ngramHoldTiming);
									featureMap.get(intervalStr).add(ngramIntervalTiming);
								}
								else {
									featureMap.put(holdStr, 
											new LinkedList<Double>(Arrays.asList(ngramHoldTiming)));
									featureMap.put(intervalStr, 
											new LinkedList<Double>(Arrays.asList(ngramIntervalTiming)));
								}
							} // end feature map add loop
						} // end ngram creation loop
					} // end loop through keystroke list
				} //end answer loop

				//add this slice's HashMap to the LinkedList, if this is not a
				//pre-processing scan
				if (sliceMap != null) {
					//add features from featureMap to sliceMap
					for (String feature : featureMap.keySet()) {
						//ignore subjanswid because it is already added to slicemap
						//needed to add it to featuremap for Template creation, and
						//subsequent availability pruning, where it is necessary to
						//have all features
						if (!feature.equals("SubjAnswID"))
							sliceMap.put(feature, featureMap.get(feature).toString());
					}
					vectorFileMap.get(userID).add(sliceMap);
				}

				LinkedList<Feature> output = new LinkedList<Feature>();
				for (String featureName : featureMap.keySet()) {
					output.add(new Feature(featureName,featureMap.get(featureName)));
				}
//				for (Feature f : output) System.out.println(f.toTemplate());
				//changed to false after initial, pre-user, Scan
				preliminaryScan=false;

				return output;
			}

			/**
			 * Write vector map file
			 */
			@Override
			public void shutdown() {

				try {
					File f = new File(vectorMapFileName);
					ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f,false));
					out.writeObject(vectorFileMap);
					out.close();
					vectorFileMap.clear();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			@Override
			public String getName() {
				return "Revision Ngram Fusion";
			}

}
