package game;

public class Game {
	PlayerList pList;

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
		Plateau board = new Plateau();
		board.show();
	}
	
	
}
