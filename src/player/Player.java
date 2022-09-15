package player;

import game.Case;

public class Player {
	
	String name;
	int balance;
	String pion;
	Case oldCase = null;
	
	
	public Player(String name, int money, String pion) {
		super();
		this.name = name;
		this.balance = money;
		this.pion = pion;
	}
	
	public void pay(Player p, int value) {
		if (this.canPay(value)) {
			this.balance -= value;
			p.balance += value;
		}
	}
	
	public void buy(Case c,int price) {
		if (this.canPay(c.getPrice()) && c.isBuyable()) {
			this.balance -= price;
			c.newOwner(this);
		}
	}
	
	public Boolean canPay(int price) {
		return balance >= price;
	}
	
	public int getMoney() {
		return balance;
	}
	
	public void setMoney(int money) {
		this.balance = money;
	}
	
	public String getPion() {
		return pion;
	}
	
	public void setPion(String pion) {
		this.pion = pion;
	}
	
	
	
}
