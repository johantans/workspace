package be.vdab.voertuigen;

import java.io.Serializable;
import java.util.Comparator;

import be.vdab.util.Fout;
import be.vdab.voertuigen.div.Div;
import be.vdab.voertuigen.div.Nummerplaat;

public class Voertuig implements Serializable,Comparable {
	
	private static final long serialVersionUID = 1L;
	//private Nummerplaat nummerplaat = new Nummerplaat(Div.getInstance().getNummerplaat().getPlaat());  
	private Nummerplaat nummerplaat;  
	private String merk; 
	private int aankoopprijs;
	
	
	
	public Voertuig(Nummerplaat nummerplaat, String merk, int aankoopprijs) {
		super();
		this.nummerplaat =  new Nummerplaat(Div.getInstance().getNummerplaat().getPlaat());
		this.merk = merk;
		this.aankoopprijs = aankoopprijs;
	}

	public Voertuig(String merk, int aankoopprijs) {
		this.nummerplaat =  new Nummerplaat(Div.getInstance().getNummerplaat().getPlaat());
		this.merk = merk;
		this.aankoopprijs = aankoopprijs;
	}
	
	public String toString() {
		return "Merk: " + this.merk + " aankoopprijs: " + this.aankoopprijs; 
	}
	
	public boolean equals(Object object) {
		if (! (object instanceof Voertuig)) { 
			return false; 
			} 
		Voertuig andere = (Voertuig) object; 
		return this.nummerplaat.equals(andere.nummerplaat); }
	
	
	public int hashCode() {
		return nummerplaat.getPlaat().hashCode();
	}
	
	@Override 
	public int compareTo(Object object) { 
		return this.getNummerplaat().compareTo(((Voertuig) object).getNummerplaat()); }
	
	public static Comparator<Voertuig> getComparatorMerk = new Comparator<Voertuig>() {
		public int compare(Voertuig v1, Voertuig v2) {
		String merk1 = v1.merk.toUpperCase();
		String merk2 = v2.merk.toUpperCase();
		return merk1.compareTo(merk2);
		}
	};

	public static Comparator<Voertuig> getComparatorAankoopprijs = new Comparator<Voertuig>() {
		public int compare(Voertuig v1, Voertuig v2) {
			return v2.getAankoopprijs()==v1.getAankoopprijs() ? -1 : v2.getAankoopprijs()-v1.getAankoopprijs(); 
		}
	};
	
	public Nummerplaat getNummerplaat() {
		return nummerplaat;
	}
	
	public void setNummerplaat(Nummerplaat nummerplaat) {
		this.nummerplaat = nummerplaat;
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
		if (this.aankoopprijs < 1) {
			throw new Fout("Aankoopprijs moet > zijn dan 0");
		}
		this.aankoopprijs = aankoopprijs;
	}
	
}
