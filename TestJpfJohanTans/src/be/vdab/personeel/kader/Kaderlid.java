package be.vdab.personeel.kader;

import java.io.Serializable;

import be.vdab.personeel.Bediende;
import be.vdab.personeel.NaamException;
import be.vdab.personeel.PersnrException;
import be.vdab.util.WerknemersDatum;

public class Kaderlid extends Bediende implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String functietitel = "manager";

	
	
	public Kaderlid(int p, String n, WerknemersDatum d, double maandwedde,  String functietitel) 
			throws PersnrException, NaamException {
		super(p, n, d, maandwedde);
		this.functietitel = functietitel;
	}

	public String getFunctietitel() {
		return functietitel;
	}

	public void setFunctietitel(String functietitel) {
		this.functietitel = functietitel;
	}
	
}
