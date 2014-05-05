package Oef15Verbetering;

import java.util.Scanner;

public class Hoofdprogramma {

	final static String phTekst = "Geef polishouder(tekst): ";
	final static String kpTekst = "Geef kostprijs(float): ";
	final static String pkTekst = "Geef aantal PK(int): ";
	final static String vbTekst = "Geef verbruik(float): ";
	final static String nplTekst = "Geef nummerplaat(string):";
	final static String dTekst = "Geef aantal deuren(integer):";
	final static String pTekst = "Geef aantal personen(integer):";
	final static String mlTekst = "Geef maximumlading:";
	
	
	public static void main(String[] args) { 
		System.out.println ("Soort voertuig (P/V/9 om te stoppen): ");
		Scanner sc = new Scanner(System.in); // 1x openen en scanner mee doorgeven. 
		String keuze = sc.nextLine();
		while (keuze != "9") {
			if (!"9".equals(keuze)) { 
				if ("P".equals(keuze)) { 
					verwerkP(sc);
				};
				if ("V".equals(keuze)) { 
					verwerkV(sc);
				};
			}
			System.out.println ("Soort voertuig (P/V/9 om te stoppen): ");
			keuze = sc.nextLine();
			
		}
		
		System.out.println ("Einde van de oefening!");
		sc.close();
		
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
	
	}
		
	private static void verwerkV(Scanner sc) {
		String ph = getWaarde(phTekst,sc); 
		float kp = Float.parseFloat(getWaarde(kpTekst,sc));
		int pk = Integer.parseInt(getWaarde(pkTekst,sc));
		float vb = Float.parseFloat(getWaarde(vbTekst,sc)); 
		String npl = getWaarde(nplTekst,sc);
		float ml = Float.parseFloat(getWaarde(mlTekst,sc)); 
		Vrachtwagen camion = new Vrachtwagen (ph, kp, pk, vb, npl, ml);
		System.out.println ("Kyoto voor vrachtwagen van " + ph + ": " + Double.toString(camion.getKyotoScore()));
	}
	
	private static String getWaarde(String tekst,Scanner sc) {
		System.out.println (tekst);
		String x = sc.nextLine();
		return x;
	}
}
