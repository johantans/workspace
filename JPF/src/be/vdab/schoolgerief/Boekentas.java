package be.vdab.schoolgerief;

import java.io.Serializable;

import be.vdab.util.Laadbaar;
import be.vdab.util.Volume;
import be.vdab.util.VolumeException;

public class Boekentas implements Laadbaar,Serializable {
	private static final long serialVersionUID = 1L;
	private Volume laadvolume;
	private String kleur; 
	
	public Boekentas(Volume laadvolume, String kleur) {
		super();
		this.laadvolume = laadvolume;
		this.kleur = kleur;
	}

	public String getKleur() {
		return kleur;
	}

	public void setKleur(String kleur) {
		if (kleur.isEmpty()) {
			throw new IllegalArgumentException("Kleur is verplicht!");
		}
		this.kleur = kleur;
	}

	@Override 
	public String toString() { 
		try {
			return ("Kleur: " + kleur + "\t" + "Laadvolume: " + laadvolume.getVolume());
		} catch (VolumeException e) {
			System.out.println ("Volume is verplicht!");
			
		}
	return "";	
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kleur == null) ? 0 : kleur.hashCode());
		result = prime * result
				+ ((laadvolume == null) ? 0 : laadvolume.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Boekentas other = (Boekentas) obj;
		if (kleur == null) {
			if (other.kleur != null)
				return false;
		} else if (!kleur.equals(other.kleur))
			return false;
		if (laadvolume == null) {
			if (other.laadvolume != null)
				return false;
		} else if (!laadvolume.equals(other.laadvolume))
			return false;
		return true;
	}


	@Override
	public Volume getLaadvolume() {
		return laadvolume;
	}
	
	@Override
	public void setLaadvolume(Volume v) {
		if (v == null) {
			throw new IllegalArgumentException("Laadvolume is verplicht!");
		}
		this.laadvolume = v;
		
	}
	

	
}
