package be.vdab.personeel;

import java.io.Serializable;

import be.vdab.util.WerknemersDatum;

public class Arbeider extends Werknemer implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private float uurloon = (float) 9.76;
	
	public Arbeider(int p, String n,  WerknemersDatum d,float uurloon) throws PersnrException, NaamException {
		super(p,d,n);
		this.uurloon = uurloon;
	}

	public float getUurloon() {
		return uurloon;
	}

	public void setUurloon(float uurloon) {
		this.uurloon = uurloon;
	}

	@Override
	public double getVerloning() {
		return this.uurloon * 7.6 * 65 / 3;
	} 
	
}
