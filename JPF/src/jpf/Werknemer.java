package jpf;

public class Werknemer {

	private String naam;
	private Datum dtIndienst;
	
	public Werknemer(String naam, Datum dtIndienst) throws DatumException{
		super();
		this.naam = naam;
		this.dtIndienst = dtIndienst;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public Datum getDtIndienst() {
		return dtIndienst;
	}

	public void setDtIndienst(Datum dtIndienst) {
		this.dtIndienst = dtIndienst;
	}
	
	@Override 
	public String toString() {
		return naam + ", " + dtIndienst.getDag() + "/" + dtIndienst.getMaand() + "/" + dtIndienst.getJaar();
        }
}
