package Oef15;

public abstract class Voertuig {

	private String polishouder = "onbepaald";
	private float kostprijs = 0;
	private int pk = 0; 
	private float gemVerbruik = 0; 
	private String nummerplaat = "onbepaald";
	
	public Voertuig() {
	}

	public Voertuig(String polishouder, float kostprijs, int pk,
			float gemVerbruik, String nummerplaat) {
		this.polishouder = polishouder;
		this.kostprijs = kostprijs;
		this.pk = pk;
		this.gemVerbruik = gemVerbruik;
		this.nummerplaat = nummerplaat;
	}
	
	@Override
	public String toString() {
		String x = "Polis: " + this.polishouder;
		x = x + "  Kostprijs: " + Float.toString(kostprijs); 
		x = x + "  Pk: " + Integer.toString(this.pk); 
		x = x + "  Verbruik: " + Float.toString(this.gemVerbruik);
		x = x + "  Nummerplaat: " + this.nummerplaat;
		return x;
	}
	
	public abstract double getKyotoScore();
	
	
	
	public void toon() { 
		System.out.println("Voertuig: " + toString()); 
	}
	
	public String getPolishouder() {
		return polishouder;
	}

	public void setPolishouder(String polishouder) {
		this.polishouder = polishouder;
	}

	public float getKostprijs() {
		return kostprijs;
	}

	public void setKostprijs(float kostprijs) {
		this.kostprijs = kostprijs;
	}

	public int getPk() {
		return pk;
	}

	public void setPk(int pk) {
		this.pk = pk;
	}

	public float getGemVerbruik() {
		return gemVerbruik;
	}

	public void setGemVerbruik(float gemVerbruik) {
		this.gemVerbruik = gemVerbruik;
	}

	public String getNummerplaat() {
		return nummerplaat;
	}

	public void setNummerplaat(String nummerplaat) {
		this.nummerplaat = nummerplaat;
	} 
	
}