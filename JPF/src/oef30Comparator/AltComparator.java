package oef30Comparator;

import java.util.Comparator; 

public class AltComparator implements Comparator<Tienkamper> {
	@Override 
	
	public int compare(Tienkamper obj1, Tienkamper obj2) { 
		if (obj1.getPunten() == obj2.getPunten()) 
			return 0; 
			//return 1; wanneer wel dubbele punten zijn toegestaan
		else if (obj1.getPunten() > obj2.getPunten()) 
			return 1; 
		else return -1; 
		} 
	
}
