package Inheritance;

public class SpaarRekening extends Rekening { 
	private static double intrest; 
	
	public SpaarRekening(String rnr, double intrest) throws RekeningException { 
		super(rnr); 
		this.intrest = intrest; 
	} 
	
	//public double geefSaldoOud() { 
	//	double rente = berekenRenteOud(); 
	//	storten(rente); 
	//	return super.geefSaldo(); 
	//} 
	
	//private double berekenRenteOud () { 
	//	double saldo = super.geefSaldo(); 
	//	return saldo * intrest / 100.0; 
	//}
		
	public double geefSaldo() { //aangepast cursus pg. 73
		double rente = berekenRente(); 
		saldo += rente; 
		return saldo; 
	} 
	
	private double berekenRente() { 
		return saldo * intrest / 100.0;
	};
	
	
	
	@Override 
	public String toString() { 
		return super.toString() + ", " + intrest; 
	/*
	 * super.toString() roept de toString() method aan van de super-class, 
	 * van Rekening dus. 
	 * Dit levert een string op en deze string wordt aangevuld 
	 * met de membervariabele van de class SpaarRekening (intrest).
	 */
	}
	
	public void toon() { // cursus pg.71 
		System.out.println("Dit is een spaarrekening waarop " + intrest + 
		"% intrest gegeven wordt."); }
}

