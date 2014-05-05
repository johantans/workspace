package be.vdab.util;

import java.io.Serializable;

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
		long result = breedte * hoogte * diepte * maat.getFactor();
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
	
	@Override
        public boolean equals(Object object) {
		if (! (object instanceof Volume)) { 
			return false; 
			}
                Volume v = (Volume) object; 
                if (this.breedte == v.breedte &
                    this.diepte == v.diepte &
                    this.hoogte == v.hoogte &
                    this.maat.equals(v.maat)) {
                    return true;
                }
                return false;
        }
	
	@Override
	public int compareTo(Volume v) {
            try {
                if (this.getVolume() == v.getVolume()) return 0; 
                if (this.getVolume() < v.getVolume()) return 1; 
            } catch (VolumeException ex) {
                System.out.println (ex.getMessage());
            }
        	return -1;
	}
        
    @Override 
	public String toString() {
            try {
                return breedte + "," + diepte + "," + hoogte +  "," + maat + ": " + this.getVolume();
            } catch (VolumeException ex) {
                System.out.println (ex.getMessage());
                return "";
            }
	}
}
