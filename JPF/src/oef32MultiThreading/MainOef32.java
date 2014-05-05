package oef32MultiThreading;

import java.util.Random;

import oef33MultiThreadingRunnable.Klant;

public class MainOef32 {

	public static void main(String[] args) throws Exception {
		double[] getallen = new double [1000000]; 
		int tel = 0;
		Random r = new Random();
		//1000000 is ook wel genoeg
		while (tel < getallen.length) { 
			getallen[tel] = r.nextDouble() * 1000;
			//System.out.println (getallen[tel]);
			tel ++; 
			}
		Bereken thread1 = new Bereken(getallen,0,499000);
		Bereken thread2 = new Bereken(getallen,500000,999999);
		thread1.start();
		thread2.start();
		try {
			thread1.join(); 
			thread2.join(); 
		} catch (InterruptedException ex) { 
			System.err.println(ex); 
		}
		
		System.out.println ("gem1= " + thread1.getGemiddelde());  
		System.out.println ("gem2= " + thread2.getGemiddelde());  
		System.out.println ("alg gem= " + (thread1.getGemiddelde() + thread2.getGemiddelde())/2);  
	}
}	

		
		
		
		
		
		
