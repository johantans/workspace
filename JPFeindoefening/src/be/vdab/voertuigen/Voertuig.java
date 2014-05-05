package be.vdab.voertuigen;

import java.io.Serializable;
import java.util.Comparator;

import be.vdab.util.Fout;
import be.vdab.voertuigen.div.Div;
import be.vdab.voertuigen.div.Nummerplaat;

public class Voertuig implements Serializable,Comparable<Voertuig> {
	
	private static final long serialVersionUID = 1L;
	//private Nummerplaat nummerplaat = new Nummerplaat(Div.getInstance().getNummerplaat().getPlaat());  
	private Nummerplaat nummerplaat = Div.getInstance().getNummerplaat();  
	private String merk; 
	private int aankoopprijs;

	public Voertuig(String merk, int aankoopprijs) throws Fout  {
		this.merk = merk;
		setAankoopprijs(aankoopprijs);
	}
	
	@Override
        public String toString() {
		return "Merk: " + this.merk 
                        + ", Aankoopprijs: " + this.aankoopprijs
                        + " " + this.nummerplaat.toString(); 
	}    
        
       @Override
	public boolean equals(Object object) {
		if (! (object instanceof Voertuig)) { 
			return false; 
			} 
		Voertuig andere = (Voertuig) object; 
		return this.nummerplaat.equals(andere.getNummerplaat()); }
	
	@Override
	public int hashCode() {
		return nummerplaat.hashCode();
	}
	
    @Override
    public int compareTo(Voertuig v) { 
        return this.getNummerplaat().compareTo(v.getNummerplaat()); 
    }
        
  	public static Comparator<Voertuig> getComparatorMerk = new Comparator<Voertuig>() {
		public int compare(Voertuig v1, Voertuig v2) {
		String merk1 = v1.merk.toUpperCase();
		String merk2 = v2.merk.toUpperCase();
		return merk1.equals(merk2) ? -1 : merk1.compareTo(merk2);
		//return merk1.compareTo(merk2);
		}
	};

	public static Comparator<Voertuig> getComparatorAankoopprijs = new Comparator<Voertuig>() {
		public int compare(Voertuig v1, Voertuig v2) {
			// als prijs gelijk => komen toch in de set omdat return = -1 ipv 0.
			return v2.getAankoopprijs()==v1.getAankoopprijs() ? -1 : v2.getAankoopprijs()-v1.getAankoopprijs(); 
		}
	};
	
	public Nummerplaat getNummerplaat() {
		return nummerplaat;
	}
	
	public String getMerk() {
		return merk;
	}
	
	public void setMerk(String merk) {
		this.merk = merk;
	}
	
	public int getAankoopprijs() {
		return aankoopprijs;
	}
	
	public void setAankoopprijs(int aankoopprijs) throws Fout {
		if (aankoopprijs < 1) {
			throw new Fout("Aankoopprijs moet > zijn dan 0");
		}
		this.aankoopprijs = aankoopprijs;
	}
	
}
