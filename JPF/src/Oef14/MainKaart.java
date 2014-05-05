package Oef14;

import java.util.Scanner;

public class MainKaart {

	public static void main(String[] args) { 
		
		String kleur = getKleur();
		String rang = getRang();
		Kaart kaart1  = new Kaart(kleur,rang);
		kaart1.PrintKaart(kleur, rang);
		
		kleur = getKleur();
		rang = getRang();
		Kaart kaart2  = new Kaart(kleur,rang);
		kaart2.PrintKaart(kleur, rang);
		
		int rang1 = getRang2(kaart1.getRang());
		int rang2 = getRang2(kaart2.getRang());
		
		if (rang1 > rang2) {
			System.out.println ("kaart 1 is hoger"); }
		else {
			System.out.println ("kaart 2 is hoger");
		}; 
	}

	private static int getRang2(String rang) {
		switch (rang) { 
			case "B":
				return 11; 
			case "V":
				return 12; 
			case "H":
				return 13; 
			case "A":
				return 14; 
			default: 
				return Integer.parseInt(rang);
			}
		}
	
	private static String getRang() {
		System.out.println ("geef Rang (1-10/B/V/H/A): ");
		Scanner sc = new Scanner(System.in);
		String rang = sc.nextLine();
		return rang;
	}

	private static String getKleur() {
		System.out.println ("geef Kleur (H/R/K/S): ");
		Scanner sc = new Scanner(System.in);
		String kleur = sc.nextLine();
		return kleur;
	}
	
}
