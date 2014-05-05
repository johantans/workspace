package oef31Streams;

import java.io.Serializable;
import java.util.Date;

public class GastenBoekEntry implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Date tijdstip;
	private String naam;
	private String boodschap;
	
	public GastenBoekEntry() {
	}
	
	public GastenBoekEntry(Date tijdstip, String naam, String boodschap) {
		this.tijdstip = tijdstip;
		this.naam = naam;
		this.boodschap = boodschap;
	}
	
	public GastenBoekEntry(String naam, String boodschap) {
		this.naam = naam;
		this.boodschap = boodschap;
	}
	
	@Override
	public String toString() {
		return "tijdstip= " + tijdstip + ", naam= " + naam + ", boodschap= " + boodschap;
	}

	public Date getTijdstip() {
		return tijdstip;
	}

	public void setTijdstip(Date tijdstip) {
		this.tijdstip = tijdstip;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getBoodschap() {
		return boodschap;
	}

	public void setBoodschap(String boodschap) {
		this.boodschap = boodschap;
	}
	
}
