package Oef25ExceptionHandling;

import java.text.DecimalFormat;

public class BankBediende { 
	
	public static void main(String[] args) { 
		DecimalFormat fmt = new DecimalFormat("#,##0.00");
		Rekening[] rekeningen = new Rekening[10];
		
		System.out.println("Opbouw array in Bankbediende(main): ");
		System.out.println("");
		
		try { 
			rekeningen[0] =	new SpaarRekening("BE12 3456 7890 1234", 2.5);
			rekeningen[0].storten(100.0); 
			System.out.println("Rekening: " + rekeningen[0].getRekeningNr() + " toegevoegd");
		}
		catch (RekeningException e) { 
				System.out.println(e.getMessage() + ": " + e.getVerkeerdReknr()); 
		} 
			
		try { 
			rekeningen[1] = new ZichtRekening("BE98 7654 3210 986", 1000); 
			rekeningen[1].storten(200.0); 
			rekeningen[1].afhalen(50.0); 
			System.out.println("Rekening: " + rekeningen[1].getRekeningNr() + " toegevoegd");
		}
		catch (RekeningException e) { 
				System.out.println(e.getMessage() + ": " + e.getVerkeerdReknr()); 
		} 
		
		try { 
			rekeningen[2] =	new SpaarRekening("BE12 3456 7890 1324", 99.45);
			rekeningen[2].storten(100.0); 
			System.out.println("Rekening: " + rekeningen[2].getRekeningNr() + " toegevoegd");
		}
		catch (RekeningException e) { 
				System.out.println(e.getMessage() + ": " + e.getVerkeerdReknr()); 
		} 
		
		System.out.println(""); 
		System.out.println("Overlopen array: ");
		System.out.println(""); 
		
		for (int i=0;i<rekeningen.length;i++) { 
			if (rekeningen[i] != null) System.out.println("Saldo van de rekening: " + fmt.format(rekeningen[i].geefSaldo()));
		}
		}
	
	/* op commentaar gezet bij inbouwen errorhandler

	public static void mainOud1(String[] args) { 
		SpaarRekening spaar = new SpaarRekening("BE12 3456 7890 1234", 2.5); //2,5 is intrest
		ZichtRekening zicht = new ZichtRekening("BE98 7654 3210 9876", 1000); // 1000 = max.krediet
		spaar.storten(100.0); 
		zicht.storten(200.0); 
		zicht.afhalen(50.0); 
		System.out.println("Saldo van de spaarrekening: " + spaar.geefSaldo()); 
		System.out.println("Saldo van de zichtrekening: " + zicht.geefSaldo()); 
			
		zicht.afhalen(2000); 
		System.out.println
		( "Saldo van de zichtrekening (na poging " + "afhalen 2000): " 
		+ zicht.geefSaldo());
	} 
	
	public static void mainOud2(String[] args) { //cursus pg 74
		DecimalFormat fmt = new DecimalFormat("#,##0.00"); 
		SpaarRekening spaar = new SpaarRekening("BE12 3456 7890 1234", 2.5);
		ZichtRekening zicht = new ZichtRekening("BE98 7654 3210 9876", 1000); 
		spaar.storten(100.0); 
		zicht.storten(200.0); 
		zicht.afhalen(50.0); 
		System.out.println("Saldo van de spaarrekening: " + spaar.geefSaldo());
		System.out.println("Saldo van de zichtrekening: " + fmt.format(zicht.geefSaldo())); 
		zicht.afhalen(2000); 
		System.out.println("Saldo van de zichtrekening " + "(na poging afhalen 2000): " + fmt.format(zicht.geefSaldo())); 
	}
	*/
}
