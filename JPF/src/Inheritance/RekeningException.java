package Inheritance;

public class RekeningException extends Exception {

	private String verkeerdReknr;
	
	public RekeningException() {
		
	}

	public RekeningException (String omschrijving) {
		super(omschrijving); 
	} 
	
	public RekeningException(String omschrijving, String verkeerd) { 
		super(omschrijving); 
		this.verkeerdReknr=verkeerd; 
	} 
	
	public String getVerkeerdReknr() {
		return verkeerdReknr; 
	}

	
}
