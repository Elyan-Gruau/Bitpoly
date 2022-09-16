package player;

import java.util.ArrayList;

public class PlayerList {
	ArrayList<IA> playerList = new ArrayList<>();
	
	
	
	public PlayerList() {
		super();
		
	}

	public void add(IA p) {
		playerList.add(p);
	}
	
	public void setBalance(int value) {
		for (IA p:playerList) {
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
	
	public ArrayList<IA> getList() {
		return playerList;
	}
}
