package naturalOrdening;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
		}
}