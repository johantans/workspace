package GenericsRekeningen;

import Hfst10EigenExceptions.PostNrException;


public abstract class Rekening { //abstract bijgevoegd cursus pg. 73
	private String rekeningNr; 
	protected double saldo; //protected bijgevoegd cursus pg. 73
	
	public Rekening(String rnr) throws RekeningException { 
		isReknrOk(rnr); 
		rekeningNr = rnr; 
		saldo = 0; 
	} 
	
	public void storten(double bedrag) { 
		saldo+=bedrag; 
	}
	
	public void afhalen(double bedrag) { 
		saldo-=bedrag; 
	} 
	
	public void overschrijven(Rekening rek, double bedrag) { 
		saldo-=bedrag; rek.storten(bedrag); 
	} 
	
	public double geefSaldoOud() { 
		return saldo; 
	}
	
	public abstract double geefSaldo(); 
	//abstract: childs zijn verplicht deze methode te implementeren
	//als minstens 1 abstracte methode => class is ook abstract.
	
	@Override //Is een annotation: dit komt later aan bod 
	public String toString() { 
		return rekeningNr + ", " + saldo; 
	}

	public String getRekeningNr() {
		return rekeningNr;
	}

	private void isReknrOk(String r) throws RekeningException{
			if (r.length() != 14) { 
				throw new RekeningException("Verkeerd Reknr: ",r); 
			}
	}

	public void setRekeningNr(String rekeningNr) throws RekeningException{
		this.rekeningNr=rekeningNr; 
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
