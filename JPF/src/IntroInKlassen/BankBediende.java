package IntroInKlassen;

import java.util.*;

/** 
* 
* @author jt 
*/

public class BankBediende { 

	public static void main(String[] args) { 
		double stand; 
		SpaarRekening spaar1 = new SpaarRekening("123", 5.0); //reknr en intrest
		SpaarRekening spaar2 = new SpaarRekening("888", 4.0); 
		spaar1.storten(100.0);
		stand = spaar1.geefSaldo(); 
		System.out.println("Saldo van spaar1: " + stand); 
		spaar1.overschrijven(spaar2, 80.0, new Date()); 
		stand = spaar1.geefSaldo(); 
		System.out.println("Saldo van spaar1 na overschrijving: " + stand); 
		stand = spaar2.geefSaldo(); 
		System.out.println("Rente van spaar1: " + SpaarRekening.getIntrest()); 
		System.out.println("Rente van spaar2: " + SpaarRekening.getIntrest()); 
		System.out.println("Rente voor alle spaarrekeningen: " + SpaarRekening.getIntrest());
	}
}	
