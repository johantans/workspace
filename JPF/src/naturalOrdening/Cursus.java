package naturalOrdening;

public class Cursus implements Comparable{
	
	private int cursusNr; 
	private String cursusNaam; 
	private int prijs; 
	
	
	public Cursus(int nr, String naam, int prijs) {
		cursusNr = nr; 
		cursusNaam = naam; 
		this.prijs = prijs; 
		} 
	
	public int getCursusNr() { 
		return cursusNr; } 
	
	public void setCursusNr(int nr) { 
		this.cursusNr = nr; 
		} 
	
	public String getCursusNaam() { 
		return cursusNaam; } 
	
	public void setCursusNaam(String naam) { 
		this.cursusNaam = naam; } 
	
	public int getPrijs() { 
		return prijs; 
	} 
	
	public void setPrijs(int prijs) { 
		this.prijs = prijs; 
		} 
	@Override 
	public String toString() { 
		return (cursusNr + "\t" + cursusNaam + "\t" + prijs); 
		} 
	
	@Override public boolean equals (Object o) { 
		if (!(o instanceof Cursus)) { 
			return false; 
			} 
		Cursus c = (Cursus) o; 
		return cursusNr == c.getCursusNr(); 
	} 
	
	@Override public int hashCode() { 
		return cursusNr; 
	} 
	
	/*@Override 
	public int compareTo(Object o) {
		// sorteren op cursusnr 
		Cursus c = (Cursus) o;
		//return cursusNaam.compareTo(c.getCursusNaam());
		return prijs - c.getPrijs();
	}
	*/
	
	@Override public int compareTo(Object o) { 
		// sorteren op cursusPrijs 
		Cursus c = (Cursus) o; 
		if ( this.equals(c) ) { 
			return 0; }
		else return prijs == c.getPrijs() ? -1 : prijs - c.getPrijs();
		}
	}

