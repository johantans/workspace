package Oef21;

public class Stookketel implements Vervuiler{

	private float cONorm;
	
	public Stookketel() {
	
	}

	public float getcONorm() {
		return cONorm;
	}

	public void setcONorm(float cONorm) {
		this.cONorm = cONorm;
	}

	public double geefvervuiler() {
		return this.cONorm * 100;
	}
}
