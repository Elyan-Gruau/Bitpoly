package board;

import java.util.ArrayList;

import enums.GRP;
import enums.LotType;

public class Plateau {
	ArrayList<Case> plateau = new ArrayList<>();
	
	public Plateau() {
		plateau.add(new Case("GO",0,LotType.SPECIAL));                            //0 GO
		plateau.add(new Case("Boulevard Belleville",60,LotType.LAND,GRP.A)); //1 B. Belleville
		plateau.add(new Case("Caisse commune",0,LotType.CAISSECOM));              //2 Caisse commune
		plateau.add(new Case("Rue Lecourbe",60,LotType.LAND,GRP.A));         //3 R. Lecourbe
		plateau.add(new Case("Impôt revenu",60,LotType.IMPOT_REV));               //4 IMPOT REVENU -1000
		plateau.add(new Case("Gare Monparnasse",0,LotType.GARE));                 //5 G. Monparnasse
		plateau.add(new Case("l1",100,LotType.LAND,GRP.C));                    //6 R.
		plateau.add(new Case("Chance",0,LotType.GARE));                           //7 Chance
		plateau.add(new Case("l1",100,LotType.LAND,GRP.C));                    //8 R.
		plateau.add(new Case("l1",120,LotType.LAND,GRP.C));                    //9 R.
		
		plateau.add(new Case("Prison",0,LotType.PRISON));                              //10 PRISON (VISITE)
		plateau.add(new Case("l1",520,LotType.LAND,GRP.E));                     //11 lot
		plateau.add(new Case("IMPOT electricité",60,LotType.IMPOT_ELEC));                        //12 IMPOT ELEC 750
		plateau.add(new Case("l1",420,LotType.LAND,GRP.E));                     //13 lot
		plateau.add(new Case("l1",320,LotType.LAND,GRP.E));                     //14 lot
		plateau.add(new Case("Gare 2",0,LotType.GARE));                          //15 GARE
		plateau.add(new Case("l1",130,LotType.LAND,GRP.B));                   //16 lot
		plateau.add(new Case("Caisse commune",60,LotType.CAISSECOM));                         //17 Caisse commune
		plateau.add(new Case("l1",80,LotType.LAND,GRP.B));                   //18 lot
		plateau.add(new Case("l1",110,LotType.LAND,GRP.B));                   //19 lot
		
		plateau.add(new Case("l1",60,LotType.PARC));                              //20 Parc gratuit
		plateau.add(new Case("L'Arche",60,LotType.LAND,GRP.S));                //21 l1
		plateau.add(new Case("Chance",60,LotType.CHANCE));                            //22 l1
		plateau.add(new Case("B. Labarbe",2500,LotType.LAND,GRP.S));                   //23 l1
		plateau.add(new Case("R. Dudebas",860,LotType.LAND,GRP.S));                   //24 l1
		plateau.add(new Case("Gare 3",0,LotType.GARE));                              //25 l1
		plateau.add(new Case("l1",60,LotType.LAND,GRP.V));                   //26 l1
		plateau.add(new Case("l1",60,LotType.IMPOT_EAU));                       //27 l1
		plateau.add(new Case("l1",1256,LotType.LAND,GRP.S));                  //28 l1
		plateau.add(new Case("l1",60,LotType.LAND,GRP.V));                  //29 l1
		
		plateau.add(new Case("PRISON !",0,LotType.GO_PRISON));                 //30 l1
		plateau.add(new Case("l1",300,LotType.LAND,GRP.G));                  //31 l1
		plateau.add(new Case("l1",450,LotType.LAND,GRP.G));                  //32 l1
		plateau.add(new Case("Caisse commune",60,LotType.CAISSECOM));                       //33 CaisseCOM
		plateau.add(new Case("l1",275,LotType.LAND,GRP.G));                  //34 l1
		plateau.add(new Case("Gare 4",0,LotType.GARE));                            //35 l1
		plateau.add(new Case("Chance",0,LotType.CHANCE));                          //36 l1
		plateau.add(new Case("Taxe Luxe",0,LotType.TAXE_LUXE));                       //37 l1
		plateau.add(new Case("l1",220,LotType.LAND,GRP.D));                  //38 l1
		plateau.add(new Case("l1",180,LotType.LAND,GRP.D));                  //39 l1
		plateau.add(new Case("l1",250,LotType.LAND,GRP.D));                  //40 l1
	}
	
	public void show() {
		System.out.println(".------------------------");
		for (Case c: plateau) {
			System.out.println( c.getInfo());
		}
	}

	public ArrayList<Case> getBoard() {
		return this.plateau;
	}
	

}
