package oef33MultiThreadingRunnable;

public class Klant implements Runnable {
	
private Stapel stapel; 
	
	public Klant(Stapel st) {
		this.stapel = st; 
	}

	@Override 
	public void run() { 
		for (int i = 0; i <50; i++) {
			stapel.neemPannenkoekAf();
			try { Thread.sleep(100); 
			} 
			catch (InterruptedException ex) { 
				System.err.println(ex); 
			} 
		} 
	} 
}