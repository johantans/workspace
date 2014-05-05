package Oef12;

/**
 * @author zi12
 *
 */
public class Waarnemer {

	private int temp[];
	private int minTemp;
	private int maxTemp;
	private int gemTemp;	
	
	
	public Waarnemer(int[] temp, int minTemp, int maxTemp, int gemTemp) {
		super();
		this.temp = temp;
		this.minTemp = minTemp;
		this.maxTemp = maxTemp;
		this.gemTemp = gemTemp;
	}


	public void verwerkTemp(int temp[]) {
		
	}
	
	public int[] getTemp() {
		return temp;
	}


	public void setTemp(int[] temp) {
		this.temp = temp;
	}


	public int getMinTemp() {
		return minTemp;
	}
	
	public void setMinTemp(int minTemp) {
		this.minTemp = minTemp;
	}
	
	public int getMaxTemp() {
		return maxTemp;
	}
	
	public void setMaxTemp(int maxTemp) {
		this.maxTemp = maxTemp;
	}

	public int getGemTemp() {
		return gemTemp;
	}

	public void setGemTemp(int gemTemp) {
		this.gemTemp = gemTemp;
	}
	 
}
