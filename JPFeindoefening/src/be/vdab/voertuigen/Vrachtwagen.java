package be.vdab.voertuigen;

import java.io.Serializable;

import be.vdab.util.Fout;
import be.vdab.util.Laadbaar;
import be.vdab.util.Volume;

public class Vrachtwagen extends Voertuig implements Laadbaar,Serializable  {
	private static final long serialVersionUID = 1L;

	private Volume laadvolume; 
	private int maximaalToegelatenMassa; 
	private int aantalAssen;
	
	public Vrachtwagen(String merk, int aankoopprijs, Volume laadvolume,
			int maximaalToegelatenMassa, int aantalAssen) throws Fout {
		super(merk, aankoopprijs);
		this.laadvolume = laadvolume;
		this.maximaalToegelatenMassa = maximaalToegelatenMassa;
		this.aantalAssen = aantalAssen;
	}
	
        @Override 
	public String toString() {
            return super.toString() 
		+ " " + this.getLaadvolume().toString()
                + " Max. gewicht: " + this.getMaximaalToegelatenMassa()
                + " Aantal assen: " + this.getAantalAssen();
	}
        
        @Override
        public Volume getLaadvolume() {
		return laadvolume;
	}
        
        @Override
	public void setLaadvolume(Volume laadvolume) {
		this.laadvolume = laadvolume;
	}
	public int getMaximaalToegelatenMassa() {
		return maximaalToegelatenMassa;
	}
	public void setMaximaalToegelatenMassa(int maximaalToegelatenMassa) {
		//TODO kontrole > 0
		this.maximaalToegelatenMassa = maximaalToegelatenMassa;
	}
	public int getAantalAssen() {
		return aantalAssen;
	}
	public void setAantalAssen(int aantalAssen) {
		//TODO kontrole > 0
		this.aantalAssen = aantalAssen;
	} 
}
