package player;

import board.Card;
import board.Case;

public class Player implements IPlayer{

	String name;
	int balance;
	String pion;
	Case oldCase = null;
	int location;

	@Override
	public void pay(IPlayer p, int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buy(Case c, int price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean canPay(int price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLocation() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Card drawCard() {
		// TODO Auto-generated method stub
		return null;
	}

}
