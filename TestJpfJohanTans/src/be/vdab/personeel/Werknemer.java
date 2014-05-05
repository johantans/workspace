package be.vdab.personeel;

import java.io.Serializable;

import be.vdab.util.WerknemersDatum;

public abstract class Werknemer implements Serializable,Comparable<Werknemer>{
	private static final long serialVersionUID = 1L;
	
	private int personeelsnummer = -1;
	private WerknemersDatum datumInDienst; 
	private String naam = "nog niet ingevuld";
	
	public Werknemer() {
	}

	public Werknemer(int personeelsnummer, WerknemersDatum datumInDienst,
			String naam) throws PersnrException, NaamException {
		setPersoneelsnummer(personeelsnummer);
		setDatumInDienst(datumInDienst);
		setNaam(naam);
	}

	@Override
	public int compareTo(Werknemer w) {
		return this.datumInDienst.compareTo(w.getDatumInDienst());
	}
	
	@Override
	public String toString() {
		return datumInDienst.toString() + '\t' + personeelsnummer + '\t' + naam + '\t' + getVerloning();  
	}

	public abstract double getVerloning();  
	
	public int getPersoneelsnummer() {
		return personeelsnummer;
	}
	
	public void setPersoneelsnummer(int p) throws PersnrException {
		if (p < 1) { 
			throw new PersnrException("Verkeerd Personeelsnr: ",Integer.toString(p));
		}	
		this.personeelsnummer = p;
	}
	
	public WerknemersDatum getDatumInDienst() {
		return datumInDienst;
	}

	public void setDatumInDienst(WerknemersDatum datumInDienst) {
		this.datumInDienst = datumInDienst;
	}

	public String getNaam() {
		return naam;
	}
	
	public void setNaam(String naam) throws NaamException {
		if (naam == null || naam.isEmpty()) { 
			throw new NaamException("Naam mag niet blanco zijn!");
		}	
		this.naam = naam;
	}
	
}
