package be.vdab.voorwerpen;

import be.vdab.util.IVoorwerp;

public class Leesboek  extends Boek implements IVoorwerp {

	private String onderwerp = "";
	private double winst = 0;

	public Leesboek() {
	
	}
		
	public Leesboek(String titel, String auteur, String eigenaar,
			double aankoopprijs, String genre,String onderwerp, double winst) {
		super(titel, auteur, eigenaar, aankoopprijs, genre);
		this.onderwerp = onderwerp;
		this.winst = winst;
	}
	
	@Override
	public String toString() {
		String x = super.toString();
		x = x + "  Onderwerp: " + this.onderwerp;
		x = x + "  Winst: " + Double.toString(winstBerekenen());
		return x;
	}

	@Override
	public void gegevensTonen() {
		System.out.println("Leesboek: " + toString()); 
	}

	@Override
	public double winstBerekenen() {
		return super.getAankoopprijs() * 1.5;
	}
	
	public String getOnderwerp() {
		return onderwerp;
	}

	public void setOnderwerp(String onderwerp) {
		this.onderwerp = onderwerp;
	}

	public double getWinst() {
		return winst;
	}

	public void setWinst(double winst) {
		this.winst = winst;
	}
	
}
