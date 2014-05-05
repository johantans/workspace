package Oef26CollectionsArraylist;

public class Land {

	private String landcode; 
	private String landnaam; 
	private String hoofdstad; 
	private double inwoners;
	private double opp;
	
	public Land() {
		
	}
	
	public Land(String landcode, String landnaam, String hoofdstad,
			double inwoners, double opp) {
		super();
		this.landcode = landcode;
		this.landnaam = landnaam;
		this.hoofdstad = hoofdstad;
		this.inwoners = inwoners;
		this.opp = opp;
	}

	public Land(Land orig) { // ifv het kopieren vh ene land naar het andere (pg. 73)
		super();
		setLandcode(orig.landcode);
		setLandnaam(orig.landnaam);
		setHoofdstad(orig.hoofdstad);
		setInwoners(orig.inwoners);
		setOpp(orig.opp);
	}
	
	public double berekenBevDichtheid (double i, double o) {
		return  i / o; 
		
	}
	
	public String getLandcode() {
		return landcode;
	}

	public void setLandcode(String landcode) {
		this.landcode = landcode;
	}

	public String getLandnaam() {
		return landnaam;
	}

	public void setLandnaam(String landnaam) {
		this.landnaam = landnaam;
	}

	public String getHoofdstad() {
		return hoofdstad;
	}

	public void setHoofdstad(String hoofdstad) {
		this.hoofdstad = hoofdstad;
	}

	public double getInwoners() {
		return inwoners;
	}

	public void setInwoners(double inwoners) {
		this.inwoners = inwoners;
	}

	public double getOpp() {
		return opp;
	}

	public void setOpp(double opp) {
		this.opp = opp;
	}
	
}
