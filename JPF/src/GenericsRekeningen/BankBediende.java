package GenericsRekeningen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BankBediende { 
	
	public static void main(String[] args) throws RekeningException { 
		
	// -----GENERICS: eerste collectie van rekeningen ------------- 
		Set<Rekening> setRek = new HashSet<Rekening>(); 
		ZichtRekening z1 = new ZichtRekening("001-1234567-11",1000); 
		z1.storten(100.80); 
		ZichtRekening z2 = new ZichtRekening("001-1234567-22",1000); 
		z2.storten(200.80); 
		SpaarRekening s1 = new SpaarRekening("833-1234567-88",3.5 ); 
		s1.storten(1500.0); 
		SpaarRekening s2 = new SpaarRekening("833-1234567-99",3.5 ); 
		s2.storten(3000.0); 
		setRek.add(z1); 
		setRek.add(z2); 
		setRek.add(s1); 
		setRek.add(s2); 
		
		double somSaldo = 0.0; 
		for (Rekening rek : setRek) { 
			somSaldo += rek.geefSaldo(); 
			} 
		
		System.out.println("Totaal saldo: " + somSaldo); 
		System.out.println(); 
		System.out.println("HashSet van Rekeningen"); 
		
		printRekening(setRek); 
	
		List<Rekening> alRek = new ArrayList<Rekening>();	 
		alRek.add(z1);
		alRek.add(z2);
		alRek.add(s1);
		alRek.add(s2);
		
		System.out.println(); 
		System.out.println("Arraylist van Rekeningen"); 
		printRekening(alRek);  
		
		Set<ZichtRekening> setZichtrek=new HashSet<ZichtRekening>();
		setZichtrek.add(z1); 
		setZichtrek.add(z2); 
		
		System.out.println(); 
		System.out.println("Set van ZichtRekeningen"); 
		//printRekening(setZichtrek);	
		printRekening2(setZichtrek);
		
		List <String> woorden = new ArrayList <String> () ; 
		woorden.add("eerste woord"); 
		woorden.add("tweede woord");
		woorden.add("derde woord"); 
		System.out.println();
		System.out.println("Collectie van woorden"); 
		//printRekening(woorden); 
		//printRekening2(woorden); 
		print(woorden); 
		
		//Alle collections tonen met de procedure print 
		print(setRek);
		print(alRek);
		print(setZichtrek);
		
	} 
	
		public static void printRekening(Collection <Rekening> rekeningen) { 
			for(Rekening r : rekeningen) 
				System.out.println(r); 
		}
		
		public static void printRekening2(Collection <? extends Rekening> rekeningen) { 
			for(Rekening r : rekeningen) 
				System.out.println(r); 
		}
		
		public static void print(Collection < ? > coll) { 
			for(Object obj : coll) System.out.println(obj); 
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
