package game;

import java.util.Random;

public class Lancer {
	int d1 ;
	int d2;
	int sum;
	boolean doublette;
	boolean max;
	
	public Lancer() {
		this.d1 = new Random().nextInt(1,7);
		this.d2 = new Random().nextInt(1,7);
		this.sum = this.d1 + this.d2;
		this.doublette = d1 == d2;
		this.max = doublette && sum == 12;	
		System.out.println("D1 -> "+d1);
		System.out.println("D2 -> "+d2);
		System.out.println("sum -> "+sum);
		
	}
	
	
	
	
	
	
}
