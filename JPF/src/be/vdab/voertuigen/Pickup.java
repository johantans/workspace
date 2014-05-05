package be.vdab.voertuigen;

import be.vdab.util.Laadbaar;
import be.vdab.util.Volume;

public class Pickup extends Voertuig implements Laadbaar{
	private static final long serialVersionUID = 1L;
	
	public Volume laadvolume;

	public Pickup(String merk, int aankoopprijs, Volume laadvolume) {
		super(merk, aankoopprijs);
		this.laadvolume = laadvolume;
	}

	@Override
	public Volume getLaadvolume() {
		// TODO Auto-generated method stub
		return laadvolume;
	}

	@Override
	public void setLaadvolume(Volume lv) {
		this.laadvolume = lv;
		
	}

}
