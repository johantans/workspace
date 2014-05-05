package Oef21;

public class Vrachtwagen extends Voertuig implements Vervuiler {

private float maxLading = 10000;
	
	public Vrachtwagen (String polishouder, float kostprijs, int pk,
			float gemVerbruik, String nummerplaat,float maxLading) { 
		super(polishouder,kostprijs,pk,gemVerbruik,nummerplaat);
		this.maxLading = maxLading; 
	}

	public double getKyotoScore() {
		double score = 0; 
		score = super.getGemVerbruik() * super.getPk() / this.maxLading / 1000; //lading in ton  
		return score;
	};
	
	@Override
	public String toString() {
		String x = super.toString();
		x = x + "  Maxlading: " + Float.toString(this.maxLading);
		return x;
	}
	
	@Override
	public void toon() { 
		System.out.println("Vrachtwagen: " + toString()); 
	}
	
	public float getMaxLading() {
		return maxLading;
	}

	public void setMaxLading(float maxLading) {
		this.maxLading = maxLading;
	}
	
	public double geefvervuiler() {
		return getKyotoScore() * 20;
	}
}
