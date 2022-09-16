package board;

import java.util.ArrayList;

import enums.GRP;
import enums.LotType;
import interfaces.IPlayer;
import player.IA;

public class Case {
	String name;
	int price;
	LotType type;
	GRP color;
	IA owner;
	boolean isOwnable;
	ArrayList<IPlayer> pList = new ArrayList<>();
	
	
	public Case(String name, int price, LotType special, GRP color) {
		super();
		this.name = name;
		this.price = price;
		this.type = special;
		this.color = color;
		this.owner = null;
		if (special == LotType.LAND) {
			this.isOwnable = true;
		}
		else {
			this.isOwnable = false;
		}
	}
	
	public Case(String name, int price, LotType special) {
		super();
		this.name = name;
		this.price = price;
		this.type = special;
		this.owner = null;
		this.isOwnable = false;
	}
	
	public void newOwner(IA p) {
		if ( this.isOwnable) {
			this.owner = p;
		}
		else {
			System.out.println("this case is not ownable");
		}
		
	}
	
	public boolean isBuyable() {
		if (this.isOwnable && this.owner == null) {
			return true;
		}
		return false;
	}
	
	public String getInfo() {
		String s="";
		String owner=" ";
		
		
		if (this.isOwnable) {
			if (this.owner != null) {
				
			}
			return this.color+"|"+this.name + " " +owner+" $"+this.price;
		}
		else {
			s+=" |"+this.name;
		}
		return s;
		
		
	}
	
	public void addVisitor(IPlayer p) {
		this.pList.add(p);
	}
	
	public void clearVisitor() {
		this.pList.clear();
	}
	
	public String VisitorsPions() {
		String s="";
		for (IPlayer p:pList) {
			s+=p.getPion();
		}
		return s;
	}
	
	public boolean hasVisitor() {
		return !this.pList.isEmpty();
	}
	
	public void show() {
		
	}
	
	public int getPrice() {
		return this.price;
	}
	
	
}
