package Oef22;



public class Hoofdprogramma {
//(1) We maken een array van het interface-datatype Voorwerp. 
	static IVoorwerp [] ding = new IVoorwerp[6]; 
	
  	public static void main(String[] args) { 
  		
  		ding[0] = new Boekenrek();
  		ding[1] = new Boekenrek(10,20,20,0);
  		ding[2] = new Leesboek();
  		ding[3] = new Leesboek("Het gevaar", "Jef Geraerts", "Standaard", 17, "Fictie", "Ned",0);
  		ding[4] = new Woordenboek();
  		ding[5] = new Woordenboek("Engel-Frans", "Lord McCartney", "Loyds", 25, "Woordenboek","frans",0);
   		
		for (IVoorwerp eending:ding) {
			eending.gegevensTonen();
		}
		
		System.out.println ("Einde van de oefening!");
		
	}
}
