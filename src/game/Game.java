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
		
		this.concord();
		this.show();
	}
	
	
	
	public void show() {
		int maxP = this.getMaxPlayerPerCase();
		System.out.println(maxP);
		String pZone="";
		for (int i=0; i<maxP;i++) {
			pZone+=" ";
		}
		
		
		
		for (Case c:board.getBoard()) {
			System.out.println(pZone+"|"+c.getInfo());
		}
	}
	
	
	public void concord() {
		ArrayList<Case> b = board.getBoard();
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
