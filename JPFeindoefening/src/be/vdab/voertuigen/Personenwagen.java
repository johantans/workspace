package be.vdab.voertuigen;

import java.io.Serializable;

import be.vdab.util.Fout;

public class Personenwagen extends Voertuig implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int zitplaatsen;

	public Personenwagen(String merk, int aankoopprijs, int zitplaatsen) throws Fout {
		super(merk, aankoopprijs);
		this.zitplaatsen = zitplaatsen;
	}

	public int getZitplaatsen() {
		return zitplaatsen;
	}

	public void setZitplaatsen(int zitplaatsen) throws Fout {
		if (zitplaatsen < 1) {
			throw new Fout("Zitplaatsen moet groter zijn dan 0");
		}
		this.zitplaatsen = zitplaatsen;
	}
	
	@Override 
	public String toString() {
		return super.toString() 
			+ " Zitplaatsen:" + this.getZitplaatsen();
        }

}
