package be.vdab.voertuigen;

import be.vdab.util.Laadbaar;
import be.vdab.util.Volume;

public class Vrachtwagen extends Voertuig implements Laadbaar  {
	private static final long serialVersionUID = 1L;

	private Volume laadvolume; 
	private int maximaalToegelatenMassa; 
	private int aantalAssen;
	
	public Vrachtwagen(String merk, int aankoopprijs, Volume laadvolume,
			int maximaalToegelatenMassa, int aantalAssen) {
		super(merk, aankoopprijs);
		this.laadvolume = laadvolume;
		this.maximaalToegelatenMassa = maximaalToegelatenMassa;
		this.aantalAssen = aantalAssen;
	}
	public Volume getLaadvolume() {
		return laadvolume;
	}
	public void setLaadvolume(Volume laadvolume) {
		this.laadvolume = laadvolume;
	}
	public int getMaximaalToegelatenMassa() {
		return maximaalToegelatenMassa;
	}
	public void setMaximaalToegelatenMassa(int maximaalToegelatenMassa) {
		this.maximaalToegelatenMassa = maximaalToegelatenMassa;
	}
	public int getAantalAssen() {
		return aantalAssen;
	}
	public void setAantalAssen(int aantalAssen) {
		this.aantalAssen = aantalAssen;
	} 
}
