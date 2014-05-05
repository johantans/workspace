package be.vdab.personeel;

public class NaamException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public NaamException() {
	}

	public NaamException (String omschrijving) {
		super(omschrijving); 
	} 
	
}
