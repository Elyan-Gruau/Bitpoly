package game;

import java.util.ArrayList;

import player.Player;
import player.PlayerList;

public class Launcher {
	/*
	 * 2 à 8 joueur
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		
		PlayerList pList = new PlayerList();
		
		Player p1 = new Player("John",1500,"X");
		Player p2 = new Player("Armand",1500,"O");
		
		
		pList.add(p1);
		pList.add(p2);
		
		
		Game game = new Game(pList);
		game.start();
		
		System.out.println("\n The End");
		
	}
}
