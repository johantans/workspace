package oef30Comparator;

import java.util.Comparator;

public class Tienkamper implements Comparable<Tienkamper> {

	private String naam;
	private int punten;
	
	public Tienkamper() {
	
	}

	public Tienkamper(String naam, int punten) {
		this.naam = naam;
		this.punten = punten;
	}

	
	public String toString() {
		return this.naam + " behaalde " + this.punten + " punten."; 
	}
	
	
	public boolean equals(Object object) {
		if (! (object instanceof Tienkamper)) { 
			return false; 
			} 
		Tienkamper andere = (Tienkamper) object; 
		return this.naam.equals(andere.naam); }
	
	
	public int hashCode() {
		return naam.hashCode();
	}
	
	
	public int compareTo (Tienkamper o) {
		return this.getNaam().compareTo(o.getNaam()); 
	}
		
	public String getNaam() {
		return naam;
	}
	
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	public int getPunten() {
		return punten;
	}
	
	public void setPunten(int punten) {
		this.punten = punten;
	}
	
	public static Comparator<Tienkamper> getDalendePuntenComparator() { 
		return new Comparator<Tienkamper>() { 
			@Override 
			public int compare(Tienkamper t1, Tienkamper t2) { 
				return t2.getPunten()==t1.getPunten() ? -1 : t2.getPunten()-t1.getPunten(); 
			} 
		};
	}
	
	
}
