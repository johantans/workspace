package oef32MultiThreading;

public class Bereken extends Thread {
	
	private double[] getallen;
	private int tel; 
	private int teltot;
	private double gemiddelde;  
	
	public Bereken(double[] getallen, int tel, int teltot) {
		this.getallen = getallen;
		this.tel = tel;
		this.teltot = teltot;
		this.gemiddelde = 0;
	}

	@Override
	public void run(){
		double som = 0;
		int aantal = 0;
		while (tel < teltot) { 
			som = som + getallen[tel];
			//System.out.println (getallen[tel]);
			tel ++;
			aantal++;
		}	
		gemiddelde = som / aantal; 
	}

	public double[] getGetallen() {
		return getallen;
	}

	public void setGetallen(double[] getallen) {
		this.getallen = getallen;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public int getTeltot() {
		return teltot;
	}

	public void setTeltot(int teltot) {
		this.teltot = teltot;
	}

	public double getGemiddelde() {
		return gemiddelde;
	}

	public void setGemiddelde(double gemiddelde) {
		this.gemiddelde = gemiddelde;
	}
	
}
