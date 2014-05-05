package oef31Streams;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GastenBoek implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private List <GastenBoekEntry> aLGasten = new ArrayList<GastenBoekEntry>();
	
	public GastenBoek() {
	}

	public GastenBoek(List<GastenBoekEntry> aLGasten) {
		this.aLGasten = aLGasten;
	}
	
	public void add(GastenBoekEntry gbe) { 
		this.aLGasten.add(gbe); 
		} 

	public List<GastenBoekEntry> getALGasten() {
		return aLGasten;
	}

	public void setALGasten(List<GastenBoekEntry> aLGasten) {
		this.aLGasten = aLGasten;
	} 
	
}
