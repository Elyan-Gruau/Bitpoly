package game;

import java.util.ArrayList;

import enums.GRP;
import enums.LotType;

public class Plateau {
	ArrayList<Case> plateau = new ArrayList<>();
	
	public Plateau() {
		plateau.add(new Case("GO",0,LotType.SPECIAL));                            //0 GO
		plateau.add(new Case("Boulevard Belleville",60,LotType.LAND,GRP.VIOLET)); //1 B. Belleville
		plateau.add(new Case("Caisse commune",0,LotType.CAISSECOM));              //2 Caisse commune
		plateau.add(new Case("Rue Lecourbe",60,LotType.LAND,GRP.VIOLET));         //3 R. Lecourbe
		plateau.add(new Case("Impôt revenu",60,LotType.IMPOT_REV));               //4 IMPOT REVENU -1000
		plateau.add(new Case("Gare Monparnasse",0,LotType.GARE));                 //5 G. Monparnasse
		plateau.add(new Case("l1",100,LotType.LAND,GRP.BLEU));                    //6 R.
		plateau.add(new Case("Chance",0,LotType.GARE));                           //7 Chance
		plateau.add(new Case("l1",100,LotType.LAND,GRP.BLEU));                    //8 R.
		plateau.add(new Case("l1",120,LotType.LAND,GRP.BLEU));                    //9 R.
		
		plateau.add(new Case("l1",60,LotType.LAND));                              //10 PRISON (VISITE)
		plateau.add(new Case("l1",60,LotType.LAND,GRP.ROSE));                     //11 lot
		plateau.add(new Case("IMPOT electricité",60,LotType.IMPOT_ELEC));                        //12 IMPOT ELEC 750
		plateau.add(new Case("l1",60,LotType.LAND,GRP.ROSE));                     //13 lot
		plateau.add(new Case("l1",60,LotType.LAND,GRP.ROSE));                     //14 lot
		plateau.add(new Case("Gare 2",60,LotType.GARE));                          //15 GARE
		plateau.add(new Case("l1",60,LotType.LAND,GRP.ORANGE));                   //16 lot
		plateau.add(new Case("Caisse commune",60,LotType.CAISSECOM));                         //17 Caisse commune
		plateau.add(new Case("l1",60,LotType.LAND,GRP.ORANGE));                   //18 lot
		plateau.add(new Case("l1",60,LotType.LAND,GRP.ORANGE));                   //19 lot
		
		plateau.add(new Case("l1",60,LotType.PARC));                              //20 Parc gratuit
		plateau.add(new Case("l1",60,LotType.LAND,GRP.DORE));                //21 l1
		plateau.add(new Case("l1",60,LotType.CHANCE));                            //22 l1
		plateau.add(new Case("l1",60,LotType.LAND,GRP.DORE));                   //23 l1
		plateau.add(new Case("l1",60,LotType.LAND,GRP.DORE));                   //24 l1
		plateau.add(new Case("Gare 3",60,LotType.GARE));                              //25 l1
		plateau.add(new Case("l1",60,LotType.LAND,GRP.VERT));                   //26 l1
		plateau.add(new Case("l1",60,LotType.IMPOT_EAU));                       //27 l1
		plateau.add(new Case("l1",60,LotType.LAND,GRP.DORE));                  //28 l1
		plateau.add(new Case("l1",60,LotType.LAND,GRP.VERT));                  //29 l1
		
		plateau.add(new Case("PRISON !",60,LotType.GO_PRISON));                 //30 l1
		plateau.add(new Case("l1",60,LotType.LAND,GRP.JAUNE));                  //31 l1
		plateau.add(new Case("l1",60,LotType.LAND,GRP.JAUNE));                  //32 l1
		plateau.add(new Case("Caisse commune",60,LotType.CAISSECOM));                       //33 CaisseCOM
		plateau.add(new Case("l1",60,LotType.LAND,GRP.JAUNE));                  //34 l1
		plateau.add(new Case("Gare 4",60,LotType.GARE));                            //35 l1
		plateau.add(new Case("Chance",60,LotType.CHANCE));                          //36 l1
		plateau.add(new Case("l1",60,LotType.TAXE_LUXE));                       //37 l1
		plateau.add(new Case("l1",60,LotType.LAND,GRP.ROUGE));                  //38 l1
		plateau.add(new Case("l1",60,LotType.LAND,GRP.ROUGE));                  //39 l1
		plateau.add(new Case("l1",60,LotType.LAND,GRP.ROUGE));                  //40 l1
	}
	
	public void show() {
		System.out.println(".------------------------");
		for (Case c: plateau) {
			System.out.println( c.getInfo());
		}
	}
}
