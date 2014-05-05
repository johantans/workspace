package be.vdab.personeel;

import java.io.Serializable;

import be.vdab.util.WerknemersDatum;

public class Bediende extends Werknemer implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private double maandwedde = 1129.47;
	
	public Bediende(int p, String n,  WerknemersDatum d,double maandwedde) throws PersnrException, NaamException {
		super(p,d,n);
		this.maandwedde = maandwedde;
	}

	public double getMaandwedde() {
		return maandwedde;
	}
	
	public void setMaandwedde(double maandwedde) {
		this.maandwedde = maandwedde;
	}

	@Override
	public double getVerloning() {
		return this.maandwedde; 
	}
	
}
