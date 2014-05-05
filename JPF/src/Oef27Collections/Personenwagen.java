package Oef27Collections;

public class Personenwagen extends Voertuig implements Vervuiler {

	private int deuren = 4;
	private int passagiers = 5;

	public Personenwagen (String polishouder, float kostprijs, int pk,
			float gemVerbruik, String nummerplaat,int deuren, int passagiers) { 
		super(polishouder,kostprijs,pk,gemVerbruik,nummerplaat);
		this.deuren = deuren;
		this.passagiers = passagiers; 
	}
	
	public double getKyotoScore() {
		double score = 0; 
		score = super.getGemVerbruik() * super.getPk() / this.passagiers;   
		return score;
		
	};
	
	@Override
	public String toString() {
		String x = super.toString();
		x = x + "  Aantal deuren: " + Integer.toString(this.deuren);
		x = x + "  Aantal passagiers: " + Integer.toString(this.passagiers);
		return x;
	}
	
	@Override
	public void toon() { 
		System.out.println("Personenwagen: " + toString()); 
	}

	public int getDeuren() {
		return deuren;
	}


	public void setDeuren(int deuren) {
		this.deuren = deuren;
	}


	public int getPassagiers() {
		return passagiers;
	}


	public void setPassagiers(int passagiers) {
		this.passagiers = passagiers;
	}
	
	public double geefvervuiler() {
		return getKyotoScore() * 5;
	}
	
}
