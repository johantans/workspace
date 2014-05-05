package gemeente;

import Hfst10EigenExceptions.PostNrException;

public class Gemeente { 
	private String naam; 
	private int postNr;
	
	public void setNaam(String naam) { 
		this.naam=naam; 
	} 
	
	public void setPostNr(int postNr) throws PostNrException { 
		if (postNr<1000 || postNr > 9999) throw new PostNrException("Verkeerd Postnr", postNr); 
		this.postNr=postNr; 
	} 
	
	public Gemeente(String naam, int postNr) throws PostNrException { 
		setNaam(naam); 
		setPostNr(postNr); 
	} 
	
	public String toString() { 
		return postNr + " " + naam; 
		} 
	
}