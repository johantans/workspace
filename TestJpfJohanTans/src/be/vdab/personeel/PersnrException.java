package be.vdab.personeel;

public class PersnrException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String verkeerd;
	
	public PersnrException() {
	}

	public PersnrException (String omschrijving) {
		super(omschrijving); 
	} 
	
	public PersnrException(String omschrijving, String verkeerd) { 
		super(omschrijving); 
		this.verkeerd=verkeerd; 
	} 
	
	public String getVerkeerd() {
		return verkeerd; 
	}

	
}
