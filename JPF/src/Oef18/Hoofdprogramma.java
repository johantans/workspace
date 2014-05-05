package Oef18;

import java.util.*;

public class Hoofdprogramma {
	
	public static void main(String[] args) { 
		System.out.println ("Tik een berekening (enkel cijfers en */+-) in (9 om te stoppen): ");
		Scanner sc = new Scanner(System.in); // 1x openen en scanner mee doorgeven. 
		String keuze = sc.nextLine();
		while (!keuze.equals("9")) {
			verwerkZin(keuze, sc);
			System.out.println ("Tik een berekening (enkel cijfers en */+-) in (9 om te stoppen): ");
			keuze = sc.nextLine();
		}
		System.out.println ("Einde.");
		sc.close();
		
	}		
		
	private static void verwerkZin(String ber,Scanner sc) {
		int par = 0;
		int result = 0;
		String operator= ""; 
		String stukString = "";
		StringTokenizer strTok = new StringTokenizer(ber," "); 
		while (strTok.hasMoreTokens()) { 
			stukString = strTok.nextToken();
			switch (stukString) {
				case "/": operator = "/"; break;
				case "*": operator = "*"; break;
				case "+": operator = "+"; break;
				case "-": operator = "-"; break; 
				default: // ervan uit gaan dat dit een geldige cijfercombinatie is.
					par = Integer.parseInt(stukString);
					switch (operator) {
					case "/": result = result / par; break;
					case "*": result = result * par; break;
					case "+": result = result + par; break;
					case "-": result = result - par; break; 
					default: 
						par = Integer.parseInt(stukString);
					    if (result == 0)  result = par;
						break; 
					}
				break; 
			}
		}
		System.out.println ("Het resultaat is " + result);
	}
	
}
