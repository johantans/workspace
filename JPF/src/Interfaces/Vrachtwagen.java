package Interfaces;

public class Vrachtwagen implements Kost, Afschrijving { 
	
	private String merk; 
	private double kostPerKm; 
	private int aantalKm;
	private double aankoopPrijs;
	private int voorzieneLevensduur; 
	
	public Vrachtwagen(String merk,double kostPerKm,int aantalKm, double aankoopPrijs,int voorzieneLevensduur) {
		this.merk=merk;
		this.kostPerKm=kostPerKm;
		this.aantalKm=aantalKm; 
		this.aankoopPrijs=aankoopPrijs; 
		this.voorzieneLevensduur=voorzieneLevensduur; }
	
@Override public double bedragKost() { 
	return kostPerKm*aantalKm; }

@Override public boolean personeelsKost() { 
	return false; }

@Override public int termijn() {
	return voorzieneLevensduur; } 

@Override public double jaarlijksBedrag() { 
	return aankoopPrijs/voorzieneLevensduur; } 

public int getAantalKm() { 
	return aantalKm; }
}
