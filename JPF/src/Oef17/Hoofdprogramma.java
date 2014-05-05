package Oef17;

import java.util.Scanner;

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
		System.out.println ("Einde van de oefening!");
		sc.close();
		
	}		
		
	private static void verwerkZin(String zin,Scanner sc) {
		int klinkers = 0;
		StringBuffer zin2 = new StringBuffer(zin.toUpperCase());
		for (int teller=0;teller<zin2.length();teller++) 
			switch (zin2.charAt(teller)) {
			case 'A': case 'E': case 'I': case 'O': case 'U': 
				klinkers++;
                break;
            default:
                break;
			}
		System.out.println ("Deze zin telt " + klinkers  + " klinkers.");
	}
}
