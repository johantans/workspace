package oef31Streams;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MainOef31 { 
	
	public static void main(String[] args) { 
		GastenBoekManager gastenBoekManager = new GastenBoekManager(); 
		GastenBoek gastenBoek; 
		Scanner scanner = new Scanner(System.in); 
		System.out.print("1=lezen, 2=toevoegen:"); 
		switch (scanner.nextInt()) { 
			case 1: //Lezen
				gastenBoek = gastenBoekManager.load(); 
				List<GastenBoekEntry> entries = gastenBoek.getALGasten(); 
				Collections.reverse(entries); 
				for (GastenBoekEntry entry : entries) { 
					System.out.println(entry.toString()); 
					} 
				break; 
			case 2: //Toevoegen
				scanner.nextLine(); 
				System.out.print("Schrijver:"); 
				String schrijver = scanner.nextLine(); 
				System.out.print("Boodschap:"); 
				String boodschap = scanner.nextLine();
				GastenBoekEntry entry = new GastenBoekEntry(new Date(),schrijver, boodschap); 
				gastenBoek = gastenBoekManager.load(); 
				gastenBoek.add(entry); 
				gastenBoekManager.save(gastenBoek); 
				break; 
			case 3: 
				System.out.println("Verkeerde keuze"); 
			} 
		System.out.println("Einde programma!");
		scanner.close();
		} 
	}
