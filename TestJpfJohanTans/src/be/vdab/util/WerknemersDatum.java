package be.vdab.util;

import java.io.Serializable;

public class WerknemersDatum extends Datum implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private static final int dtOprichting = 19770212;
	
	public WerknemersDatum(int dag, int maand, int jaar) throws DatumException {
		super(dag, maand, jaar);
		if (!datumOk(dag,maand,jaar)) {
			String dtString = Integer.toString(dag) + "/" + Integer.toString(maand) + "/" +Integer.toString(jaar);
			throw new DatumException("Verlopen datum (voor 12/02/1977): ", dtString);
		}
	}
	
	private boolean datumOk(int dd,int mm,int eejj) {
		//eejj altijd 4 cijfers 
		String jaar = Integer.toString(eejj);
		//mm
		String maand = Integer.toString(mm);
		if (mm < 10) {
			maand = ("0" + Integer.toString(mm));
		} 
		//dd
		String dag = Integer.toString(dd);
		if (dd < 10) {
			dag = ("0" + Integer.toString(dd));
		} 
		int jmd = Integer.parseInt(jaar + maand + dag); 
		
		if (jmd < dtOprichting) return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	
	
	
	
}
