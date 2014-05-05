package Hfst10Exceptions;

public class Exceptryout {
	
	//public ExepTryout() {
	//	
	//}
	
	public static void main(String[] args) { 
		int[] lijst = { 2, 1, 3, 0, 5}; 
		int eenGetal = 3; 
		
		for (int i=0;i<lijst.length;i++) { 
			try { 
				System.out.println(eenGetal + " / " + lijst[i] + " = " + eenGetal/lijst[i]); 
			} 
			catch (ArithmeticException e) { 
				System.out.println("Deling door nul"); 
			} 
			finally { 
				System.out.println(lijst[i] + " x " + eenGetal + " = " + eenGetal * lijst[i]); } 
			} 
		} 
	}