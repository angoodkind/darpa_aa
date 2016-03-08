package features.lexical;

import static org.junit.Assert.*;

import org.junit.Test;

public class POS_PauseTest {

	

	
	@Test
	public void RunPOS_Pausetest() {
		String keyStrokes = " 0:10:65535:1336160308375:0 0:54:84:1336160308500:0 1:10:65535:1336160308562:1 1:54:84:1336160308625:1 0:48:104:1336160308640:1 1:48:104:1336160308718:2 0:45:101:1336160308781:2 0:20:32:1336160308843:3 1:45:101:1336160308875:4 1:20:32:1336160308953:4 0:4c:108:1336160309468:4 1:4c:108:1336160309562:5 0:41:97:1336160309609:5 1:41:97:1336160309734:6 0:53:115:1336160309921:6 1:53:115:1336160310062:7 0:54:116:1336160310203:7 1:54:116:1336160310312:8 0:20:32:1336160310375:8 1:20:32:1336160310468:9 0:42:98:1336160310531:9 1:42:98:1336160310609:10 0:4f:111:1336160310671:10 1:4f:111:1336160310781:11 0:4f:111:1336160310875:11 1:4f:111:1336160310968:12 0:4b:107:1336160311062:12 1:4b:107:1336160311171:13 0:20:32:1336160311562:13 1:20:32:1336160311718:14 0:49:105:1336160312796:14 1:49:105:1336160312859:15 0:20:32:1336160313203:15 1:20:32:1336160313312:16 0:52:114:1336160313390:16 0:45:101:1336160313453:17 1:52:114:1336160313484:18 0:41:97:1336160313578:18 1:45:101:1336160313609:19 1:41:97:1336160313734:19 0:44:100:1336160313750:19 1:44:100:1336160313890:20 0:20:32:1336160313921:20 1:20:32:1336160314031:21 0:57:119:1336160314109:21 1:57:119:1336160314250:22 0:41:97:1336160314281:22 1:41:97:1336160314406:23 0:53:115:1336160314453:23 1:53:115:1336160314578:24 0:20:32:1336160314687:24 1:20:32:1336160314828:25 0:10:65535:1336160315562:25 0:54:84:1336160315718:25 1:10:65535:1336160315781:26 1:54:84:1336160315843:26 0:48:104:1336160315859:26 1:48:104:1336160315937:27 0:45:101:1336160315953:27 1:45:101:1336160316109:28 0:20:32:1336160316343:28 1:20:32:1336160316484:29 0:10:65535:1336160316671:29 0:48:72:1336160316796:29 1:10:65535:1336160316875:30 0:55:117:1336160316875:30 1:48:72:1336160316890:31 1:55:117:1336160316968:31 0:4e:110:1336160317031:31 1:4e:110:1336160317140:32 0:47:103:1336160317171:32 1:47:103:1336160317218:33 0:45:101:1336160317281:33 0:52:114:1336160317375:34 1:45:101:1336160317421:35 1:52:114:1336160317546:35 0:20:32:1336160317687:35 1:20:32:1336160317796:36 0:10:65535:1336160317828:36 0:47:71:1336160317984:36 1:10:65535:1336160318093:37 1:47:71:1336160318109:37 0:41:97:1336160318234:37 1:41:97:1336160318359:38 0:4d:109:1336160318421:38 0:45:101:1336160318515:39 1:4d:109:1336160318531:40 0:53:115:1336160318656:40 1:45:101:1336160318671:41 1:53:115:1336160318843:41 0:20:32:1336160319015:41 1:20:32:1336160319109:42 0:53:115:1336160319234:42 1:53:115:1336160319359:43 0:45:101:1336160319421:43 0:52:114:1336160319562:44 1:45:101:1336160319593:45 1:52:114:1336160319703:45 0:49:105:1336160319781:45 1:49:105:1336160319906:46 0:45:101:1336160319921:46 1:45:101:1336160320062:47 0:53:115:1336160320140:47 1:53:115:1336160320281:48 0:2e:46:1336160320390:48 1:2e:46:1336160320468:49 0:20:32:1336160320656:49 1:20:32:1336160320812:50 0:10:65535:1336160321265:50 0:49:73:1336160321375:50 1:10:65535:1336160321484:51 1:49:73:1336160321500:51 0:20:32:1336160321593:51 1:20:32:1336160321703:52 0:41:97:1336160322015:52 1:41:97:1336160322109:53 0:4c:108:1336160322171:53 1:4c:108:1336160322250:54 0:53:115:1336160322375:54 1:53:115:1336160322453:55 0:4f:111:1336160322484:55 1:4f:111:1336160322593:56 0:20:32:1336160322609:56 1:20:32:1336160322718:57 0:57:119:1336160322796:57 1:57:119:1336160322937:58 0:45:101:1336160323031:58 1:45:101:1336160323125:59 0:4e:110:1336160323171:59 1:4e:110:1336160323296:60 0:54:116:1336160323312:60 1:54:116:1336160323406:61 0:20:32:1336160323437:61 1:20:32:1336160323531:62 0:54:116:1336160323562:62 0:4f:111:1336160323640:63 1:54:116:1336160323687:64 0:20:32:1336160323765:64 1:4f:111:1336160323781:65 1:20:32:1336160323875:65 0:53:115:1336160323921:65 0:45:101:1336160324062:66 1:53:115:1336160324078:67 1:45:101:1336160324203:67 0:45:101:1336160324343:67 1:45:101:1336160324453:68 0:20:32:1336160324562:68 1:20:32:1336160324640:69 0:49:105:1336160324687:69 1:49:105:1336160324828:70 0:54:116:1336160324859:70 1:54:116:1336160324984:71 0:20:32:1336160325015:71 1:20:32:1336160325125:72 0:49:105:1336160325140:72 0:4e:110:1336160325250:73 1:49:105:1336160325265:74 1:4e:110:1336160325375:74 0:20:32:1336160325375:74 1:20:32:1336160325515:75 0:54:116:1336160325515:75 1:54:116:1336160325625:76 0:48:104:1336160325640:76 0:45:101:1336160325671:77 1:48:104:1336160325734:78 0:20:32:1336160325781:78 1:45:101:1336160325812:79 1:20:32:1336160325921:79 0:4d:109:1336160325984:79 1:4d:109:1336160326093:80 0:4f:111:1336160326125:80 1:4f:111:1336160326234:81 0:56:118:1336160326546:81 1:56:118:1336160326625:82 0:49:105:1336160326703:82 0:45:101:1336160326812:83 1:49:105:1336160326828:84 1:45:101:1336160326953:84 0:53:115:1336160326953:84 1:53:115:1336160327093:85 0:2e:46:1336160327359:85 1:2e:46:1336160327422:86 0:20:32:1336160327578:86 1:20:32:1336160327718:87 0:10:65535:1336160328968:87 0:54:84:1336160329109:87 1:10:65535:1336160329171:88 0:48:104:1336160329187:88 1:54:84:1336160329218:89 1:48:104:1336160329281:89 0:45:101:1336160329328:89 0:20:32:1336160329422:90 1:45:101:1336160329437:91 1:20:32:1336160329562:91 0:42:98:1336160329765:91 1:42:98:1336160329843:92 0:4f:111:1336160329937:92 1:4f:111:1336160330015:93 0:4f:111:1336160330140:93 1:4f:111:1336160330218:94 0:4b:107:1336160330328:94 1:4b:107:1336160330421:95 0:20:32:1336160330453:95 1:20:32:1336160330562:96 0:57:119:1336160330578:96 1:57:119:1336160330656:97 0:41:97:1336160330656:97 0:53:115:1336160330780:98 1:41:97:1336160330843:99 1:53:115:1336160330921:99 0:20:32:1336160331000:99 1:20:32:1336160331125:100 0:4d:109:1336160332468:100 1:4d:109:1336160332562:101 0:55:117:1336160332687:101 1:55:117:1336160332781:102 0:43:99:1336160333031:102 1:43:99:1336160333140:103 0:48:104:1336160333156:103 1:48:104:1336160333234:104 0:20:32:1336160333250:104 1:20:32:1336160333359:105 0:42:98:1336160333421:105 1:42:98:1336160333531:106 0:45:101:1336160333562:106 1:45:101:1336160333656:107 0:54:116:1336160333750:107 1:54:116:1336160333812:108 0:54:116:1336160333906:108 1:54:116:1336160333984:109 0:45:101:1336160334031:109 0:52:114:1336160334125:110 1:45:101:1336160334187:111 1:52:114:1336160334250:111 0:20:32:1336160334281:111 1:20:32:1336160334375:112 0:54:116:1336160334390:112 1:54:116:1336160334500:113 0:41:97:1336160334531:113 0:48:104:1336160334546:114 1:48:104:1336160334609:115 1:41:97:1336160334656:115 0:4e:110:1336160334781:115 1:4e:110:1336160334906:116 0:20:32:1336160335031:116 1:20:32:1336160335125:117 0:8:8:1336160335375:117 1:8:8:1336160335437:116 0:8:8:1336160335562:116 1:8:8:1336160335609:115 0:8:8:1336160335703:115 1:8:8:1336160335765:114 0:8:8:1336160335875:114 1:8:8:1336160335890:113 0:48:104:1336160336359:113 1:48:104:1336160336437:114 0:41:97:1336160336500:114 0:4e:110:1336160336593:115 1:41:97:1336160336609:116 1:4e:110:1336160336687:116 0:20:32:1336160336703:116 1:20:32:1336160336812:117 0:54:116:1336160336828:117 0:48:104:1336160336906:118 1:54:116:1336160336921:119 1:48:104:1336160337000:119 0:20:32:1336160337062:119 0:45:101:1336160337078:120 1:45:101:1336160337140:121 1:20:32:1336160337156:121 0:8:8:1336160337687:121 1:8:8:1336160337750:120 0:8:8:1336160337843:120 1:8:8:1336160337921:119 0:45:101:1336160337968:119 1:45:101:1336160338062:120 0:20:32:1336160338109:120 1:20:32:1336160338250:121 0:4d:109:1336160338406:121 1:4d:109:1336160338500:122 0:4f:111:1336160338578:122 1:4f:111:1336160338687:123 0:56:118:1336160338937:123 1:56:118:1336160339000:124 0:49:105:1336160339046:124 1:49:105:1336160339140:125 0:45:101:1336160339218:125 1:45:101:1336160339312:126 0:20:32:1336160339437:126 1:20:32:1336160339546:127 0:42:98:1336160339640:127 1:42:98:1336160339750:128 0:55:117:1336160339781:128 1:55:117:1336160339906:129 0:8:8:1336160340155:129 1:8:8:1336160340250:128 0:45:101:1336160340421:128 1:45:101:1336160340515:129 0:43:99:1336160340937:129 1:43:99:1336160341046:130 0:41:97:1336160341125:130 1:41:97:1336160341218:131 0:55:117:1336160341640:131 1:55:117:1336160341718:132 0:53:115:1336160341750:132 0:45:101:1336160341859:133 1:53:115:1336160341906:134 1:45:101:1336160342015:134 0:20:32:1336160342437:134 1:20:32:1336160342515:135 0:54:116:1336160343609:135 1:54:116:1336160343703:136 0:48:104:1336160343718:136 1:48:104:1336160343828:137 0:45:101:1336160343859:137 1:45:101:1336160343968:138 0:20:32:1336160346750:138 1:20:32:1336160346859:139 0:44:100:1336160346937:139 1:44:100:1336160347046:140 0:49:105:1336160347312:140 1:49:105:1336160347406:141 0:52:114:1336160347468:141 1:52:114:1336160347578:142 0:45:101:1336160347640:142 1:45:101:1336160347750:143 0:43:99:1336160347906:143 1:43:99:1336160347984:144 0:54:116:1336160348156:144 1:54:116:1336160348250:145 0:4f:111:1336160348312:145 1:4f:111:1336160348406:146 0:52:114:1336160348468:146 1:52:114:1336160348578:147 0:20:32:1336160348718:147 1:20:32:1336160348843:148 0:43:99:1336160349000:148 1:43:99:1336160349046:149 0:4f:111:1336160349109:149 0:55:117:1336160349203:150 1:4f:111:1336160349218:151 1:55:117:1336160349343:151 0:4c:108:1336160349421:151 1:4c:108:1336160349515:152 0:44:100:1336160349609:152 1:44:100:1336160349734:153 0:4e:110:1336160349796:153 1:4e:110:1336160349906:154 0:54:116:1336160349953:154 1:54:116:1336160350078:155 0:20:32:1336160350140:155 1:20:32:1336160350265:156 0:47:103:1336160350484:156 1:47:103:1336160350578:157 0:45:101:1336160350625:157 0:54:116:1336160350750:158 1:45:101:1336160350765:159 0:52:114:1336160350781:159 1:52:114:1336160350812:160 1:54:116:1336160350843:160 0:20:32:1336160350953:160 1:20:32:1336160351078:161 0:8:8:1336160351812:161 1:8:8:1336160351875:160 0:8:8:1336160351968:160 1:8:8:1336160352000:159 0:20:32:1336160352265:159 1:20:32:1336160352359:160 0:41:97:1336160352390:160 1:41:97:1336160352484:161 0:4c:108:1336160352531:161 1:4c:108:1336160352578:162 0:4c:108:1336160352671:162 1:4c:108:1336160352734:163 0:20:32:1336160352796:163 1:20:32:1336160352875:164 0:54:116:1336160352906:164 0:48:104:1336160353000:165 1:54:116:1336160353015:166 1:48:104:1336160353093:166 0:45:101:1336160353109:166 0:20:32:1336160353187:167 1:45:101:1336160353203:168 1:20:32:1336160353328:168 0:44:100:1336160353968:168 1:44:100:1336160354062:169 0:45:101:1336160354187:169 1:45:101:1336160354343:170 0:54:116:1336160354437:170 1:54:116:1336160354562:171 0:41:97:1336160354640:171 1:41:97:1336160354765:172 0:49:105:1336160354859:172 1:49:105:1336160354968:173 0:4c:108:1336160355109:173 1:4c:108:1336160355203:174 0:53:115:1336160355421:174 1:53:115:1336160355515:175 0:20:32:1336160355750:175 1:20:32:1336160355859:176 0:46:102:1336160356093:176 1:46:102:1336160356203:177 0:4f:111:1336160356218:177 0:52:114:1336160356328:178 1:4f:111:1336160356343:179 1:52:114:1336160356453:179 0:4d:109:1336160356468:179 1:4d:109:1336160356562:180 0:20:32:1336160356609:180 0:54:116:1336160356671:181 1:20:32:1336160356718:182 1:54:116:1336160356781:182 0:48:104:1336160356828:182 0:45:101:1336160356859:183 1:48:104:1336160356953:184 1:45:101:1336160357000:184 0:20:32:1336160357140:184 1:20:32:1336160357296:185 0:42:98:1336160358093:185 1:42:98:1336160358156:186 0:4f:111:1336160358281:186 1:4f:111:1336160358359:187 0:4f:111:1336160358437:187 1:4f:111:1336160358531:188 0:4b:107:1336160358609:188 1:4b:107:1336160358703:189 0:20:32:1336160358734:189 1:20:32:1336160358859:190 0:49:105:1336160358875:190 1:49:105:1336160359000:191 0:4e:110:1336160359031:191 1:4e:110:1336160359156:192 0:20:32:1336160359171:192 1:20:32:1336160359281:193 0:54:116:1336160359312:193 0:48:104:1336160359406:194 1:54:116:1336160359421:195 0:45:101:1336160359500:195 1:48:104:1336160359515:196 0:20:32:1336160359562:196 1:45:101:1336160359609:197 1:20:32:1336160359703:197 0:4d:109:1336160359734:197 1:4d:109:1336160359843:198 0:4f:111:1336160359859:198 1:4f:111:1336160359968:199 0:56:118:1336160360140:199 1:56:118:1336160360234:200 0:49:105:1336160360296:200 1:49:105:1336160360406:201 0:45:101:1336160360437:201 1:45:101:1336160360562:202 0:2e:46:1336160360656:202 1:2e:46:1336160360750:203 0:20:32:1336160360875:203 1:20:32:1336160361015:204 0:10:65535:1336160361171:204 0:54:84:1336160361468:204 1:10:65535:1336160361562:205 1:54:84:1336160361593:205 0:48:104:1336160361656:205 1:48:104:1336160361750:206 0:45:101:1336160361781:206 1:45:101:1336160361890:207 0:20:32:1336160361921:207 1:20:32:1336160362046:208 0:41:97:1336160362187:208 1:41:97:1336160362328:209 0:55:117:1336160362546:209 1:55:117:1336160362640:210 0:54:116:1336160362734:210 1:54:116:1336160362828:211 0:48:104:1336160362953:211 1:48:104:1336160363078:212 0:4f:111:1336160363156:212 1:4f:111:1336160363296:213 0:52:114:1336160363515:213 1:52:114:1336160363656:214 0:20:32:1336160363859:214 1:20:32:1336160363968:215 0:44:100:1336160364625:215 1:44:100:1336160364734:216 0:49:105:1336160364750:216 1:49:105:1336160364859:217 0:44:100:1336160364875:217 1:44:100:1336160364984:218 0:20:32:1336160365031:218 1:20:32:1336160365125:219 0:41:97:1336160365234:219 1:41:97:1336160365343:220 0:20:32:1336160365375:220 1:20:32:1336160365453:221 0:47:103:1336160365500:221 0:52:114:1336160365609:222 1:47:103:1336160365640:223 0:45:101:1336160365750:223 1:52:114:1336160365781:224 0:41:97:1336160365906:224 1:45:101:1336160365921:225 0:54:116:1336160366031:225 1:41:97:1336160366062:226 1:54:116:1336160366171:226 0:20:32:1336160366203:226 1:20:32:1336160366343:227 0:4a:106:1336160367078:227 1:4a:106:1336160367218:228 0:4f:111:1336160367250:228 1:4f:111:1336160367406:229 0:42:98:1336160367578:229 1:42:98:1336160367703:230 0:20:32:1336160370750:230 1:20:32:1336160370890:231 0:57:119:1336160376218:231 1:57:119:1336160376312:232 0:49:105:1336160376312:232 1:49:105:1336160376421:233 0:54:116:1336160376453:233 0:48:104:1336160376546:234 1:54:116:1336160376578:235 1:48:104:1336160376656:235 0:20:32:1336160376671:235 1:20:32:1336160376796:236 0:44:100:1336160376921:236 1:44:100:1336160376984:237 0:45:101:1336160377062:237 1:45:101:1336160377187:238 0:54:116:1336160377265:238 1:54:116:1336160377375:239 0:41:97:1336160377484:239 1:41:97:1336160377640:240 0:49:105:1336160377656:240 1:49:105:1336160377765:241 0:4c:108:1336160377875:241 1:4c:108:1336160377984:242 0:20:32:1336160378109:242 1:20:32:1336160378187:243 0:41:97:1336160378218:243 0:4e:110:1336160378312:244 1:41:97:1336160378328:245 1:4e:110:1336160378437:245 0:44:100:1336160378453:245 1:44:100:1336160378562:246 0:20:32:1336160378593:246 1:20:32:1336160378734:247 0:49:105:1336160380437:247 1:49:105:1336160380546:248 0:4d:109:1336160380718:248 1:4d:109:1336160380828:249 0:41:97:1336160380937:249 1:41:97:1336160381093:250 0:47:103:1336160381296:250 1:47:103:1336160381390:251 0:49:105:1336160381468:251 1:49:105:1336160381562:252 0:4e:110:1336160381609:252 1:4e:110:1336160381718:253 0:41:97:1336160381843:253 1:41:97:1336160381968:254 0:54:116:1336160382125:254 1:54:116:1336160382250:255 0:49:105:1336160382265:255 0:4f:111:1336160382343:256 1:49:105:1336160382453:257 1:4f:111:1336160382515:257 0:4e:110:1336160382531:257 1:4e:110:1336160382656:258 0:2e:46:1336160382812:258 1:2e:46:1336160382906:259 0:20:32:1336160383000:259 0:10:65535:1336160383109:260 1:20:32:1336160383125:260 0:49:73:1336160383265:260 1:10:65535:1336160383375:261 1:49:73:1336160383390:261 0:8:8:1336160383828:261 1:8:8:1336160383875:260 0:10:65535:1336160384046:260 0:54:84:1336160384218:260 1:10:65535:1336160384265:261 0:48:104:1336160384328:261 1:54:84:1336160384343:262 1:48:104:1336160384437:262 0:45:101:1336160384453:262 0:20:32:1336160384546:263 1:45:101:1336160384593:264 1:20:32:1336160384671:264 0:42:98:1336160384750:264 1:42:98:1336160384859:265 0:4f:111:1336160384875:265 1:4f:111:1336160384968:266 0:4f:111:1336160385078:266 1:4f:111:1336160385140:267 0:4b:107:1336160385296:267 1:4b:107:1336160385375:268 0:20:32:1336160385390:268 1:20:32:1336160385515:269 0:49:105:1336160385531:269 1:49:105:1336160385656:270 0:53:115:1336160385671:270 0:20:32:1336160385765:271 1:53:115:1336160385781:272 1:20:32:1336160385906:272 0:41:97:1336160385953:272 1:41:97:1336160386109:273 0:42:98:1336160386265:273 1:42:98:1336160386328:274 0:4f:111:1336160386406:274 0:55:117:1336160386484:275 1:4f:111:1336160386546:276 1:55:117:1336160386625:276 0:54:116:1336160386656:276 1:54:116:1336160386765:277 0:20:32:1336160386781:277 1:20:32:1336160386890:278 0:45:101:1336160387000:278 1:45:101:1336160387140:279 0:8:8:1336160387453:279 1:8:8:1336160387515:278 0:41:97:1336160387562:278 1:41:97:1336160387703:279 0:20:32:1336160387734:279 1:20:32:1336160387828:280 0:47:103:1336160388171:280 1:47:103:1336160388265:281 0:49:105:1336160388312:281 1:49:105:1336160388437:282 0:52:114:1336160388468:282 1:52:114:1336160388562:283 0:4c:108:1336160388593:283 1:4c:108:1336160388703:284 0:20:32:1336160388812:284 1:20:32:1336160388968:285 0:57:119:1336160389671:285 1:57:119:1336160389796:286 0:48:104:1336160390046:286 1:48:104:1336160390140:287 0:4f:111:1336160390156:287 1:4f:111:1336160390296:288 0:20:32:1336160390312:288 1:20:32:1336160390437:289 0:4c:108:1336160390531:289 1:4c:108:1336160390609:290 0:49:105:1336160390718:290 1:49:105:1336160390828:291 0:56:118:1336160391015:291 1:56:118:1336160391093:292 0:45:101:1336160391156:292 1:45:101:1336160391281:293 0:53:115:1336160391296:293 1:53:115:1336160391437:294 0:20:32:1336160391453:294 1:20:32:1336160391546:295 0:49:105:1336160391578:295 0:4e:110:1336160391718:296 1:49:105:1336160391750:297 1:4e:110:1336160391843:297 0:20:32:1336160391875:297 1:20:32:1336160392000:298 0:41:97:1336160392078:298 0:20:32:1336160392203:299 1:41:97:1336160392218:300 1:20:32:1336160392328:300 0:43:99:1336160393031:300 1:43:99:1336160393140:301 0:4f:111:1336160393203:301 0:55:117:1336160393250:302 1:4f:111:1336160393281:303 1:55:117:1336160393375:303 0:4e:110:1336160393437:303 1:4e:110:1336160393562:304 0:54:116:1336160393765:304 0:52:114:1336160393875:305 1:54:116:1336160393890:306 1:52:114:1336160394015:306 0:59:121:1336160394031:306 1:59:121:1336160394125:307 0:20:32:1336160394156:307 0:54:116:1336160394234:308 1:20:32:1336160394265:309 1:54:116:1336160394375:309 0:48:104:1336160394390:309 1:48:104:1336160394500:310 0:41:97:1336160394546:310 0:54:116:1336160394656:311 1:41:97:1336160394687:312 1:54:116:1336160394750:312 0:20:32:1336160394843:312 1:20:32:1336160394953:313 0:49:105:1336160395281:313 1:49:105:1336160395375:314 0:53:115:1336160395437:314 1:53:115:1336160395531:315 0:20:32:1336160395609:315 1:20:32:1336160395718:316 0:44:100:1336160399140:316 1:44:100:1336160399234:317 0:49:105:1336160399328:317 1:49:105:1336160399406:318 0:56:118:1336160399609:318 1:56:118:1336160399687:319 0:49:105:1336160399734:319 1:49:105:1336160399859:320 0:44:100:1336160400000:320 1:44:100:1336160400109:321 0:45:101:1336160400156:321 1:45:101:1336160400265:322 0:44:100:1336160400281:322 1:44:100:1336160400422:323 0:20:32:1336160400437:323 1:20:32:1336160400531:324 0:49:105:1336160400546:324 0:4e:110:1336160400687:325 1:49:105:1336160400703:326 1:4e:110:1336160400828:326 0:20:32:1336160400843:326 1:20:32:1336160400984:327 0:31:49:1336160402031:327 0:32:50:1336160402125:328 1:31:49:1336160402156:329 1:32:50:1336160402265:329 0:20:32:1336160402359:329 1:20:32:1336160402468:330 0:44:100:1336160402921:330 1:44:100:1336160403015:331 0:49:105:1336160403296:331 1:49:105:1336160403406:332 0:53:115:1336160403531:332 1:53:115:1336160403625:333 0:54:116:1336160403828:333 1:54:116:1336160403968:334 0:52:114:1336160404046:334 1:52:114:1336160404171:335 0:49:105:1336160404359:335 1:49:105:1336160404515:336 0:43:99:1336160405250:336 1:43:99:1336160405328:337 0:54:116:1336160405500:337 1:54:116:1336160405593:338 0:53:115:1336160405828:338 1:53:115:1336160405937:339 0:20:32:1336160406406:339 1:20:32:1336160406531:340 0:41:97:1336160407734:340 1:41:97:1336160407875:341 0:4e:110:1336160407890:341 1:4e:110:1336160408000:342 0:44:100:1336160408031:342 1:44:100:1336160408140:343 0:20:32:1336160408203:343 1:20:32:1336160408312:344 0:41:97:1336160409687:344 1:41:97:1336160409843:345 0:54:116:1336160409859:345 0:20:32:1336160409968:346 1:54:116:1336160409984:347 1:20:32:1336160410078:347 0:41:97:1336160410125:347 1:41:97:1336160410265:348 0:20:32:1336160410375:348 1:20:32:1336160410515:349 0:43:99:1336160411265:349 1:43:99:1336160411359:350 0:45:101:1336160411437:350 0:52:114:1336160411515:351 1:45:101:1336160411562:352 1:52:114:1336160411640:352 0:54:116:1336160411765:352 1:54:116:1336160411875:353 0:41:97:1336160411906:353 0:49:105:1336160412046:354 1:41:97:1336160412078:355 1:49:105:1336160412156:355 0:4e:110:1336160412171:355 0:20:32:1336160412296:356 1:4e:110:1336160412312:357 0:54:116:1336160412406:357 1:20:32:1336160412421:358 1:54:116:1336160412546:358 0:49:105:1336160412562:358 1:49:105:1336160412640:359 0:4d:109:1336160412750:359 1:4d:109:1336160412875:360 0:45:101:1336160412937:360 1:45:101:1336160413062:361 0:20:32:1336160413125:361 1:20:32:1336160413250:362 0:45:101:1336160413484:362 1:45:101:1336160413593:363 0:41:97:1336160413953:363 1:41:97:1336160414062:364 0:43:99:1336160414187:364 1:43:99:1336160414296:365 0:48:104:1336160414437:365 1:48:104:1336160414546:366 0:20:32:1336160414640:366 1:20:32:1336160414765:367 0:59:121:1336160415125:367 1:59:121:1336160415234:368 0:45:101:1336160415265:368 1:45:101:1336160415406:369 0:41:97:1336160415421:369 0:52:114:1336160415531:370 1:41:97:1336160415562:371 1:52:114:1336160415656:371 0:20:32:1336160415671:371 1:20:32:1336160415796:372 0:54:116:1336160415812:372 0:48:104:1336160415921:373 1:54:116:1336160415937:374 1:48:104:1336160416031:374 0:45:101:1336160416046:374 1:45:101:1336160416125:375";
		String featureMapString = "{beforeCD=null, beforeNNS=515, afterVBP=141, afterRBR=null, beforeNNP=125, afterRBS=null, beforeVBG=null, afterVBN=163, beforeVBD=316, beforeWP=859, afterWRB=null, afterWP=156, afterVBZ=140, afterNNPS=359, afterVB=219, beforeWDT=78, afterNN=402, beforePRP=117, afterRB=109, afterJJ=156, afterIN=166, afterDT=394, beforePDT=125, beforeTO=125, beforeCC=718, afterPDT=125, afterMD=null, beforeNN=473, beforeIN=1107, beforeJJ=546, beforeRB=945, afterPRP=187, afterWDT=187, beforeMD=null, afterCC=156, afterCD=null, beforeVB=156, beforeDT=259, afterNNP=312, afterNNS=437, beforeVBN=1859, beforeNNPS=156, afterTO=125, beforeVBP=343, beforeWRB=null, afterVBG=null, afterVBD=183, beforeJJR=171, beforeRBS=null, afterJJR=156, beforeVBZ=266, afterJJS=null, beforeJJS=null, beforeRBR=null}";
		
		
		
		fail("Not yet implemented");
	}

}
