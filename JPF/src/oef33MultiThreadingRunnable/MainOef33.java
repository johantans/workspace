package oef33MultiThreadingRunnable;

public class MainOef33 {

	public static void main(String[] args) throws Exception {
	Stapel stapel = new Stapel(); 
	Thread threadKok1 = new Thread(new Kok(stapel)); 
	Thread threadKok2 = new Thread(new Kok(stapel)); 
	Thread threadKl1 = new Thread(new Klant(stapel)); 
	Thread threadKl2 = new Thread(new Klant(stapel)); 
	Thread threadKl3 = new Thread(new Klant(stapel)); 
	Thread threadKl4 = new Thread(new Klant(stapel)); 
	
	threadKok1.start(); 
	threadKok2.start();
	threadKl1.start();
	threadKl2.start();
	threadKl3.start();
	threadKl4.start();
	
	try { 
		threadKok1.join(); 
		threadKok2.join(); 
		threadKl1.join(); 
		threadKl2.join(); 
		threadKl3.join(); 
		threadKl4.join(); 
			
	} 
	catch (InterruptedException ex) { 
		System.err.println(ex); 
		} 
	System.out.println(stapel.getAantalPannenkoeken()); 
	}

}

