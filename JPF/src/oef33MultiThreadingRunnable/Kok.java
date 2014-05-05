package oef33MultiThreadingRunnable;

public class Kok implements Runnable { 
	
	private Stapel stapel; 
	
	public Kok(Stapel st) {
		this.stapel = st; 
	}

	@Override 
	public void run() { 
		for (int i = 0; i != 100; i++) {
			stapel.voegPannenkoekToe(); 
			try { Thread.sleep(10); 
			} 
			catch (InterruptedException ex) { 
				System.err.println(ex); 
				} 
			} 
		} 
	}
