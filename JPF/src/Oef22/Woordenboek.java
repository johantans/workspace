package Oef22;

public class Woordenboek  extends Boek implements IVoorwerp {

	private String taal = "";
	private double winst = 0;

	public Woordenboek() {
	
	}
		
	public Woordenboek(String titel, String auteur, String eigenaar,
			double aankoopprijs, String genre,String taal, double winst) {
		super(titel, auteur, eigenaar, aankoopprijs, genre);
		this.taal = taal;
		this.winst = winst;
	}
	
	@Override
	public String toString() {
		String x = super.toString();
		x = x + "  taal: " + this.taal;
		x = x + "  Winst: " + Double.toString(winstBerekenen());
		return x;
	}

	@Override
	public void gegevensTonen() {
		System.out.println("Woorden: " + toString()); 
	}

	@Override
	public double winstBerekenen() {
		return super.getAankoopprijs() * 1.75;
	}
	
	public String getTaal() {
		return taal;
	}

	public void setTaal(String taal) {
		this.taal = taal;
	}

	public double getWinst() {
		return winst;
	}

	public void setWinst(double winst) {
		this.winst = winst;
	}
	
}
