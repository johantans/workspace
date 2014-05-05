package be.vdab.util;

import java.io.Serializable;
import java.util.Comparator;

import oef30Comparator.Tienkamper;

public class Volume implements Serializable, Comparable<Volume>{
	private static final long serialVersionUID = 1L;
	
	private final int breedte; 
	private final int hoogte; 
	private final int diepte; 
	private final Maat maat;
	
	public Volume(int breedte, int hoogte, int diepte, Maat maat) {
		this.breedte = breedte;
		this.hoogte = hoogte;
		this.diepte = diepte;
		this.maat = maat;
	}
	
	public long getVolume() throws VolumeException {
		long result = 0L;
		result = breedte * hoogte * diepte * maat.getFactor();
		if (result < 0) {
			throw new VolumeException("Volume kan niet negatief zijn!");
		}  
		return result;
	}
		
	public int getBreedte() {
		return breedte;
	}
	public int getHoogte() {
		return hoogte;
	}
	public int getDiepte() {
		return diepte;
	}
	public Maat getMaat() {
		return maat;
	}
	
	public boolean equals(Object object) {
		if (! (object instanceof Volume)) { 
			return false; 
			} 
		//TODO: verder aanvullen.  
		return false;
	}
	
	@Override
	public int compareTo(Volume o) {
		//TODO Auto-generated method stub
		return 0;
	} 
	
}
