package oef30Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainOef30 {

	public static void main(String[] args) {
		
		Tienkamper tk0 = new Tienkamper("JanDeEerste",5267);
		Tienkamper tk1 = new Tienkamper("Piet",5569);
		Tienkamper tk2 = new Tienkamper("Claes",6001);
		Tienkamper tk3 = new Tienkamper("walter",5896);
		Tienkamper tk4 = new Tienkamper("Johan",7456);
		Tienkamper tk5 = new Tienkamper("Luc",6125);
		Tienkamper tk6 = new Tienkamper("Wouter",5639);
		Tienkamper tk7 = new Tienkamper("Amede",4555);
		Tienkamper tk8 = new Tienkamper("Filip",5486);
		Tienkamper tk9 = new Tienkamper("MarcDeLaatste",5521);
		
		System.out.println("Arraylist van tienkampers(gebruikt de aparte klasse: laag nr hoog):");
		System.out.println();
			
		List <Tienkamper> atletenAl = new ArrayList<Tienkamper>(); 
		atletenAl.add(tk0);
		atletenAl.add(tk1);
		atletenAl.add(tk2);
		atletenAl.add(tk3);
		atletenAl.add(tk4);
		atletenAl.add(tk5);
		atletenAl.add(tk6);
		atletenAl.add(tk7);
		atletenAl.add(tk8);
		atletenAl.add(tk9);
	
		//de arraylist sorteren op punten
		Comparator comp = new AltComparator(); 
		Collections.sort(atletenAl, comp);
		
		for (int i=0; i<atletenAl.size() ; i++) { 
			Tienkamper t= atletenAl.get(i); 
			System.out.println(t.toString()); 
			}

		System.out.println();
		System.out.println("Treelist van tienkampers (gebruikt de inner compare bij Tienkamper: hoog nr klaag):");
		System.out.println();
		
		Set <Tienkamper> atletenTs = new TreeSet<Tienkamper>(Tienkamper.getDalendePuntenComparator());
		atletenTs.add(tk0);
		atletenTs.add(tk1);
		atletenTs.add(tk2);
		atletenTs.add(tk3);
		atletenTs.add(tk4);
		atletenTs.add(tk5);
		atletenTs.add(tk6);
		atletenTs.add(tk7);
		atletenTs.add(tk8);
		atletenTs.add(tk9);
			
		Iterator<Tienkamper> i = atletenTs.iterator();
		while (i.hasNext()) {
			Object o = i.next();
			if (o instanceof Tienkamper) {
				Tienkamper t = (Tienkamper) o;
				System.out.println(t.toString()); 
			}
		}
	}
}