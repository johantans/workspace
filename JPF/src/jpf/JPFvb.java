package jpf;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import be.vdab.voertuigen.Voertuig;

public class JPFvb {
	
	private static final String WAGENPARKLIJST = "c:/JohanTans/wagenpark.ser";
	
	public static void main (String[] args) throws DatumException, InterruptedException {
		
		/**
		 * Dit is documentatie-commentaar (slash met 2x ster)  
		 */
				
		/* Dit is gewone commentaar 
		 * commentaat tot hier  
		 * dit kunnen meerdere lijnen zijn 
		*/
		
		// Dit is 1 lijn commentaar 
		
		/*
		Tip Indien in vorige lijn 1 slash bijgeplaatst wordt, 
		wordt de code inee uitvoerbaar: handig dus om code te testen       
		//*/
				
		//Nu volgen oef uit de cursus JPF 
		//body();
		//btw();
		//bank();
		//Nu volgen oef uit de oefeningen JPF 
		//oef2();
		//oef3();
		//oef4(); 
		//copyArray();
		//oef5(); 
		//oef6();
		//oef7();
		//oef8();
		//oef9();
		//showTreeSet();
		//StreamsTryout();
		DatumBehandeling();
	}
	
	private static void DatumBehandeling() throws DatumException, InterruptedException { 
		//System.out.print("Geef datum (dd/MM/yyyy):"); 
		//Scanner sc = new Scanner(System.in);
		//String datumString = sc.next(); 
		//DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Datum dt = new Datum(1,1,1981);
		Werknemer wn = new Werknemer("Jan",dt);
		// Print wn1
		System.out.println("Werknemer1: " + wn);
		dt = new Datum(8,4,1974);
		Werknemer wn2 = new Werknemer("Piet",dt);
		// Print wn2
		System.out.println("Werknemer2: " + wn2);
		//try { Thread.sleep(2000L);
		//	} catch (Exception ex) { 
		//	System.out.println(ex.toString());
		//	}
		dt = new Datum(30,4,1972);
		Werknemer wn3 = new Werknemer("Claas",dt);
		// Print wn3
		System.out.println("Werknemer3: " + wn3);
		dt = new Datum(29,2,1984);
		Werknemer wn4 = new Werknemer("Walter",dt);
		// Print wn4
		System.out.println("Werknemer4: " + wn4);
	}
	
	public static void StreamsTryout() { 
		FileInputStream file = null; 
		ObjectInputStream obj = null; 
		try { //een nieuwe fileInputstream en objectInputstream maken 
			file = new FileInputStream(WAGENPARKLIJST); 
			obj = new ObjectInputStream(file); 
			Voertuig[] xx = (Voertuig[]) obj.readObject(); 
			for (Voertuig x : xx) {
				System.out.print(x.toString());
				} 
		} catch (Exception ex) { 
			System.out.println(ex.toString()); 
		} 
		finally { //de file sluiten 
			if (obj != null) {
				try { obj.close(); 
				} 
				catch (IOException ex) { 
					System.out.println(ex.getMessage()); 
				} 
			}
		}
	} 
				
private static void showTreeSet() {
		
	System.out.print("Set op basis van TreeSet"); 
	SortedSet<String> ts = new TreeSet<String>(); 
	vul(ts); 
	//Object oj = ts.first();
	System.out.println();
	System.out.println(ts.first());
	System.out.println(ts.last());
	SortedSet subs = ts.subSet("b","e");
	System.out.println("subset van b tot e:");
	toon(subs); 
	System.out.println();
	System.out.println("volledige treeset:");
	toon(ts); 
	}

private static void vul(Set<String> s) { 
	s.add("fiets"); 
	s.add("even"); 
	s.add("dak"); 
	s.add("citroen"); 
	s.add("boom"); 
	s.add("aap"); 
	}	

private static void toon(Set s) { 
	System.out.println(); 
	for ( Object obj : s) {
		System.out.println(obj); 
		} 
	}

private static void oef9() {
		
		System.out.println ("");
		System.out.println ("Oef.10  oefenmap pg.7: ");
		
		
		int dieren;
		
		
		Scanner sc = new Scanner(System.in);
		dieren  = sc.nextInt();
		
		switch (dieren) {
		
		case 1:
			System.out.println ("1 diertje = geen diertje");
			break;
		case 2:
			System.out.println ("2 diertjes gaat al");
			break;
		case 3:
			System.out.println ("3 diertjes = echte dierenvriend");
			break;
		default:
			System.out.println ("dierentuin?");	
			
		}
		
	}			

private static void oef8() {
	
	System.out.println ("");
	System.out.println ("Oef.8  oefenmap pg.7: ");
	
	int [] getal;
	getal = new int [100];
	double rd;  
	int i = 0;
	int j = 0;
	int hp; 
	
	while (i < getal.length) {
		rd = Math.random() * 1000; 
		getal[i] = (int)(rd) + 1;
		i++;	
	}
	
	for  (i = 0; i < getal.length -1; i++) {
		for  (j = i+1; j < getal.length; j++) {
			if (getal[j] < getal[i]) {
				hp = getal[i];
				getal[i] = getal[j];
				getal[j] = hp;
			}
		}
	}

	for  (i = 0; i < getal.length-1; i++) {
		System.out.println ("element " + i + ": " + getal[i]);	
	}
}			


private static void oef7() {
	
	System.out.println ("");
	System.out.println ("Oef.7  oefenmap pg.7: ");
	
	int [] getal;
	int [] voorkomen;
	getal = new int [10000];
	voorkomen = new int [100];
	double rd;  
	int rdInt = 0;
	
	int i = 0;
	while (i < getal.length) {
		rd = Math.random() * 100; 
		rdInt = (int)(rd); //random gaat van 0 tot 100, daarom + 1
		getal[i] = (int)(rd) + 1;
		voorkomen[rdInt] = voorkomen[rdInt] + 1;
		i++;	
	}
	
	i = 0; 
	int j = 1;
	while (i < voorkomen.length) {
		j = i + 1;
		System.out.println ("element " + j + ": " + voorkomen[i]);	
		i++;
	}
}			

private static void oef6() {
		
		System.out.println ("");
		System.out.println ("Oef.6  oefenmap pg.7: ");
		
		int [] getal;
		getal = new int [5];
		double rd;  
		int tot = 0;
		
		int i = 0;
		while (i < getal.length) {
			rd = Math.random() * 100; 
			getal[i] = (int)(rd);
			tot = tot + getal[i];
			i++;	
		}
		
		i = 0; 
		while (i < 5) {
			System.out.println ("element" + i + ": " + getal[i]);	
			i++;
		}
		System.out.println ("Gemiddelde = " + tot / getal.length);	
	}		
	
private static void oef5() {
		
		System.out.println ("");
		System.out.println ("Oef.5  oefenmap pg.6: ");
		
		int [] getal;
		getal = new int [5];
		double rd;  
		int tot = 0;
		
		int i = 0;
		while (i < 5) {
			rd = Math.random() * 100; 
			getal[i] = (int)(rd);
			tot = tot + getal[i];
			i++;	
		}
		
		i = 0; 
		while (i < 5) {
			System.out.println ("element" + i + ": " + getal[i]);	
			i++;
		}
		System.out.println ("Gemiddelde = " + tot / getal.length);	
	}	
	
private static void copyArray() {

	String [] personen;
	String [] personen2;
	
	personen = new String [20];
	personen2 = new String [25];
	int i = 0;
	while (i < 20) {
		personen[i] = "AA";
		i++;	
	}
	i = 0; 
	while (i < 25) {
		personen2[i] = "BB";
		i++;	
	}
	
	System.arraycopy(personen2, 0, personen, 0, personen.length - 1);
	
	// reference van de grotere tabel laten verwijzen naar de kleinere en verder werken met de kleinere.
	// de eerste tabellen heeft nu dus 25 elementen ipv 20.  
	personen = personen2;
	personen2 = null; 
	
	i = 0; 
	while (i < 25) {
		System.out.println ("element" + i + ": " + personen[i]);	
		i++;
	}
	
}
	
	private static void oef4() {
		
		System.out.println ("");
		System.out.println ("Oef.4  oefenmap pg.5: ");
		
		System.out.println ("Geef geheel aantal seconden: ");
		Scanner sc = new Scanner(System.in);
		long  seconden = sc.nextLong();
		long uur = 3600L;
		long min = 60L; 
		// uren  
		long rest = seconden % uur;
		long uren  = (seconden - rest) / uur;
		System.out.println ("uren:" + uren);		
		// min  
		long minuten = rest;
		rest =  minuten %  min; 
		minuten = (minuten - rest) / min;
		System.out.println ("min:" + minuten);		
		// sec
		System.out.println ("seconden:" + rest);		
	}
	
	private static void oef3() {
		
		System.out.println ("");
		System.out.println ("Oef.3  oefenmap pg.5: ");
		
		System.out.println ("Geef bedrag met max 2 decimalen: ");
		Scanner sc = new Scanner(System.in);
		float bedrag = sc.nextFloat();
		bedrag = bedrag * 100F;
		// 2 euro 
		long bedragx = (long)(bedrag);
		long rest = bedragx % 200L;
		long euro200 = (bedragx - rest) / 200L;
		System.out.println ("2 euro-stukken:" + euro200);		
		// 1 euro 
		bedragx = rest;
		rest =  bedragx % 100L; 
		long euro100 = (bedragx  - rest) / 100L;
		System.out.println ("1 euro-stuk:" + euro100);		
		// 50 cent 
		bedragx = rest;
		rest =  bedragx % 50L; 
		long euro50 = (bedragx  - rest) / 50L;
		System.out.println ("50 cent-stukken:" + euro50);		
		// 20 cent 
		bedragx = rest;
		rest =  bedragx % 20L; 
		long euro20 = (bedragx  - rest) / 20L;
		System.out.println ("20 cent-stukken:" + euro20);	
		// 10 cent 
		bedragx = rest;
		rest =  bedragx % 10L; 
		long euro10 = (bedragx  - rest) / 10L;
		System.out.println ("10 cent-stukken:" + euro10);	
		// 5 cent 
		bedragx = rest;
		rest =  bedragx % 5L; 
		long euro5 = (bedragx  - rest) / 5L;
		System.out.println ("5 cent-stukken:" + euro5);	
		// 2 cent 
		bedragx = rest;
		rest =  bedragx % 2L; 
		long euro2 = (bedragx  - rest) / 2L;
		System.out.println ("2 cent-stukken:" + euro2);	
		// 1 cent 
		System.out.println ("1 cent-stuk:" + rest);	
	}
	
private static void oef2() {
		
		System.out.println ("");
		System.out.println ("Oef.2  oefenmap pg.5: ");
		
		byte vak1 = 8;
		byte vak2 = 6;
		byte vak3 = 9;
		byte vak4 = 4;
		byte totaal;
		
		totaal = (byte)(vak1 + vak2 + vak3 + vak4);
		System.out.println ("totaal = " + totaal);
		
		float gemiddelde = totaal  / 4F;  // als die F er niet staat is het gemiddelde 6,0 ipv 6,75
		System.out.println ("gemiddelde = " + gemiddelde);
		
		System.out.println ("Percentage = " + totaal * 100F / 40F);  // als die F er niet staat is het percentage 67 ipv 67,5
		
	}

private static void body() {
	
		/**
		 * Dit is documentatie-commentaar (slash met 2x ster)  
		 */
		
		System.out.println ("");
		System.out.println ("Berekening bodymass: ");
				
		int a =  12;
			
		float gewicht = 85;
		float lengte = 1.86F;
		float bmi; 
		/* Dit is gewone commentaar 
		 * commentaat tot hier  */
		bmi = gewicht / (lengte * lengte); 
		
		System.out.println ("Mijn bodymass = " + bmi);
		// Dit is 1 lijn commentaar 
		
		/*
		Tip Indien in vorige lijn 1 slash bijgeplaatst wordt, 
		wordt de code inee uitvoerbaar: handig dus om code te testen       
		//*/
	}

private static void btw() {

	System.out.println ("");
	System.out.println ("Controle btwnr: ");
	int btwnr = 430689797;
	int deeltal = btwnr / 100;
	System.out.println (deeltal);
	byte rest = (byte)(deeltal % 97);
	System.out.println (rest);
	byte controle = (byte)(btwnr % 100);
	System.out.println (controle);
	}

private static void bank() {
	
	System.out.println ("");
	System.out.println ("Controle bankrekening: ");
	long banknr = 979262560009L;
	long deeltal2 = banknr / 100;
	System.out.println ("Deeltal= " + deeltal2);
	byte rest = (byte)(deeltal2 % 97);
	System.out.println ("Rest= " + rest);
	byte controle = (byte)(banknr % 100);
	System.out.println ("Controle= " + (controle ==rest));
	

}

}
