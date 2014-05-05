package Oef27Collections;

import java.util.Set;
import java.util.TreeSet;

import naturalOrdening.Cursus;



public class Hoofdprogramma {
//(1) We maken een array van het interface-datatype Privaat. 
//(1) We maken een array van het interface-datatype Milieu.
	static Privaat [] privaat = new Privaat[4]; 
	static Milieu [] mil = new Milieu[4]; 
		
  	public static void main(String[] args) { 
  	
  		Set voertuigen = new TreeSet(); 
		voertuigen.add(new Personenwagen("Jef", 15000, 100, 6, "evf777", 5, 4));
		voertuigen.add(new Vrachtwagen ("Jan", 25000, 125, 10, "afd125", 50));
		voertuigen.add(new Personenwagen("Luc", 14000, 100, 6, "dvf777", 5, 2));
		voertuigen.add(new Vrachtwagen ("Frans", 24000, 135, 10, "gfd225", 40));
		
		System.out.println ("Begin oef. voertuigen!");
		
		System.out.println();
		for ( Object obj : voertuigen) { 
			Voertuig eenVoertuig = (Voertuig) obj;
			System.out.println(eenVoertuig); 
		}
		
		System.out.println ("Einde van de oefening!");
		
	}
}
