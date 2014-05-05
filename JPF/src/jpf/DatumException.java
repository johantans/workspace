package jpf;

public class DatumException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String datumVerkeerd;
	
	public DatumException() {
		
	}

	public DatumException (String omschrijving) {
		super(omschrijving); 
	} 
	
	public DatumException(String omschrijving, String verkeerd) { 
		super(omschrijving); 
		this.datumVerkeerd=verkeerd; 
	} 
	
	public String getDatumVerkeerd() {
		return datumVerkeerd; 
	}

	
}
