package game;

import enums.GRP;
import enums.LotType;
import player.Player;

public class Case {
	String name;
	int price;
	LotType type;
	GRP color;
	Player owner;
	
	
	public Case(String name, int price, LotType special, GRP color) {
		super();
		this.name = name;
		this.price = price;
		this.type = special;
		this.color = color;
		this.owner = null;
	}
	
	public Case(String name, int price, LotType special) {
		super();
		this.name = name;
		this.price = price;
		this.type = special;
		this.owner = null;
	}
	
	public void newOwner(Player p) {
		this.owner = p;
	}
	
	public boolean isBuyable() {
		System.out.println("Not implemented");
		return true;
	}
	
	public String getInfo() {
		return this.name + " " + this.owner;
	}
	
	public void show() {
		
	}
	
	public int getPrice() {
		return this.price;
	}
	
	
}
