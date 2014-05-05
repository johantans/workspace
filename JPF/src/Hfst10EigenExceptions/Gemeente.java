package Hfst10EigenExceptions;

public class Gemeente { 
	
	private String naam; 
	private int postNr; 
	
	public Gemeente(String naam, int postNr) throws PostNrException { 
		setNaam(naam); 
		setPostNr(postNr); 
	} 

	@Override 
	public String toString() { 
		return postNr + " " + naam; 
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) { 
		this.naam=naam; 
	} 
	
	public int getPostNr() {
		return postNr;
	}
	
	public void setPostNr(int postNr) throws PostNrException { 
		if (postNr<1000 || postNr > 9999) { 
			throw new PostNrException("Verkeerd Postnr",postNr); 
		}
		this.postNr=postNr; 
	}
	
}