package Oef15;

import java.util.Scanner;

import Interfaces.Kopieermachine;
import Interfaces.Kost;
import Interfaces.Vrachtwagen;
import Interfaces.Werknemer;

public class Hoofdprogramma {

	final static String phTekst = "Geef polishouder(tekst): ";
	final static String kpTekst = "Geef kostprijs(float): ";
	final static String pkTekst = "Geef aantal PK(int): ";
	final static String vbTekst = "Geef verbruik(float): ";
	final static String nplTekst = "Geef nummerplaat(string):";
	final static String dTekst = "Geef aantal deuren(integer):";
	final static String pTekst = "Geef aantal personen(integer):";
	final static String mlTekst = "Geef maximumlading:";
	
//(1) We maken een array van het interface-datatype Kost. 
	static Vervuiler [] vervuil = new Vervuiler[4]; 
	static int teller = -1; // -1 omdat dan eerste element op 0 begint.
	
  	public static void main(String[] args) { 
  		/*System.out.println ("Soort voertuig (P/V/9 om te stoppen): ");
		Scanner sc = new Scanner(System.in); // 1x openen en scanner mee doorgeven. 
		String keuze = sc.nextLine();
		while (!"9".equals(keuze)) {
			if ("P".equals(keuze)) { 
				verwerkP(sc);
			}
			if ("V".equals(keuze)) { 
				verwerkV(sc);
			}
			System.out.println ("Soort volgend voertuig (P/V/9 om te stoppen): ");
			keuze = sc.nextLine();
		}
		*/
		
  		
  		vervuil[0] = new Personenwagen("Jef", 15000, 100, 6, "evf777", 5, 4);
  		vervuil[1] = new Oef15.Vrachtwagen ("Jan", 25000, 125, 10, "gfd125", 50);
  		vervuil[2] = new Personenwagen("Luc", 14000, 100, 6, "dvf777", 5, 2);
  		vervuil[3] = new Oef15.Vrachtwagen ("Frans", 24000, 135, 10, "gfd225", 40);
		
  		
		double vv = 0; 
  		for (Vervuiler eenvervuil:vervuil) {
			vv = eenvervuil.geefvervuiler();
			System.out.println("vervuiling:" + vv) ;
		}
		System.out.println ("Einde van de oefening!");
		//sc.close();
		
	}
		
	private static void verwerkP(Scanner sc) {
		String ph = getWaarde(phTekst,sc); 
		float kp = Float.parseFloat(getWaarde(kpTekst,sc));
		int pk = Integer.parseInt(getWaarde(pkTekst,sc));
		float vb = Float.parseFloat(getWaarde(vbTekst,sc)); 
		String npl = getWaarde(nplTekst,sc);
		int d = Integer.parseInt(getWaarde(dTekst,sc));
		int p = Integer.parseInt(getWaarde(pTekst,sc));
		Personenwagen otto = new Personenwagen(ph, kp, pk, vb, npl, d, p);
		System.out.println ("Kyoto voor polishouder: " + ph + ": " + Double.toString(otto.getKyotoScore()));
		teller = teller + 1;
		vervuil[teller] = otto;
	}
		
	private static void verwerkV(Scanner sc) {
		String ph = getWaarde(phTekst,sc); 
		float kp = Float.parseFloat(getWaarde(kpTekst,sc));
		int pk = Integer.parseInt(getWaarde(pkTekst,sc));
		float vb = Float.parseFloat(getWaarde(vbTekst,sc)); 
		String npl = getWaarde(nplTekst,sc);
		float ml = Float.parseFloat(getWaarde(mlTekst,sc)); 
		Oef15.Vrachtwagen camion = new Oef15.Vrachtwagen (ph, kp, pk, vb, npl, ml);
		System.out.println ("Kyoto voor vrachtwagen van " + ph + ": " + Double.toString(camion.getKyotoScore()));
		teller = teller + 1;
		vervuil[teller] = camion;
	}
	
	private static String getWaarde(String tekst,Scanner sc) {
		System.out.println (tekst);
		String x = sc.nextLine();
		return x;
	}
}
