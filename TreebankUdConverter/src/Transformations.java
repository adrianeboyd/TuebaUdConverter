import java.util.ArrayList;

public class Transformations 
{
	private static Transformations instance = null;
	
	//These relations need to be specifically handled in the code, ie. not automatically
	private ArrayList<RelationTemplate> HDKONJKONJ_hdc1c2;
	private ArrayList<RelationTemplate> KONJKONJ_hdconj;
	private ArrayList<RelationTemplate> PREDPREDMOD_PREDacl;
	private ArrayList<RelationTemplate> PREDPREDMOD_PREDadvcl;
	private ArrayList<RelationTemplate> APPAPP_HDappos;
	private ArrayList<RelationTemplate> NE_HDname;
	private ArrayList<RelationTemplate> N_APP;
	private ArrayList<RelationTemplate> NX_APP;
	private ArrayList<RelationTemplate> N_SIMPX_acl;
	private ArrayList<RelationTemplate> SIMPX_advcl;
	private ArrayList<RelationTemplate> HDFM_HDforeign;
	private ArrayList<RelationTemplate> FMFM_HDforeign;
	
	//Automatically processed relations
	private ArrayList<TransformationPair> autoProcessedMultipleTemplates;
	private ArrayList<TransformationPair> autoProcessedSingleTemplates;

	private Transformations() 
	{
		initializeTemplates();
	}

	public static Transformations getInstance() 
	{
		if (instance == null)
			instance = new Transformations();
		return instance;
	}

	private void initializeTemplates() 
	{
		// *************FUNCTIONS************************
		
		// fun -
		ArrayList<String> arrayListBlank = new ArrayList<String>();
		arrayListBlank.add("-");
		
		// fun KONJ
		ArrayList<String> arrayListKONJ = new ArrayList<String>();
		arrayListKONJ.add("KONJ");
		
		// fun KONJ2
		ArrayList<String> arrayListKONJ2 = new ArrayList<String>();
		arrayListKONJ2.add("KONJ2");
		
		// fun Edge Labels in split coordinations
		ArrayList<String> arrayListAllKMod = new ArrayList<String>();
		arrayListAllKMod.add("ONK");
		arrayListAllKMod.add("OAK");
		arrayListAllKMod.add("ODK");
		arrayListAllKMod.add("OGK");
		arrayListAllKMod.add("OPPK");
		arrayListAllKMod.add("FOPPK");
		arrayListAllKMod.add("OSK");
		arrayListAllKMod.add("OADVPK");
		arrayListAllKMod.add("OA-MODK");
		arrayListAllKMod.add("MODK");
		arrayListAllKMod.add("V-MODK");

		// fun PRED
		ArrayList<String> arrayListPredFun = new ArrayList<String>();
		arrayListPredFun.add("PRED");

		// fun PRED-MOD
		ArrayList<String> arrayListPredModFun = new ArrayList<String>();
		arrayListPredModFun.add("PRED-MOD");

		// fun PRED-KOKOM
		ArrayList<String> arrayListPredKokomFun = new ArrayList<String>();
		arrayListPredKokomFun.add("PRED-KOKOM");
		
		// fun NMOD
		ArrayList<String> arrayListNModFun = new ArrayList<String>();
		arrayListNModFun.add("NMOD");

		// fun HD
		ArrayList<String> arrayListHdFun = new ArrayList<String>();
		arrayListHdFun.add("HD");

		// fun VC-HD
		ArrayList<String> arrayListVcHdFun = new ArrayList<String>();
		arrayListVcHdFun.add("VC-HD");

		// fun ON
		ArrayList<String> arrayListOnFun = new ArrayList<String>();
		arrayListOnFun.add("ON");

		// fun OS
		ArrayList<String> arrayListOsFun = new ArrayList<String>();
		arrayListOsFun.add("OS");

		// fun OA
		ArrayList<String> arrayListOaFun = new ArrayList<String>();
		arrayListOaFun.add("OA");

		// fun OD
		ArrayList<String> arrayListOdFun = new ArrayList<String>();
		arrayListOdFun.add("OD");

		// fun OG
		ArrayList<String> arrayListOgFun = new ArrayList<String>();
		arrayListOgFun.add("OG");

		// fun GEN
		ArrayList<String> arrayListGenFun = new ArrayList<String>();
		arrayListGenFun.add("GEN");

		// fun OV
		ArrayList<String> arrayListOvFun = new ArrayList<String>();
		arrayListOvFun.add("OV");
		
		// fun PARA
		ArrayList<String> arrayListParaFun = new ArrayList<String>();
		arrayListParaFun.add("PARA");
		
		// fun V-MOD
		ArrayList<String> arrayListVModFun = new ArrayList<String>();
		arrayListVModFun.add("V-MOD");

		// fun Noun MOD
		ArrayList<String> arrayListNounModFun = new ArrayList<String>();
		arrayListNounModFun.add("ON-MOD");
		arrayListNounModFun.add("OA-MOD");
		arrayListNounModFun.add("OD-MOD");
		arrayListNounModFun.add("OG-MOD");
		
		// fun ES MOD
		ArrayList<String> arrayListEsModFun = new ArrayList<String>();
		arrayListEsModFun.add("ON-MOD");
		arrayListEsModFun.add("OS-MOD");

		// fun All MOD
		ArrayList<String> arrayListAllModFun = new ArrayList<String>();
		arrayListAllModFun.add("ON-MOD");
		arrayListAllModFun.add("OA-MOD");
		arrayListAllModFun.add("OD-MOD");
		arrayListAllModFun.add("OG-MOD");
		arrayListAllModFun.add("MOD");
		arrayListAllModFun.add("OS-MOD");
		arrayListAllModFun.add("OPP-MOD");
		arrayListAllModFun.add("FOPP-MOD");
		arrayListAllModFun.add("PRED-MOD");
		arrayListAllModFun.add("OADJP-MO");
		arrayListAllModFun.add("OADVP-MO");
		arrayListAllModFun.add("V-MOD");
		arrayListAllModFun.add("MOD-MOD");

		// fun APP
		ArrayList<String> arrayListAppFun = new ArrayList<String>();
		arrayListAppFun.add("APP");
		
		// fun VPT
		ArrayList<String> arrayListVptFun = new ArrayList<String>();
		arrayListVptFun.add("VPT");
		
		// fun ES
		ArrayList<String> arrayListEsFun = new ArrayList<String>();
		arrayListEsFun.add("ES");
		
		// fun OS/ON-MOD
		ArrayList<String> arrayListOsOnModFun = new ArrayList<String>();
		arrayListOsOnModFun.add("OS-MOD");
		arrayListOsOnModFun.add("ON-MOD");
		
		// fun NEG
		ArrayList<String> arrayListNegFun = new ArrayList<String>();
		arrayListNegFun.add("NEG");

		// fun PUNCT
		ArrayList<String> arrayListPunctFun = new ArrayList<String>();
		arrayListPunctFun.add("PUNCT");

		// *************NODE NAMES************************
		// node SIMPX
		ArrayList<String> arrayListSimpxNode = new ArrayList<String>();
		arrayListSimpxNode.add("SIMPX");

		// node R-SIMPX
		ArrayList<String> arrayListRSimpxNode = new ArrayList<String>();
		arrayListRSimpxNode.add("R-SIMPX");
		
		// node P-SIMPX
		ArrayList<String> arrayListPSimpxNode = new ArrayList<String>();
		arrayListPSimpxNode.add("P-SIMPX");

		// node PX
		ArrayList<String> arrayListPxNode = new ArrayList<String>();
		arrayListPxNode.add("PX");
		
		// node NX
		ArrayList<String> arrayListNxNode = new ArrayList<String>();
		arrayListNxNode.add("NX");
		
		// node DP
		ArrayList<String> arrayListDpNode = new ArrayList<String>();
		arrayListDpNode.add("DP");

		// node ADJX
		ArrayList<String> arrayListAdjxNode = new ArrayList<String>();
		arrayListAdjxNode.add("ADJX");

		// node ADVX
		ArrayList<String> arrayListAdvxNode = new ArrayList<String>();
		arrayListAdvxNode.add("ADVX");
		
		// node WORD
		ArrayList<String> arrayListWordNode = new ArrayList<String>();
		arrayListWordNode.add("WORD");

		// *************POS************************
		// fun APPR
		ArrayList<String> arrayListAdpPos = new ArrayList<String>();
		arrayListAdpPos.add("APPR");
		arrayListAdpPos.add("APPO");
				
		// pos CARD
		ArrayList<String> arrayListCard = new ArrayList<String>();
		arrayListCard.add("CARD");
				
		// pos N*
		ArrayList<String> arrayListNPos = new ArrayList<String>();
		arrayListNPos.add("NN");
		arrayListNPos.add("NE");
		
		// pos ADJ*
		ArrayList<String> arrayListAdjPos = new ArrayList<String>();
		arrayListAdjPos.add("ADJA");
		arrayListAdjPos.add("ADJD");
		
		// pos ADJADV*
		ArrayList<String> arrayListAdjAdvPos = new ArrayList<String>();
		arrayListAdjAdvPos.add("ADJA");
		arrayListAdjAdvPos.add("ADJD");
		arrayListAdjAdvPos.add("ADV");
		
		// pos NE
		ArrayList<String> arrayListNEPos = new ArrayList<String>();
		arrayListNEPos.add("NE");
		
		// pos PPER
		ArrayList<String> arrayListPperPos = new ArrayList<String>();
		arrayListPperPos.add("PPER");
		
		// pos Determiner Pronouns
		ArrayList<String> arrayListDetPronPos = new ArrayList<String>();
		arrayListDetPronPos.add("PDAT");
		arrayListDetPronPos.add("PIDAT");
		arrayListDetPronPos.add("PIS");
		arrayListDetPronPos.add("PIAT");
		arrayListDetPronPos.add("PWAT");

		// pos ART
		ArrayList<String> arrayListArtPos = new ArrayList<String>();
		arrayListArtPos.add("ART");

		// pos PPOSAT
		ArrayList<String> arrayListPposatPos = new ArrayList<String>();
		arrayListPposatPos.add("PPOSAT");

		// pos KOUS
		ArrayList<String> arrayListKousPos = new ArrayList<String>();
		arrayListKousPos.add("KOUS");
		arrayListKousPos.add("KOUI");

		// pos FM
		ArrayList<String> arrayListFmPos = new ArrayList<String>();
		arrayListFmPos.add("FM");

		// pos KON
		ArrayList<String> arrayListKonPos = new ArrayList<String>();
		arrayListKonPos.add("KON");
		
		// pos KOKOM
		ArrayList<String> arrayListKokomPos = new ArrayList<String>();
		arrayListKokomPos.add("KOKOM");
		
		// pos PTKNEG
		ArrayList<String> arrayListPtkNegPos = new ArrayList<String>();
		arrayListPtkNegPos.add("PTKNEG");
		
		// pos PTKZU
		ArrayList<String> arrayListPtkZuPos = new ArrayList<String>();
		arrayListPtkZuPos.add("PTKZU");
		
		// pos PTKZU-PASS
		ArrayList<String> arrayListPtkZuPassPos = new ArrayList<String>();
		arrayListPtkZuPassPos.add("PTKZU-PASS");
		
		// pos PTKZU-LASS
		ArrayList<String> arrayListPtkZuLassPos = new ArrayList<String>();
		arrayListPtkZuLassPos.add("PTKZU-LASS");
		
		// pos PTKZU-ALL
		ArrayList<String> arrayListPtkZuAllPos = new ArrayList<String>();
		arrayListPtkZuAllPos.add("PTKZU");
		arrayListPtkZuAllPos.add("PTKZU-LASS");
		arrayListPtkZuAllPos.add("PTKZU-PASS");
		
		// pos PTKA
		ArrayList<String> arrayListPtkAPos = new ArrayList<String>();
		arrayListPtkAPos.add("PTKA");
		
		// pos APZR
		ArrayList<String> arrayListApzrPos = new ArrayList<String>();
		arrayListApzrPos.add("APZR");
		
		// pos ZUWORD
		ArrayList<String> arrayListZuWordPos = new ArrayList<String>();
		arrayListZuWordPos.add("PTKZU");
		arrayListZuWordPos.add("VVIZU");

		// pos Verb Infinitive
		ArrayList<String> arrayListVInfPos = new ArrayList<String>();
		arrayListVInfPos.add("VVINF");
		arrayListVInfPos.add("VVIZU");
		arrayListVInfPos.add("VAINF");
		arrayListVInfPos.add("VMINF");
		arrayListVInfPos.add("VVINF_PASS");
		arrayListVInfPos.add("VVIZU_PASS");
		arrayListVInfPos.add("VAINF_PASS");
		arrayListVInfPos.add("VMINF_PASS");
		

		// pos Verb Passive
		ArrayList<String> arrayListVerbPassivePos = new ArrayList<String>();
		arrayListVerbPassivePos.add("VVINF_PASS");
		arrayListVerbPassivePos.add("VVIMP_PASS");
		arrayListVerbPassivePos.add("VVINF_PASS");
		arrayListVerbPassivePos.add("VVIZU_PASS");
		arrayListVerbPassivePos.add("VVPP_PASS");
		arrayListVerbPassivePos.add("VAFIN_PASS");
		arrayListVerbPassivePos.add("VAIMP_PASS");
		arrayListVerbPassivePos.add("VAINF_PASS");
		arrayListVerbPassivePos.add("VAPP_PASS");
		arrayListVerbPassivePos.add("VMFIN_PASS");
		arrayListVerbPassivePos.add("VMINF_PASS");
		arrayListVerbPassivePos.add("VMPP_PASS");
		arrayListVerbPassivePos.add("PTKZU-PASS");
		
		// pos Verb Lassen
		ArrayList<String> arrayListVerbLassenPos = new ArrayList<String>();
		arrayListVerbLassenPos.add("VVINF_LASSEN");
		arrayListVerbLassenPos.add("VVIMP_LASSEN");
		arrayListVerbLassenPos.add("VVINF_LASSEN");
		arrayListVerbLassenPos.add("VVIZU_LASSEN");
		arrayListVerbLassenPos.add("VVPP_LASSEN");
		arrayListVerbLassenPos.add("VAFIN_LASSEN");
		arrayListVerbLassenPos.add("VAIMP_LASSEN");
		arrayListVerbLassenPos.add("VAINF_LASSEN");
		arrayListVerbLassenPos.add("VAPP_LASSEN");
		arrayListVerbLassenPos.add("VMFIN_LASSEN");
		arrayListVerbLassenPos.add("VMINF_LASSEN");
		arrayListVerbLassenPos.add("VMPP_LASSEN");
		arrayListVerbLassenPos.add("PTKZU-LASS");

		// KONJ
		RelationTemplate templateKONJ = new RelationTemplate(arrayListKONJ, null, null, true, false, false);
		// KONJ
		RelationTemplate templateKONJ2 = new RelationTemplate(arrayListKONJ2, null, null, true, false, false);
		// [,WORD,KON]
		RelationTemplate templateWordKON = new RelationTemplate(null, arrayListWordNode, arrayListKonPos, false, true, true);
		// KOKOM
		RelationTemplate templateKOKOM = new RelationTemplate(null, null, arrayListKokomPos, false, false, true);
		// PRED
		RelationTemplate templatePred = new RelationTemplate(arrayListPredFun, null, null, true, false, false);
		// [PRED,PX,]
		RelationTemplate templatePredPx = new RelationTemplate(arrayListPredFun, arrayListPxNode, null, true, true, false);
		// PRED-MOD
		RelationTemplate templatePredMod = new RelationTemplate(arrayListPredModFun, arrayListSimpxNode, null, true, true, false);
		// PRED-KOKOM
		RelationTemplate templatePredKokom = new RelationTemplate(arrayListPredKokomFun, null, arrayListKokomPos, true, false, true);
		// PRED-KOKOM
		RelationTemplate templateNMod = new RelationTemplate(arrayListNModFun, null, null, true, false, false);
		// [PRED,,N*]
		RelationTemplate templatePredN = new RelationTemplate(arrayListPredFun, null, arrayListNPos, true, false,
				true);
		// [,,NE]
		RelationTemplate templateNE = new RelationTemplate(null, null, arrayListNEPos, false, false,
		true);
		// [,,N*]
		RelationTemplate templateN = new RelationTemplate(null, null, arrayListNPos, false, false,
		true);
		// ON
		RelationTemplate templateON = new RelationTemplate(arrayListOnFun, null, null, true, false, false);
		// [ON,SIMPX,]
		RelationTemplate templateOnSimpx = new RelationTemplate(arrayListOnFun, arrayListSimpxNode, null, true, true,
				false);
		// [(ON-MOD, OS-MOD),,PPER]
		RelationTemplate templateEsModPper = new RelationTemplate(arrayListOsOnModFun, null, arrayListPperPos,
				true, false, true);
		// [-,,(PDAT,PIDAT,PIS,PIAT,PWAT)]
		RelationTemplate templateDetPron = new RelationTemplate(arrayListBlank, null, arrayListDetPronPos,
				true, false, true);
		// [,WORD,(PDAT,PIDAT,PIS,PIAT,PWAT)]
		RelationTemplate templateWordDetPron = new RelationTemplate(null, arrayListWordNode, arrayListDetPronPos,
				false, true, true);
		// [(ON-MOD, OA-MOD, OD-MOD, OG-MOD),SIMPX,]
		RelationTemplate templateNounModSimpx = new RelationTemplate(arrayListNounModFun, arrayListSimpxNode, null,
				true, true, false);
		// [MOD*,SIMPX,]
		RelationTemplate templateAllModSimpx = new RelationTemplate(arrayListAllModFun, arrayListSimpxNode, null, true,
				true, false);
		// [MOD*,R-SIMPX,]
		RelationTemplate templateAllModRSimpx = new RelationTemplate(null, arrayListRSimpxNode, null,
				false, true, false);
		// [ONK,OAK,ODK,...]
		RelationTemplate templateAllKMod = new RelationTemplate(arrayListAllKMod, null, null,
				true, false, false);
		// OV
		RelationTemplate templateOV = new RelationTemplate(arrayListOvFun, null, null, true, false, false);
		// [OV,,(PTKZU,VVIZU)]
		RelationTemplate templateOVZu = new RelationTemplate(arrayListOvFun, null, arrayListZuWordPos, true, false, true);
		// [OV,,PTKZU]
		RelationTemplate templateOVPtkZu = new RelationTemplate(arrayListOvFun, null, arrayListPtkZuPos, true, false, true);
		// [OV,,(V*PASSIV,PTKZU-PASS)]
		RelationTemplate templateOvPass = new RelationTemplate(arrayListOvFun, null, arrayListVerbPassivePos, true,
				false, true);
		// OA
		RelationTemplate templateOA = new RelationTemplate(arrayListOaFun, null, null, true, false, false);
		// OD
		RelationTemplate templateOD = new RelationTemplate(arrayListOdFun, null, null, true, false, false);
		// OG
		RelationTemplate templateOG = new RelationTemplate(arrayListOgFun, null, null, true, false, false);
		// GEN
		RelationTemplate templateGEN = new RelationTemplate(arrayListGenFun, null, null, true, false, false);
		// OS
		RelationTemplate templateOS = new RelationTemplate(arrayListOsFun, null, null, true, false, false);
		// VPT
		RelationTemplate templateVPT = new RelationTemplate(arrayListVptFun, null, null, true, false, false);
		// ES
		RelationTemplate templateES = new RelationTemplate(arrayListEsFun, null, null, true, false, false);
		// NEG
		RelationTemplate templateNEG = new RelationTemplate(arrayListNegFun, null, null, true, false, false);
		//APPR
		RelationTemplate templateADP = new RelationTemplate(null, null, arrayListAdpPos, false, false, true);
		//APP
		RelationTemplate templateAPP = new RelationTemplate(arrayListAppFun, null, null, true, false, false);
		// PUNCT
		RelationTemplate templatePUNCT = new RelationTemplate(arrayListPunctFun, null, null, true, false, false);
		// [OS,,(VVIZU, VVINF)]
		RelationTemplate templateOsVinf = new RelationTemplate(arrayListOsFun, null, arrayListVInfPos, true, false,
				true);
		// [,WORD,V*INF]
		RelationTemplate templateWordVInf = new RelationTemplate(null, arrayListWordNode, arrayListVInfPos, false, true, true);
		// HD
		RelationTemplate templateHD = new RelationTemplate(arrayListHdFun, null, null, true, false, false);
		// [HD,,(V*PASSIV,PTKZU-PASS)]
		RelationTemplate templateHdPass = new RelationTemplate(arrayListHdFun, null, arrayListVerbPassivePos, true,
				false, true);
		// [HD,,N*]
		RelationTemplate templateHdN = new RelationTemplate(arrayListHdFun, null, arrayListNPos, true,
				false, true);
		// [HD,,ADJ*]
		RelationTemplate templateHdAdj = new RelationTemplate(arrayListHdFun, null, arrayListAdjPos, true,
				false, true);
		// [HD,,(ADV,ADJD,ADJA)]
		RelationTemplate templateHdAdjAdv = new RelationTemplate(arrayListHdFun, null, arrayListAdjAdvPos, true,
				false, true);
		// VC-HD
		RelationTemplate templateVcHD = new RelationTemplate(arrayListVcHdFun, null, null, true, false, false);
		// [VC-HD,,(V*PASSIV,PTKZU-PASS)]
		RelationTemplate templateVcHdPass = new RelationTemplate(arrayListVcHdFun, null, arrayListVerbPassivePos, true,
				false, true);
		// [HD,,V*LASSEN]
		RelationTemplate templateHdLass = new RelationTemplate(arrayListHdFun, null, arrayListVerbLassenPos, true,
				false, true);
		// [VC-HD,,V*LASSEN]
		RelationTemplate templateVcHdLass = new RelationTemplate(arrayListVcHdFun, null, arrayListVerbLassenPos, true,
				false, true);
		// KOUS
		RelationTemplate templateKOUS = new RelationTemplate(null, null, arrayListKousPos, false, false, true);
		// [,PX,]
		RelationTemplate templatePX = new RelationTemplate(null, arrayListPxNode, null, false, true, false);
		// [,,PTKNEG]
		RelationTemplate templatePtkNeg = new RelationTemplate(null, null, arrayListPtkNegPos, false, false, true);
		// [,WORD,(PTKZU,PTKZU-LASS,PTKZU-PASS)]
		RelationTemplate templateWordPtkZuAll = new RelationTemplate(null, arrayListWordNode, arrayListPtkZuAllPos, false, true, true);
		// [,,PTKA]
		RelationTemplate templatePtkA = new RelationTemplate(null, null, arrayListPtkAPos, false, false, true);
		// [,WORD,APZR]
		RelationTemplate templateWordApzr = new RelationTemplate(null, arrayListZuWordPos, arrayListApzrPos, false, true, true);
		// [,,FM]
		RelationTemplate templateFm = new RelationTemplate(null, null, arrayListFmPos, false, false, true);
		// [,ADVX,]
		RelationTemplate templateAdvX = new RelationTemplate(null, arrayListAdvxNode, null, false, true, false);
		// [V-MOD,ADJX,]
		RelationTemplate templateVmodAdjX = new RelationTemplate(arrayListVModFun, arrayListAdjxNode, null, true, true, false);
		// [HD,ADJX,]
		RelationTemplate templateHdAdjX = new RelationTemplate(arrayListHdFun, arrayListAdjxNode, null, true, true, false);
		// [MOD*,NX,]
		RelationTemplate templateAllModNx = new RelationTemplate(arrayListAllModFun, arrayListNxNode, null, true, true, false);
		// [MOD*,NX,]
		RelationTemplate templateNX = new RelationTemplate(null, arrayListNxNode, null, false, true, false);
		// [MOD*,,]
		RelationTemplate templateAllMod = new RelationTemplate(arrayListAllModFun, null, null, true, false, false);
		// [,ADJX,CARD]
		RelationTemplate templateAdjXCard = new RelationTemplate(null, arrayListAdjxNode, arrayListCard, false, true, true);
		// [,ADJX,]
		RelationTemplate templateAdjX = new RelationTemplate(null, arrayListAdjxNode, null, false, true, false);
		// [,DP,]
		RelationTemplate templateDpX = new RelationTemplate(null, arrayListDpNode, null, false, true, false);
		// [,SIMPX,]
		RelationTemplate templateSimpx = new RelationTemplate(null, arrayListSimpxNode, null, false, true, false);
		// [,P-SIMPX,]
		RelationTemplate templatePSimpx = new RelationTemplate(null, arrayListPSimpxNode, null, false, true, false);
		// PARA
		RelationTemplate templatePara = new RelationTemplate(arrayListParaFun, null, null, true, false, false);
		// [,WORD,ART]
		RelationTemplate templateWordART = new RelationTemplate(null, arrayListWordNode, arrayListArtPos, false, true, true);
		// [,WORD,PPOSAT]
		RelationTemplate templateWordPPOSAT = new RelationTemplate(null, arrayListWordNode, arrayListPposatPos, false, true, true);

		// **********************Structures****************************//

		//Specifically handled templates
		
		//HD,KONJ,KONJ,...:HD,c1,c2,... ***
		HDKONJKONJ_hdc1c2 = new ArrayList<RelationTemplate>();
		HDKONJKONJ_hdc1c2.add(templateHD);
		HDKONJKONJ_hdc1c2.add(templateKONJ);
		HDKONJKONJ_hdc1c2.add(templateKONJ);
		
		// KONJ,KONJ,...:HD,conj,... --> First KONJ becomes head
		KONJKONJ_hdconj = new ArrayList<RelationTemplate>();
		KONJKONJ_hdconj.add(templateKONJ);
		KONJKONJ_hdconj.add(templateKONJ);
		
		//[PRED,,N*],[PRED-MOD,SIMPX,]:[PRED,,N*],acl
		PREDPREDMOD_PREDacl = new ArrayList<RelationTemplate>();
		PREDPREDMOD_PREDacl.add(templatePredN);
		PREDPREDMOD_PREDacl.add(templatePredMod);
		
		//[PRED,,],[PRED-MOD,SIMPX,]:[PRED,,],advcl
		PREDPREDMOD_PREDadvcl = new ArrayList<RelationTemplate>();
		PREDPREDMOD_PREDadvcl.add(templatePred);
		PREDPREDMOD_PREDadvcl.add(templatePredMod);
		
		//APP,...:HD,(appos,...)
		APPAPP_HDappos = new ArrayList<RelationTemplate>();
		APPAPP_HDappos.add(templateAPP);
				
		//[,,NE],...:HD,(name,...)
		NE_HDname = new ArrayList<RelationTemplate>();
		NE_HDname.add(templateNE);
		NE_HDname.add(templateNE);
		
		//[,,N*]:appos
		N_APP = new ArrayList<RelationTemplate>();
		N_APP.add(templateN);
		
		//[,NX,]:appos
		NX_APP = new ArrayList<RelationTemplate>();
		NX_APP.add(templateNX);
		
		//[HD,,N*],[,SIMPX,]:acl
		N_SIMPX_acl = new ArrayList<RelationTemplate>();
		N_SIMPX_acl.add(templateHdN);
		N_SIMPX_acl.add(templateSimpx);
		
		//[,SIMPX,]:advcl
		SIMPX_advcl = new ArrayList<RelationTemplate>();
		SIMPX_advcl.add(templateSimpx);
		
		//HD,[,,FM],[,,FM],...:HD,foreign,foreign,... ***
		HDFM_HDforeign = new ArrayList<RelationTemplate>();
		HDFM_HDforeign.add(templateHD);
		HDFM_HDforeign.add(templateFm);
		
		//[,,FM],[,,FM],...:HD,foreign,... ***
		FMFM_HDforeign = new ArrayList<RelationTemplate>();
		FMFM_HDforeign.add(templateFm);
		FMFM_HDforeign.add(templateFm);
		
		//Automatically processed templates
		
		autoProcessedMultipleTemplates = new ArrayList<TransformationPair>();
		autoProcessedSingleTemplates = new ArrayList<TransformationPair>();
		ArrayList<RelationTemplate> currentTemplate = new ArrayList<RelationTemplate>();
		ArrayList<String> currentNewRelations = new ArrayList<String>();
		
		//[HD,,(V*PASSIV,PTKZU-PASS)],PRED,OV(HD):auxpass,xcomp,HD --> take care to only convert the leftmost OV
		currentTemplate.add(templateHdPass);
		currentTemplate.add(templatePred);
		currentTemplate.add(templateOV);
		
		currentNewRelations.add("auxpass");
		currentNewRelations.add("xcomp");
		currentNewRelations.add("HD");
		
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
	
		//[HD,,(V*PASSIV,PTKZU-PASS)],PRED,VC-HD:auxpass,xcomp,HD
		currentTemplate.add(templateHdPass);
		currentTemplate.add(templatePred);
		currentTemplate.add(templateVcHD);
		
		currentNewRelations.add("auxpass");
		currentNewRelations.add("xcomp");
		currentNewRelations.add("HD");
		
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//HD,PRED,OV,[OV(HD),,(V*PASSIV,PTKZU-PASS)]:aux,xcomp,HD,auxpass
		currentTemplate.add(templateHD);
		currentTemplate.add(templatePred);
		currentTemplate.add(templateOV);
		currentTemplate.add(templateOvPass);
		
		currentNewRelations.add("aux");
		currentNewRelations.add("xcomp");
		currentNewRelations.add("HD");
		currentNewRelations.add("auxpass");
		
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//HD,PRED,OV,[VC-HD,,(V*PASSIV,PTKZU-PASS)]:aux,xcomp,HD,auxpass
		currentTemplate.add(templateHD);
		currentTemplate.add(templatePred);
		currentTemplate.add(templateOV);
		currentTemplate.add(templateVcHdPass);
		
		currentNewRelations.add("aux");
		currentNewRelations.add("xcomp");
		currentNewRelations.add("HD");
		currentNewRelations.add("auxpass");
		
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[HD,,(V*PASSIV,PTKZU-PASS)],OV:auxpass,HD
		currentTemplate.add(templateHdPass);
		currentTemplate.add(templateOV);
		
		currentNewRelations.add("auxpass");
		currentNewRelations.add("HD");
		
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[HD,,(V*PASSIV,PTKZU-PASS)],VC-HD:auxpass,HD
		currentTemplate.add(templateHdPass);
		currentTemplate.add(templateVcHD);
		
		currentNewRelations.add("auxpass");
		currentNewRelations.add("HD");
		
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//HD,PRED,[(ON-MOD, OS-MOD),,PPER],OV(HD):aux,xcomp,expl,HD
		currentTemplate.add(templateHD);
		currentTemplate.add(templatePred);
		currentTemplate.add(templateEsModPper);
		currentTemplate.add(templateOV);
		
		currentNewRelations.add("aux");
		currentNewRelations.add("xcomp");
		currentNewRelations.add("expl");
		currentNewRelations.add("HD");
		
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//HD,PRED,[(ON-MOD, OS-MOD),,PPER],VC-HD:aux,xcomp,expl,HD ***
		currentTemplate.add(templateHD);
		currentTemplate.add(templatePred);
		currentTemplate.add(templateEsModPper);
		currentTemplate.add(templateVcHD);
		
		currentNewRelations.add("aux");
		currentNewRelations.add("xcomp");
		currentNewRelations.add("expl");
		currentNewRelations.add("HD");
		
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//HD,PRED,[(ON-MOD, OS-MOD),,PPER]:HD,xcomp,expl ***
		currentTemplate.add(templateHD);
		currentTemplate.add(templatePred);
		currentTemplate.add(templateEsModPper);
		
		currentNewRelations.add("HD");
		currentNewRelations.add("xcomp");
		currentNewRelations.add("expl");
		
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//HD,PRED,OA,OV(HD):aux,xcomp,dobj,HD --> take care to only convert the leftmost OV
		currentTemplate.add(templateHD);
		currentTemplate.add(templatePred);
		currentTemplate.add(templateOA);
		currentTemplate.add(templateOV);
		
		currentNewRelations.add("aux");
		currentNewRelations.add("xcomp");
		currentNewRelations.add("dobj");
		currentNewRelations.add("HD");
		
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//HD,PRED,OA,VC-HD:aux,xcomp,dobj,HD - *
		currentTemplate.add(templateHD);
		currentTemplate.add(templatePred);
		currentTemplate.add(templateOA);
		currentTemplate.add(templateVcHD);
		
		currentNewRelations.add("aux");
		currentNewRelations.add("xcomp");
		currentNewRelations.add("dobj");
		currentNewRelations.add("HD");
		
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//HD,PRED,OA:HD,xcomp,dobj - *
		currentTemplate.add(templateHD);
		currentTemplate.add(templatePred);
		currentTemplate.add(templateOA);
		
		currentNewRelations.add("HD");
		currentNewRelations.add("xcomp");
		currentNewRelations.add("dobj");
		
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//HD,[PRED,PX,],OV(HD):aux,nmod,HD
		currentTemplate.add(templateHD);
		currentTemplate.add(templatePredPx);
		currentTemplate.add(templateOA);
				
		currentNewRelations.add("aux");
		currentNewRelations.add("nmod");
		currentNewRelations.add("HD");
				
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
				
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//HD,[PRED,PX,]:HD,nmod
		currentTemplate.add(templateHD);
		currentTemplate.add(templatePredPx);
						
		currentNewRelations.add("HD");
		currentNewRelations.add("nmod");
						
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
						
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//HD,PRED,OV,[OV,,PTKZU]:HD,xcomp,cop,aux
		currentTemplate.add(templateHD);
		currentTemplate.add(templatePred);
		currentTemplate.add(templateOV);
		currentTemplate.add(templateOVPtkZu);
						
		currentNewRelations.add("HD");
		currentNewRelations.add("xcomp");
		currentNewRelations.add("cop");
		currentNewRelations.add("aux");
						
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
						
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//HD,PRED,[OV,,PTKZU]:HD,xcomp,cop
		currentTemplate.add(templateHD);
		currentTemplate.add(templatePred);
		currentTemplate.add(templateOVPtkZu);
						
		currentNewRelations.add("HD");
		currentNewRelations.add("xcomp");
		currentNewRelations.add("cop");
						
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
						
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//HD,PRED,OV(HD):aux,HD,cop --> take care to only convert the leftmost OV
		currentTemplate.add(templateHD);
		currentTemplate.add(templatePred);
		currentTemplate.add(templateOV);
		
		currentNewRelations.add("aux");
		currentNewRelations.add("HD");
		currentNewRelations.add("cop");
		
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//HD,PRED:cop,HD - *
		currentTemplate.add(templateHD);
		currentTemplate.add(templatePred);
		
		currentNewRelations.add("cop");
		currentNewRelations.add("HD");
		
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//HD,[VC-HD,,LASSEN],OV:aux,xcomp,HD
		currentTemplate.add(templateHD);
		currentTemplate.add(templateVcHdLass);
		currentTemplate.add(templateOV);
						
		currentNewRelations.add("aux");
		currentNewRelations.add("xcomp");
		currentNewRelations.add("HD");
						
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
						
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[HD,,LASSEN],OV:HD,xcomp
		currentTemplate.add(templateHdLass);
		currentTemplate.add(templateOV);
						
		currentNewRelations.add("HD");
		currentNewRelations.add("xcomp");
						
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
						
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//HD,[OV,,(PTKZU,VVIZU)]:HD,xcomp
		currentTemplate.add(templateHD);
		currentTemplate.add(templateOVZu);
				
		currentNewRelations.add("HD");
		currentNewRelations.add("xcomp");
				
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
				
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//HD,OV:aux,HD
		currentTemplate.add(templateHD);
		currentTemplate.add(templateOV);
		
		currentNewRelations.add("aux");
		currentNewRelations.add("HD");
		
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//HD,VC-HD:aux,HD
		currentTemplate.add(templateHD);
		currentTemplate.add(templateVcHD);
		
		currentNewRelations.add("aux");
		currentNewRelations.add("HD");
		
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[,WORD,(PTKZU,PTKZU-LASS,PTKZU-PASS)],[,WORD,V*INF]:aux,HD 
		currentTemplate.add(templateWordPtkZuAll);
		currentTemplate.add(templateWordVInf);
				
		currentNewRelations.add("aux");
		currentNewRelations.add("HD");
				
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
				
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[PRED-KOKOM,,KOKOM],[HD,,N*]:HD,nmod
		currentTemplate.add(templatePredKokom);
		currentTemplate.add(templateHdN);
				
		currentNewRelations.add("HD");
		currentNewRelations.add("nmod");
				
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
				
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[PRED-KOKOM,,KOKOM],[HD,,ADJ*]:HD,amod
		currentTemplate.add(templatePredKokom);
		currentTemplate.add(templateHdAdj);
				
		currentNewRelations.add("HD");
		currentNewRelations.add("amod");
				
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
				
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//APPR,HD:case,HD
		currentTemplate.add(templateADP);
		currentTemplate.add(templateHD);
		
		currentNewRelations.add("case");
		currentNewRelations.add("HD");
		
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//(APPR,APPO),[,NX,]:case,HD
		currentTemplate.add(templateADP);
		currentTemplate.add(templateNX);
				
		currentNewRelations.add("case");
		currentNewRelations.add("HD");
				
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
				
		currentTemplate.clear();
		currentNewRelations.clear();
		
		// [HD,,(ADV,ADJD,ADJA)],[,NX,]:HD,nmod
		currentTemplate.add(templateHdAdjAdv);
		currentTemplate.add(templateNX);
				
		currentNewRelations.add("HD");
		currentNewRelations.add("nmod");
				
		autoProcessedMultipleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
				
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//		**ONE-TO-ONE TRANSFORMATIONS**
		
		//HD:HD
		currentTemplate.add(templateHD);
				
		currentNewRelations.add("HD");
				
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
				
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[,,KON]:cc
		currentTemplate.add(templateWordKON);
		
		currentNewRelations.add("cc");
		
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//KONJ2:conj
		currentTemplate.add(templateKONJ2);
						
		currentNewRelations.add("conj");
						
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
						
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//GEN:det
		currentTemplate.add(templateGEN);
		
		currentNewRelations.add("det");
		
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[VC-HD,,(V*PASSIV,PTKZU-PASS)]:auxpass
		currentTemplate.add(templateVcHdPass);
		
		currentNewRelations.add("auxpass");
		
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[VC-HD,,(LASSEN,PTKZU-LASS)]:xcomp
		currentTemplate.add(templateVcHdLass);
				
		currentNewRelations.add("xcomp");
				
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
				
		currentTemplate.clear();
		currentNewRelations.clear();		
		
		//VC-HD:aux
		currentTemplate.add(templateVcHD);
		
		currentNewRelations.add("aux");
		
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[OS,,(VVIZU, VVINF)]:xcomp
		currentTemplate.add(templateOsVinf);
		
		currentNewRelations.add("xcomp");
		
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//OS:ccomp
		currentTemplate.add(templateOS);
		
		currentNewRelations.add("ccomp");
		
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[ON,SIMPX,]:csubj
		currentTemplate.add(templateOnSimpx);
		
		currentNewRelations.add("csubj");
		
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[(ON-MOD, OA-MOD, OD-MOD, OG-MOD),SIMPX,]:acl
		currentTemplate.add(templateNounModSimpx);
		
		currentNewRelations.add("acl");
		
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[MOD*,SIMPX,]:advcl
		currentTemplate.add(templateAllModSimpx);
		
		currentNewRelations.add("advcl");
		
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[MOD*,R-SIMPX,]:acl:relcl
		currentTemplate.add(templateAllModRSimpx);
		
		currentNewRelations.add("acl:relcl");
		
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[,,(KOUS, KOUI)]:mark
		currentTemplate.add(templateKOUS);
		
		currentNewRelations.add("mark");
		
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[,PX,]:nmod
		currentTemplate.add(templatePX);
		
		currentNewRelations.add("nmod");
		
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//NMOD:nmod
		currentTemplate.add(templateNMod);
				
		currentNewRelations.add("nmod");
				
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
				
		currentTemplate.clear();
		currentNewRelations.clear();
		
		// [,,KOKOM]:case
		currentTemplate.add(templateKOKOM);

		currentNewRelations.add("case");

		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate),new ArrayList<String>(currentNewRelations)));

		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[,,PTKNEG]:neg
		currentTemplate.add(templatePtkNeg);
				
		currentNewRelations.add("neg");
				
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
				
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//NEG:neg
		currentTemplate.add(templateNEG);
										
		currentNewRelations.add("neg");
										
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
										
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[,ADVX,]:advmod
		currentTemplate.add(templateAdvX);
		
		currentNewRelations.add("advmod");
		
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[HD,ADJX,]:HD
		currentTemplate.add(templateHdAdjX);
				
		currentNewRelations.add("HD");
				
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
				
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[V-MOD,ADJX,]:advmod
		currentTemplate.add(templateVmodAdjX);
				
		currentNewRelations.add("advmod");
				
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
				
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[,ADJX,CARD]:nummod
		currentTemplate.add(templateAdjXCard);
				
		currentNewRelations.add("nummod");
				
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
				
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[,ADJX,]:amod
		currentTemplate.add(templateAdjX);
		
		currentNewRelations.add("amod");
		
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[,DP,]:det
		currentTemplate.add(templateDpX);
				
		currentNewRelations.add("det");
				
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
				
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[,,ART]:det
		currentTemplate.add(templateWordART);

		currentNewRelations.add("det");
		
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[,,PPOSAT]:poss
		currentTemplate.add(templateWordPPOSAT);
		
		currentNewRelations.add("poss");
		
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[,,PTKA]:advmod
		currentTemplate.add(templatePtkA);
						
		currentNewRelations.add("advmod");
						
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
						
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[,,APZR]:mwe
		currentTemplate.add(templateWordApzr);
								
		currentNewRelations.add("mwe");
								
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
								
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//VPT:mark
		currentTemplate.add(templateVPT);
						
		currentNewRelations.add("mark");
						
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
						
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//ES:expl
		currentTemplate.add(templateES);
								
		currentNewRelations.add("expl");
								
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
								
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[(ON-MOD, OS-MOD),,PPER]:expl
		currentTemplate.add(templateEsModPper);
		
		currentNewRelations.add("expl");
								
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
								
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[,WORD,(PDAT,PIDAT,PIS,PIAT,PWAT)]:det
		currentTemplate.add(templateWordDetPron);
		
		currentNewRelations.add("det");
								
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
								
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[-,,(PDAT,PIDAT,PIS,PIAT,PWAT)]:det
		currentTemplate.add(templateDetPron);
		
		currentNewRelations.add("det");
								
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
								
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[ONK,OAK,ODK,...]:conj
		currentTemplate.add(templateAllKMod);
				
		currentNewRelations.add("conj");
				
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
				
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//PARA:parataxis
		currentTemplate.add(templatePara);
						
		currentNewRelations.add("parataxis");
						
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
						
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[,P-SIMPX,]:parataxis
		currentTemplate.add(templatePSimpx);
								
		currentNewRelations.add("parataxis");
								
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
								
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[MOD*,NX,]:nmod
		currentTemplate.add(templateAllModNx);
						
		currentNewRelations.add("nmod");
						
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
						
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[MOD*,,]:advmod
		currentTemplate.add(templateAllMod);
								
		currentNewRelations.add("advmod");
								
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
								
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//PUNCT:punct
		currentTemplate.add(templatePUNCT);
		
		currentNewRelations.add("punct");
		
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//KONJ:HD
		currentTemplate.add(templateKONJ);
						
		currentNewRelations.add("HD");
						
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
						
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//ON:subj
		currentTemplate.add(templateON);
		
		currentNewRelations.add("subj");
		
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//OA:dobj
		currentTemplate.add(templateOA);
		
		currentNewRelations.add("dobj");
		
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//OD:iobj
		currentTemplate.add(templateOD);
		
		currentNewRelations.add("iobj");
		
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//OG:iobj
		currentTemplate.add(templateOG);
		
		currentNewRelations.add("iobj");
		
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[OV,,(V*PASSIV,PTKZU-PASS)]:auxpass
		currentTemplate.add(templateOvPass);
		
		currentNewRelations.add("auxpass");
		
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//OV:aux
		currentTemplate.add(templateOV);
		
		currentNewRelations.add("aux");
		
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
		
		currentTemplate.clear();
		currentNewRelations.clear();
		
		//[,WORD,(PTKZU,PTKZU-LASS,PTKZU-PASS)]:aux
		currentTemplate.add(templateWordPtkZuAll);
				
		currentNewRelations.add("aux");
				
		autoProcessedSingleTemplates.add(new TransformationPair(new ArrayList<RelationTemplate>(currentTemplate), new ArrayList<String>(currentNewRelations)));
				
		currentTemplate.clear();
		currentNewRelations.clear();
	}

	public ArrayList<RelationTemplate> getKONJKONJ_hdconj() 
	{
		return KONJKONJ_hdconj;
	}

	public ArrayList<RelationTemplate> getPREDPREDMOD_PREDacl() 
	{
		return PREDPREDMOD_PREDacl;
	}

	public ArrayList<RelationTemplate> getPREDPREDMOD_PREDadvcl() 
	{
		return PREDPREDMOD_PREDadvcl;
	}

	public ArrayList<TransformationPair> getAutoProcessedSingleTemplates() 
	{
		return autoProcessedSingleTemplates;
	}
	
	public ArrayList<TransformationPair> getAutoProcessedMultipleTemplates() 
	{
		return autoProcessedMultipleTemplates;
	}

	public ArrayList<RelationTemplate> getAPPAPP_HDappos() 
	{
		return APPAPP_HDappos;
	}

	public ArrayList<RelationTemplate> getNE_HDname() 
	{
		return NE_HDname;
	}

	public ArrayList<RelationTemplate> getN_APP() 
	{
		return N_APP;
	}
	
	public ArrayList<RelationTemplate> getNX_APP() 
	{
		return NX_APP;
	}

	public ArrayList<RelationTemplate> getN_SIMPX_acl() 
	{
		return N_SIMPX_acl;
	}

	public ArrayList<RelationTemplate> getSIMPX_advcl() 
	{
		return SIMPX_advcl;
	}

	public ArrayList<RelationTemplate> getHDFM_HDforeign() 
	{
		return HDFM_HDforeign;
	}

	public ArrayList<RelationTemplate> getFMFM_HDforeign() 
	{
		return FMFM_HDforeign;
	}

	public ArrayList<RelationTemplate> getHDKONJKONJ_hdc1c2()
	{
		return HDKONJKONJ_hdc1c2;
	}
}
