package Oef21;



public class Hoofdprogramma {
//(1) We maken een array van het interface-datatype Privaat. 
//(1) We maken een array van het interface-datatype Milieu. 
	static Privaat [] privaat = new Privaat[4]; 
	static Milieu [] mil = new Milieu[4]; 
	
	static int teller = -1; // -1 omdat dan eerste element op 0 begint.
	
  	public static void main(String[] args) { 
  		
  		privaat[0] = new Personenwagen("Jef", 15000, 100, 6, "evf777", 5, 4);
  		privaat[1] = new Vrachtwagen ("Jan", 25000, 125, 10, "gfd125", 50);
  		privaat[2] = new Personenwagen("Luc", 14000, 100, 6, "dvf777", 5, 2);
  		privaat[3] = new Vrachtwagen ("Frans", 24000, 135, 10, "gfd225", 40);
		
  		mil[0] = new Personenwagen("Jef", 15000, 100, 6, "evf777", 5, 4);
  		mil[1] = new Vrachtwagen ("Jan", 25000, 125, 10, "gfd125", 50);
  		mil[2] = new Personenwagen("Luc", 14000, 100, 6, "dvf777", 5, 2);
  		mil[3] = new Vrachtwagen ("Frans", 24000, 135, 10, "gfd225", 40);
  		
		for (Privaat eenprivaat:privaat) {
			eenprivaat.geefPrivateData();
		}
		
		for (Milieu eenM:mil) {
			eenM.geefMilieuData();
		}
		
		System.out.println ("Einde van de oefening!");
		
	}
}
