package game;

import java.util.ArrayList;

import board.Case;
import board.Plateau;
import player.Player;
import player.PlayerList;

public class Game {
	PlayerList pList;
	Plateau board = new Plateau();
	ArrayList<Player> pPos= new ArrayList();

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
		// tout les joueurs lancent les dès, celui qui à la somme la plus élevée commence.
		// Si doublet le joueur doit jouer une fois de plus
		// 3 doublets d'affiler -> prison
		// Si GO dépasser ou dessus dans le sens des flèches alors verser 200euro (salaire) sauf si il était avant sur la case go.
		// Enchère peuvent commencer à n'import quel prix
		
	
		this.show();
		pList.getList().get(0).move(3);
	
		this.show();
		pList.getList().get(1).move(30);
		
		this.show();
		
		pList.getList().get(1).move(11);
		
		this.show();
	}
	
	
	
	public void show() {
		this.concord();
		int maxP = this.getMaxPlayerPerCase();
		//System.out.println(maxP);
		String pZone="";
		for (int i=0; i<maxP;i++) {
			pZone+=" ";
		}
		
		System.out.println("·——·——————————————·");
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
		System.out.println("·——·——————————————·");
	}
	
	
	public void concord() { //Set the same location value for the player and the case
		ArrayList<Case> b = board.getBoard();
		for (Case c:b) {
			c.clearVisitor();
		}
		
		for (Player p:pList.getList()) {
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

		for(Player p:pList.getList()) {
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
