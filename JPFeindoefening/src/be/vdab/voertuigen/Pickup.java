package be.vdab.voertuigen;

import java.io.Serializable;

import be.vdab.util.Fout;
import be.vdab.util.Laadbaar;
import be.vdab.util.Volume;

public class Pickup extends Personenwagen implements Laadbaar,Serializable {
	private static final long serialVersionUID = 1L;
	
	public Volume laadvolume;

	public Pickup(String merk, int aankoopprijs, int zitplaatsen, Volume laadvolume) throws Fout{
		super(merk, aankoopprijs, zitplaatsen);
		this.laadvolume = laadvolume;
	}

	@Override
	public Volume getLaadvolume() {
		return laadvolume;
	}

	@Override
	public void setLaadvolume(Volume lv) {
		this.laadvolume = lv;
		
	}
        
    @Override 
	public String toString() {
        return super.toString() + " " + this.getLaadvolume().toString();        
	}

}
