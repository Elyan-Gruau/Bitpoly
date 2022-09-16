package player;

import java.util.ArrayList;

import interfaces.IPlayer;

public class PlayerList {
	ArrayList<IPlayer> playerList = new ArrayList<>();
	
	
	
	public PlayerList() {
		super();
		
	}

	public void add(IA p) {
		playerList.add(p);
	}
	
	public void setBalance(int value) {
		for (IPlayer p:playerList) {
			
			if (p.getClass().equals(IA.class)) {
				((IA)p).setBalance(value);
			}else {
				((Player)p).setBalance(value);
			}
		}
	}
	
	public Boolean hasEnoughPlayers() {
		return playerList.size() >= 2;
	}
	
	public Boolean hasDifferentPion() {
		System.out.println("Not implemented");
		return true;
	}
	
	public ArrayList<IPlayer> getList() {
		return playerList;
	}
}
