package be.vdab.voertuigen.div;

import java.io.Serializable;

public class Nummerplaat implements Serializable,Comparable<Nummerplaat> {

	private static final long serialVersionUID = 1L;
	private final String plaat; 
	
	public Nummerplaat(String plaat) {
		this.plaat = plaat;
	}

	@Override
	public int compareTo(Nummerplaat o) {
		Nummerplaat p = (Nummerplaat) o;
		if (this.equals(p)) {
			return 0;	
		}
		if (this.plaat == p.plaat) {
			return - 1; 
		}
		return -1;
	}
	
	
	@Override 
	public String toString() {
		return "Nummerplaat: " + this.plaat;
	}

	@Override 
	public boolean equals (Object o) { 
		if (!(o instanceof Nummerplaat)) { 
			return false; 
		} 
		Nummerplaat p = (Nummerplaat) o; 
		return plaat == p.getPlaat(); 
	} 
	
	@Override 
	public int hashCode() { 
		return plaat.hashCode(); 
	}
	
	public String getPlaat() {
		return plaat;
	}
	
	
}
