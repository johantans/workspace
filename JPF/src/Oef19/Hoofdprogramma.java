package Oef19;

import java.util.*;

public class Hoofdprogramma {
	
	public static void main(String[] args) { 
		System.out.println ("Tik een zin in (9 om te stoppen): ");
		Scanner sc = new Scanner(System.in); // 1x openen en scanner mee doorgeven. 
		String keuze = sc.nextLine();
		while (!keuze.equals("9")) {
			verwerkZin(keuze, sc);
			System.out.println ("Tik een zin in (9 om te stoppen): ");
			keuze = sc.nextLine();
		}
		System.out.println ("Einde.");
		sc.close();
		
	}		
		
	private static void verwerkZin(String zin, Scanner sc) {
		StringBuffer buffer = new StringBuffer(zin);
		buffer.reverse();
		if  ((buffer.toString()).equals(zin)) { // Niet vergeten buffer terug om te zetten in string
			System.out.println (buffer + " is een palindroom.");
		}	else {
			System.out.println (buffer + " is GEEN palindroom.");
		}
	}
}