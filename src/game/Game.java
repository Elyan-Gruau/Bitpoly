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
		// tout les joueurs lancent les d�s, celui qui � la somme la plus �lev�e commence.
		// Si doublet le joueur doit jouer une fois de plus
		// 3 doublets d'affiler -> prison
		// Si GO d�passer ou dessus dans le sens des fl�ches alors verser 200euro (salaire) sauf si il �tait avant sur la case go.
		// Ench�re peuvent commencer � n'import quel prix
		Plateau board = new Plateau();
		board.show();
	}
	
	
}
