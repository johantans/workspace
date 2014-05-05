package be.vdab.voertuigen;

import be.vdab.util.Fout;

public class Personenwagen extends Voertuig {

	private static final long serialVersionUID = 1L;
	
	private int zitplaatsen;

	public Personenwagen(String merk, int aankoopprijs, int zitplaatsen) {
		super(merk, aankoopprijs);
		this.zitplaatsen = zitplaatsen;
	}

	public int getZitplaatsen() {
		return zitplaatsen;
	}

	public void setZitplaatsen(int zitplaatsen) throws Fout {
		if (this.zitplaatsen < 1) {
			throw new Fout("Zitplaatsen moet > zijn dan 0");
		}
		this.zitplaatsen = zitplaatsen;
	}
	
	@Override 
	public String toString() {
		return "Merk: " + super.getMerk() 
				+ " aankoopprijs: " + super.getAankoopprijs()
				+ " Zitplaatsen:" + this.getZitplaatsen(); 
	}

}
