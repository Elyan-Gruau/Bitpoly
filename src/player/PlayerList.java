package player;

import java.util.ArrayList;

public class PlayerList {
	ArrayList<Player> playerList = new ArrayList<>();
	
	
	
	public PlayerList() {
		super();
		
	}

	public void add(Player p) {
		playerList.add(p);
	}
	
	public void setBalance(int value) {
		for (Player p:playerList) {
			p.setMoney(value);
		}
	}
	
	public Boolean hasEnoughPlayers() {
		return playerList.size() >= 2;
	}
	
	public Boolean hasDifferentPion() {
		System.out.println("Not implemented");
		return true;
	}
	
	public ArrayList<Player> getList() {
		return playerList;
	}
}
