package GenericsRekeningen;

public class ZichtRekening extends Rekening { 
	private int maxKrediet;
	
	public ZichtRekening(String rnr, int bedrag) throws RekeningException { 
	super(rnr);
	this.maxKrediet = bedrag; 
	}
	
	@Override //Is een annotation: dit komt later aan bod 
	public void afhalen(double bedrag) { 
		double testSaldo = geefSaldo() - bedrag + maxKrediet; 
		//if (testSaldo > 0) super.afhalen(bedrag); 
		if (testSaldo > 0) saldo -= bedrag; //aangepast cursus pg. 73
	}
	
	@Override //Is een annotation: dit komt later aan bod 
	public double geefSaldoOud() { 
		saldo -= 0.05;
		return saldo; 
	}

	public double geefSaldo() { 
		saldo -= 0.05;
		return saldo; 
	}
	
	@Override 
	public String toString() { 
		return super.toString() + ", " + maxKrediet; 
	/*
	 * super.toString() roept de toString() method aan van de super-class, 
	 * van Rekening dus. 
	 * Dit levert een string op en deze string wordt aangevuld 
	 * met de membervariabele van de class Zichtrekening (maxKrediet).
	 */
	}
	
	public void toon() { // cursus pg.71 
		System.out.println("Dit is een zichtrekening met een max.krediet van " + maxKrediet ); 
	
	}
	
}

