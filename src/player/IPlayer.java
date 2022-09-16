package player;

import board.Card;
import board.Case;

public interface IPlayer {
	
	
	public void pay( IPlayer p,int amount);
	public void buy(Case c,int price);
	public void move(int value) ;
	public Boolean canPay(int price) ;
	public int getBalance();
	public int getLocation();
	public Card drawCard();
	
}
