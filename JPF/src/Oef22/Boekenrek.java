package Oef22;

import Oef22.IVoorwerp;

public class Boekenrek implements IVoorwerp{

	private int hoogte = 0;
	private int breedte = 0;
	private double aankoopprijs = 0; 
	private double winst = 0; 
	
	public Boekenrek() {
	}
	
	public Boekenrek(int hoogte, int breedte, double aankoopprijs,
			double winst) {
		super();
		this.hoogte = hoogte;
		this.breedte = breedte;
		this.aankoopprijs = aankoopprijs;
		this.winst = winst;
	}

	public String toString() {
		String x = "Hoogte: " + Integer.toString(hoogte);
		x = x + "  Breedte: " + Integer.toString(breedte); 
		x = x + "  Aankoopprijs: " + Double.toString(aankoopprijs); 
		x = x + "  Winst: " + Double.toString(winstBerekenen());
		return x;
	}

	@Override
	public void gegevensTonen() {
		System.out.println("Boekenrek: " + toString()); 
	}

	@Override
	public double winstBerekenen() {
		return this.aankoopprijs * 2;
	}

	public int getHoogte() {
		return hoogte;
	}

	public void setHoogte(int hoogte) {
		this.hoogte = hoogte;
	}

	public int getBreedte() {
		return breedte;
	}

	public void setBreedte(int breedte) {
		this.breedte = breedte;
	}

	public double getAankoopprijs() {
		return aankoopprijs;
	}

	public void setAankoopprijs(double aankoopprijs) {
		this.aankoopprijs = aankoopprijs;
	}

	public double getWinst() {
		return winst;
	}

	public void setWinst(double winst) {
		this.winst = winst;
	}
	
}
