package player;

import board.Card;
import board.Case;



public class IA implements IPlayer{
	
	String name;
	int balance;
	String pion;
	Case oldCase = null;
	int location;
	
	
	public IA(String name, int money, String pion) {
		super();
		this.name = name;
		this.balance = money;
		this.pion = pion;
		this.location = 0;
	}
	
	public void pay(IPlayer p, int value) {
		if (this.canPay(value)) {
			this.balance -= value;
			if (p.getClass().equals(IA.class)) {
				((IA)p).balance += value;
			}
			else if (p.getClass().equals(Player.class)) {
				((Player)p).balance += value;
			}
			
		}
	}
	
	public void buy(Case c,int price) {
		if (this.canPay(c.getPrice()) && c.isBuyable()) {
			this.balance -= price;
			c.newOwner(this);
		}
	}
	
	
	public void move(int value) {
		int boardSize=40;
		
		int curPos = this.getLocation();
		if (value+curPos>boardSize-1) { //BOARD SIZE
			this.location=curPos+value-boardSize;
		}
		else {
			this.location+=value;
		}
	}
	
	public Boolean canPay(int price) {
		return balance >= price;
	}
	
	public int getBalance() {
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
	
	public int getLocation() {
		return this.location;
	}

	@Override
	public Card drawCard() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
