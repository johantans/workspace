package Oef22;

import Oef22.IVoorwerp;

public class Boek implements IVoorwerp{

	private String titel = "";
	private String auteur = "";
	private String eigenaar = "";
	private double aankoopprijs = 0; 
	private String genre = "";
		
	public Boek() {
	}

	public Boek(String titel, String auteur, String eigenaar,
			double aankoopprijs, String genre) {
		super();
		this.titel = titel;
		this.auteur = auteur;
		this.eigenaar = eigenaar;
		this.aankoopprijs = aankoopprijs;
		this.genre = genre;
	}

	public String toString() {
		String x = "Titel: " + titel;
		x = x + "  Auteur: " + auteur; 
		x = x + "  Eigenaar: " + eigenaar; 
		x = x + "  Aankoopprijs: " + Double.toString(aankoopprijs);
		x = x + "  Genre: " + genre;
		return x;
	}

	@Override
	public void gegevensTonen() {
		System.out.println("Boek: " + toString()); 
	}

	@Override
	public double winstBerekenen() {
		return this.aankoopprijs * 2;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getEigenaar() {
		return eigenaar;
	}

	public void setEigenaar(String eigenaar) {
		this.eigenaar = eigenaar;
	}

	public double getAankoopprijs() {
		return aankoopprijs;
	}

	public void setAankoopprijs(double aankoopprijs) {
		this.aankoopprijs = aankoopprijs;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}
