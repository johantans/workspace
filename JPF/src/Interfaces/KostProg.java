package Interfaces;

public class KostProg { 
	public static void main(String[] args) {
		
//(1) We maken een array van het interface-datatype Kost. 
		Kost[] kosten = new Kost[4]; 
		
// (2) Elk van de references laten we wijzen naar een class die de interface Kost implementeert.
		kosten[0]=new Werknemer("Eddy",2000.0); 
		kosten[1]=new Werknemer("Marva",1500.0); 
		kosten[2]=new Vrachtwagen("DAF",0.35,25000,150000.0, 8); 
		kosten[3]=new Kopieermachine("Konica",0.02,9000);  
		
// (3) We definiëren twee doubles om de kosten te totaliseren.
		double mensKosten=0.0, andereKosten=0.0; 
		
/*4) Deze instructie vergt extra uitleg. Hier staat een “collection based for loop”. 
	 ook wel een “enhanced for loop” genoemd of een ”for each loop”. 
	 Je leest deze instructie als volgt: 
	 “Doorloop de array kosten en stop de elementen één voor één in een variabele eenKost die van het type Kost is.” 
	 Meer over de collection based for loop op pagina 126.
*/		
		for (Kost eenKost:kosten) {
			if (eenKost.personeelsKost()) {
				mensKosten+=eenKost.bedragKost(); 
			}	else {
				andereKosten+=eenKost.bedragKost();
			}
		
		System.out.println("Mens kosten:"+mensKosten); 
		System.out.println("Andere kosten:"+andereKosten);
		
		}
		
		} 
	}