package oef33MultiThreadingRunnable;

public class Stapel {
	
	private int aantalPannenkoeken; 
	
	public void voegPannenkoekToe() { 
		System.out.println("1 pannenkoek meer:" + aantalPannenkoeken); 
		synchronized (this) { 
			++aantalPannenkoeken; 
		}
	}
	
	public void neemPannenkoekAf() { 
		System.out.println("1 pannenkoek minder:" + aantalPannenkoeken); 
		synchronized (this) { 
			if (aantalPannenkoeken > 0) {
				--aantalPannenkoeken;
			} 
		}
	}
	
	public int getAantalPannenkoeken() { 
		return aantalPannenkoeken; 
	}
	
}
