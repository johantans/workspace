package IntroInKlassen;

import java.util.*;
/** 
* 
* * @author slucas */

public class SpaarRekening { 

private String rekeningNummer; 
private double saldo; 
private static double intrest; // static omdat intrest meestal dezelfde is voor alle rekeningen. 

/** Creates a new instance of SpaarRekening */ 

public SpaarRekening(String reknr, double intrest) { 
	rekeningNummer = reknr; 
	SpaarRekening.intrest = intrest; 
	saldo = 0; 
} 

public void storten (double bedrag) { 
	saldo += bedrag; 
} 

public void afhalen (double bedrag) { 
	saldo -= bedrag; 
} 

public void overschrijven(SpaarRekening spaarRek, double bedrag, Date datum) { 
saldo -= bedrag; 
spaarRek.storten(bedrag); 
} 

public double geefSaldo() { 
	return saldo; 
}

public String getRekeningNummer() {
	return rekeningNummer;
}

public void setRekeningNummer(String rekeningNummer) {
	this.rekeningNummer = rekeningNummer;
}

public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

public static double getIntrest() {
	return intrest;
}

public void setIntrest(double intrest) {
	this.intrest = intrest;
} 

private boolean checkNummer(String reknr) {
	//we gaan ervan uit dat het rekeningnummer wordt aangeboden in de vorm xxx-xxxxxxx-xx 
	int d1=Integer.parseInt(reknr.substring(0,3)); //(1) 
	int d2=Integer.parseInt(reknr.substring(4,11)); 
	int d3=Integer.parseInt(reknr.substring(12,14)); 
	long deeltal=d1 * 10000000L + d2; //(2) 
	int rest=(int)(deeltal % 97); //(3) 
	if (rest==0) {
		rest=97; //(4)
		}
	return (rest==d3); //(5) 
	}

private boolean checkNummer2(String reknr) {
	//we gaan ervan uit dat het rekeningnummer wordt aangeboden in de vorm xxx-xxxxxxx-xx 
	String deeltalString = reknr.substring(0,3) + reknr.substring(4,11); 
	long deeltal=Long.parseLong(deeltalString); 
	int d3=Integer.parseInt(reknr.substring(12,14)); 

	int rest=(int)(deeltal % 97); //(3) 
	if (rest==0) {
		rest=97; //(4)
		}
	return (rest==d3); //(5) 
	}

}