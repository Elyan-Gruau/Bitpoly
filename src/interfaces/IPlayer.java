package interfaces;

import board.Card;
import board.Case;
import game.Lancer;

public interface IPlayer {
	
	
	public void pay( IPlayer p,int amount);
	public void buy(Case c,int price);
	public void move(int value) ;
	public Boolean canPay(int price) ;
	public int getBalance();
	public int getLocation();
	public Card drawCard();
	public void setBalance(int value);
	public Lancer lanceDes();
	public String getPion();
	
}
