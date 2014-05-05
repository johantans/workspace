package Hfst10EigenExceptions;

public class PostNrException extends Exception { 
	private int verkeerdPostNr; 
	
	public PostNrException() {
		} 
	
	public PostNrException(String omschrijving) {
		super(omschrijving); 
	} 
	
	public PostNrException(String omschrijving, int verkeerd) { 
		super(omschrijving); 
		this.verkeerdPostNr=verkeerd; 
	} 
	
	public int getVerkeerdPostNr() {
		return verkeerdPostNr; 
	}
}
