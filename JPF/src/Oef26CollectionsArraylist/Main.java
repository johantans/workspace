package Oef26CollectionsArraylist;

import java.text.DecimalFormat;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		double gemdh = 0;
		List landen = new ArrayList(10); 
		vul(landen);
		gemdh = berekendh(landen);
		DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Gemiddelde dichtheid = " + df.format(gemdh)); 
		System.out.println("");
		Land land = zoekKortste(landen,gemdh);
		System.out.println(land.getLandnaam() + " leunt het dichts aan bij gemiddelde:" + 
				 df.format(land.getInwoners() / land.getOpp()));
	}
	
	private static void vul(List landen) { 
		landen.add(new Land("Bel0","Belgie0","Brussel0",10000000,30000));
		landen.add(new Land("Bel1","Belgie1","Brussel1",11000000,31000));
		landen.add(new Land("Bel2","Belgie2","Brussel2",12000000,32000));
		landen.add(new Land("Bel3","Belgie3","Brussel3",13000000,33000));
		landen.add(new Land("Bel4","Belgie4","Brussel4",14000000,34000));
		landen.add(new Land("Bel5","Belgie5","Brussel5",15000000,35000));
		landen.add(new Land("Bel6","Belgie6","Brussel6",16000000,36000));
		landen.add(new Land("Bel7","Belgie7","Brussel7",17000000,37000));
		landen.add(new Land("Bel8","Belgie8","Brussel8",18000000,38000));
		landen.add(new Land("Bel9","Belgie9","Brussel9",19000000,39000));
	} 
	
	private static double berekendh(List landen) { 
		double totdh = 0;  
		for (int i=0; i<landen.size(); i++) {
			Land land = (Land) landen.get(i); // Casten vh het object naar Land.
			totdh = totdh + (land.getInwoners() / land.getOpp());
		}
		return totdh / landen.size(); 
	}

	private static Land zoekKortste(List landen,double gemdh) { 
		double kortste = Double.MAX_VALUE;  
		Land refland = null; 
		for (int i=0; i < landen.size(); i++) {
			Land land = (Land) landen.get(i); // Casten vh het object naar Land.
			double temp = Math.abs(gemdh - (land.getInwoners() / land.getOpp()));
			if (temp < kortste) {
				kortste = temp; 
				refland = new Land (land); // =manier van kopieren 
			}	
		}
		return refland; 
	}

}
