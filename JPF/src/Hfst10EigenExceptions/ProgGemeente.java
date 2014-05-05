package Hfst10EigenExceptions;

public class ProgGemeente { 
	
	public static void main(String[] args) { 
		try { 
			Gemeente gemeente1=new Gemeente("Ertvelde",4120); 
			System.out.println (gemeente1.getPostNr() + " is een correct postnr (1000-9999)");
			Gemeente gemeente2=new Gemeente("Ertvelde",120); 
			System.out.println (gemeente2.getPostNr() + " is een correct postnr (1000-9999)");
			Gemeente gemeente3=new Gemeente("Riemst",3770); 
			System.out.println (gemeente2.getPostNr() + " is een correct postnr (1000-9999)");
		} 
		
		catch (PostNrException e) { 
			System.out.println(e.getMessage() + ": " + e.getVerkeerdPostNr()); 
			} 
		}
	}
