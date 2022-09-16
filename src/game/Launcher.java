package game;

import java.util.ArrayList;

import player.IA;
import player.PlayerList;

public class Launcher {
	/*
	 * 2 � 8 joueur
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		
		PlayerList pList = new PlayerList();
		
		IA p1 = new IA("John",1500,"×");
		IA p2 = new IA("Armand",1500,"○");
		IA p3 = new IA("Paul",1500,"▲");
		
		
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
		
		Game game = new Game(pList);
		game.start();
		
		System.out.println("\n The End");
		
	}
}
