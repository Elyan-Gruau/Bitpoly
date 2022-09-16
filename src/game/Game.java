package game;

import java.util.ArrayList;

import board.Case;
import board.Plateau;
import interfaces.IPlayer;
import player.IA;
import player.PlayerList;

public class Game {
	PlayerList pList;
	Plateau board = new Plateau();
	ArrayList<IA> pPos= new ArrayList();

	public Game(PlayerList pList) {
		super();
		if (pList.hasDifferentPion() && pList.hasEnoughPlayers()) {
			pList.setBalance(1500);
			this.pList = pList;
		}
		else {
			System.out.println("PlayerList creation error");
		}
		
		
	}
	
	public void start() {
		// tout les joueurs lancent les d�s, celui qui � la somme la plus �lev�e commence.
		// Si doublet le joueur doit jouer une fois de plus
		// 3 doublets d'affiler -> prison
		// Si GO d�passer ou dessus dans le sens des fl�ches alors verser 200euro (salaire) sauf si il �tait avant sur la case go.
		// Ench�re peuvent commencer � n'import quel prix
		
	
		
		
		int manche = 4;
		for (int i=0; i<manche;i++) {
			for (interfaces.IPlayer p:pList.getList()) {
				Lancer lancer = p.lanceDes();
				p.move(lancer.sum);
				
				
				
				this.show();
			}
		}
	}
	
	
	
	public void show() {
		this.concord();
		int maxP = this.getMaxPlayerPerCase();
		//System.out.println(maxP);
		String pZone="";
		for (int i=0; i<maxP;i++) {
			pZone+=" ";
		}
		
		System.out.println("—————————————————");
		for (Case c:board.getBoard()) {
			if (c.hasVisitor()) {
				String vString =c.VisitorsPions();
				if (vString.length()<pZone.length()) {
					int dif = pZone.length()-vString.length();
					for (int i=0;i<dif;i++) {
						vString+=" ";
					}
				}
				System.out.println(vString+"|"+c.getInfo());
			}
			else {
				System.out.println(pZone+"|"+c.getInfo());
			}
			
		}
		System.out.println("—————————————————");
	}
	
	
	public void concord() { //Set the same location value for the player and the case
		ArrayList<Case> b = board.getBoard();
		for (Case c:b) {
			c.clearVisitor();
		}
		
		for (IPlayer p:pList.getList()) {
			Case c = b.get(p.getLocation());	
			c.addVisitor(p);
		}
	}
	
	public int getMaxPlayerPerCase() {
		int maxNum=0;
		ArrayList<Integer> cpt = new ArrayList<>();
		
		for (Case c:board.getBoard()) {
			cpt.add(0);
		}

		for(IPlayer p:pList.getList()) {
			int oldValue = cpt.get(p.getLocation());
			oldValue++;
			cpt.set(p.getLocation(), oldValue);
		}
		
		for (int i: cpt) {
			if (i>maxNum) {
				maxNum=i;
			}
		}
		return maxNum;
		
	}
	
}
