package Oef14;

public class Kaart {

	private String kleur; 
	private String rang;
	
	public Kaart(String kleur, String rang) {
		super();
		this.kleur = kleur;
		this.rang = rang;
	}
	
	public void PrintKaart(String kleur, String rang) {
		
		System.out.println ("Afdruk vd kaart: " + kleur + rang);
	}
	
	public String getKleur() {
		return kleur;
	}
	public void setKleur(String kleur) {
		this.kleur = kleur;
	}
	public String getRang() {
		return rang;
	}
	public void setRang(String rang) {
		this.rang = rang;
	}
	
	
}
