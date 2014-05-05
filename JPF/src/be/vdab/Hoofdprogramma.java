package be.vdab;

import be.vdab.util.IVoorwerp;
import be.vdab.voorwerpen.Boekenrek;
import be.vdab.voorwerpen.Leesboek;
import be.vdab.voorwerpen.Woordenboek;

public class Hoofdprogramma {
//(1) We maken een array van het interface-datatype Voorwerp. 
	static IVoorwerp [] ding = new IVoorwerp[6]; 
	
  	public static void main(String[] args) { 
  		
  		Boekenrek br = new Boekenrek();
  		br.setAankoopprijs(22);
  		br.setBreedte(8);
  		br.setHoogte(15);
  		br.setWinst(br.winstBerekenen());
  		ding[0] = br;
  		ding[1] = new Boekenrek(10,20,18,0);
  		Leesboek lb = new Leesboek();
  		lb.setAankoopprijs(27);
  		lb.setAuteur("Jef Braecke");
  		lb.setEigenaar("Van Mij");
  		lb.setGenre("Triller");
  		lb.setOnderwerp("Drama");
  		lb.setTitel("Titel van een leesboek");
  		lb.setWinst(br.winstBerekenen());
  		ding[2] = lb;
  		ding[3] = new Leesboek("Het gevaar", "Jef Geraerts", "Standaard", 17, "Fictie", "Ned",0);
  		Woordenboek wb = new Woordenboek();
  		wb.setAankoopprijs(39);
  		wb.setAuteur("Piet Snot");
  		wb.setEigenaar("Onder Ons");
  		wb.setGenre("Fictieroman");
  		wb.setTaal("Italiano");
  		wb.setTitel("Italiano para incognito");
  		wb.setWinst(br.winstBerekenen());
  		ding[4] = wb;
  		ding[5] = new Woordenboek("Engel-Frans", "Lord McCartney", "Loyds", 25, "Woordenboek","frans",0);
   		
		for (IVoorwerp eending:ding) {
			eending.gegevensTonen();
		}

		System.out.println ("Einde van de oefening!");
		
	}
}
