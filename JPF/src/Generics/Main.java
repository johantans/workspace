package Generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) { 
		Set<Cursus> coll = new HashSet<Cursus>(); 
		coll.add( new Cursus(5, "Word", 100) ); 
		coll.add( new Cursus(3, "Excel", 110) ); 
		coll.add( new Cursus(1, "Windows", 90) ); 
		//coll.add( "test"); 
		coll.add( new Cursus(4, "Access", 120) );
		coll.add( new Cursus(2, "Powerpoint", 80) ); 
		int somPrijs = 0; 
		Iterator<Cursus> it = coll.iterator(); 
		while( it.hasNext() ) { 
			Cursus c = it.next(); 
			somPrijs += c.getPrijs(); 
			} 
		System.out.println("Som van de prijzen(It): " + somPrijs);
		
		// andere manier: met de enhanced for-lus of for-each 
		somPrijs = 0; 
		for (Cursus c : coll) { 
			somPrijs += c.getPrijs(); 
			} 
		System.out.println("Som van de prijzen(for): " + somPrijs);
		
	    List<Cursus> al = new ArrayList<Cursus>();
		al.add( new Cursus(5, "Word", 100) ); 
		al.add( new Cursus(3, "Excel", 110) ); 
		al.add( new Cursus(1, "Windows", 90) ); 
		al.add( new Cursus(4, "Access", 120) ); 
		al.add( new Cursus(2, "Powerpoint", 80) ); 
		somPrijs = 0; 
		for (int i=0; i<al.size(); i++) { 
			Cursus c = al.get(i); 
			somPrijs = 
			somPrijs += c.getPrijs(); 
			} 
		System.out.println("Som van de prijzen(Arraylist): " + somPrijs);
			
		//**** Eigen class Cursus gebruiken om volgorde van de key aan te tonen: compareTo() !! 
		TreeMap<Cursus,String> cursussen=new TreeMap<Cursus,String>();
		cursussen.put(new Cursus(5, "Word", 100), "Je leert omgaan met een tekstverwerker"); 
		cursussen.put(new Cursus(3, "Excel", 110), "Je leert omgaan met een spreadsheetprogramma"); 
		cursussen.put(new Cursus(1, "Windows", 90), "Je leert omgaan met windows"); 
		cursussen.put(new Cursus(4, "Access", 120), "Je leert omgaan met een databasetoepassing"); 
		cursussen.put(new Cursus(2, "Powerpoint", 80), "Je leert omgaan met een presentatieprogramma"); 
		cursussen.put(new Cursus(6, "PhotoShop", 100), "Je leert omgaan met een fotobewerkingsprogramma"); 
		
		System.out.println("** View van de Cursussen volgens Keys **"); 
		Iterator<Cursus> itCursus = cursussen.keySet().iterator(); 
		while (itCursus.hasNext()) { 
			Cursus eenCursus = itCursus.next(); 
			String infoCursus = cursussen.get(eenCursus);
			System.out.println(eenCursus + " heeft als info: " + infoCursus); 
			} 
			
		System.out.println("*** Extra methods Cursus ***"); 
		System.out.println("Eerste key: " + cursussen.firstKey()); 
		System.out.println("Laatste key: " + cursussen.lastKey()); 
		SortedMap<Cursus, String> cursussenSub = cursussen.subMap(new Cursus(0,"", 90), new Cursus(0,"",120) );
		System.out.print("*** View van de Key-Value-paren van de submap");
		System.out.println(" met prijs tss 90-120 ***"); 
		Iterator itSub = cursussenSub.entrySet().iterator(); 
		while (itSub.hasNext()) { 
			System.out.println(itSub.next()); 
			}
		}
	
	
}