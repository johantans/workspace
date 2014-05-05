package Interfaces;

public class Werknemer implements Kost { 
	private String naam; 
	private double wedde; 
	
	public Werknemer(String naam,double wedde)	{ 
		this.naam=naam; 
		this.wedde=wedde; 
		} 
	
@Override 
public double bedragKost() { 
	return wedde; 
	} 

@Override 
public boolean personeelsKost() { 
	return true; 
	} 

public double getWedde() { 
	return wedde; } 

}
