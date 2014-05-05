package Interfaces;

public class Kopieermachine implements Kost { 
	private String merk; 
	private double kostPerBlz; 
	private int aantalBlz; 
	
	public Kopieermachine(String merk,double kostPerBlz,int aantalBlz) { 
		this.merk=merk; 
		this.kostPerBlz=kostPerBlz; 
		this.aantalBlz=aantalBlz; 
	} 
	
@Override public double bedragKost() { 
	return kostPerBlz*aantalBlz; 
	} 

@Override 
public boolean personeelsKost() { 
	return false; 
	} 

public int getAantalBlz() { 
	return aantalBlz; 
	}
}
