package be.vdab.voertuigen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Set;
import java.util.TreeSet;

import be.vdab.util.Maat;
import be.vdab.util.Volume;

public class Voertuigenbeheer {
	
	private static final String WAGENPARKLIJST = "c:/JohanTans/wagenpark.ser";
	
	public static void main(String[] args) {
		Set<Voertuig> voertuigenTs = new TreeSet<Voertuig>();
// 2 personenwagens
		Personenwagen mercedes = new Personenwagen("Mercedes", 45000, 5);
		voertuigenTs.add(mercedes); 
		Personenwagen bmw = new Personenwagen("Bmw", 42000, 5);
		voertuigenTs.add(bmw);
		//voertuigenTs.add(new Personenwagen("Mercedes",45000,5));
// 2 pickups		
		Maat maatp = Maat.CENTIMETER;
		Volume vol = new Volume(180,160,460,maatp);
		voertuigenTs.add (new Pickup("Toyota",59000,vol));
		vol = new Volume(185,165,510,maatp);
		voertuigenTs.add (new Pickup("Dodge",56000,vol));
// 2 vrachtwagens
		Maat maatv = Maat.DECIMETER;
		vol = new Volume(32,21,184,maatv);
		voertuigenTs.add( new Vrachtwagen("Man",123000,vol,35000,4)); 
		vol = new Volume(34,23,186,maatv);
		voertuigenTs.add( new Vrachtwagen("Man",134000,vol,38000,3)); 
		
		System.out.println("Toon Treeset 1: "); 
		toon(voertuigenTs);
		System.out.println();
		
		System.out.println("Toon Treeset 2: "); 
		Set<Voertuig> voertuigenTs2 = new TreeSet<Voertuig>(Voertuig.getComparatorAankoopprijs);
  		voertuigenTs2.addAll(voertuigenTs); 
		System.out.println();
		toon(voertuigenTs2);

		System.out.println("Toon Treeset 3: "); 
		Set<Voertuig> voertuigenTs3 = new TreeSet<Voertuig>(Voertuig.getComparatorMerk);
  		voertuigenTs3.addAll(voertuigenTs); 
		System.out.println();
		naarBestand(voertuigenTs3);
		
		System.out.println("Toon Treeset 4: "); 
		System.out.println();
		naarTs4();
		
		
		System.out.println("Einde oefening!"); 
	}
	
	private static void toon(Set<Voertuig> voertuigenTs) { 
		System.out.println(); 
		System.out.println(voertuigenTs.size()); 
		for ( Object obj : voertuigenTs) {
			Voertuig v = (Voertuig) obj; 
			System.out.println(v.toString()); 
		} 
	}

	private static void naarBestand(Set<Voertuig> voertuigenTs) { 
		try {
			FileOutputStream lijst  = new FileOutputStream(WAGENPARKLIJST); 
			for ( Object obj : voertuigenTs) {
			Voertuig v = (Voertuig) obj;
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(lijst); 
				objectOutputStream.writeObject(v); 
			}
			lijst.close();
			}
		catch (Exception ex) { 
			System.out.println(ex); 
		}
	} 
	
	private static void naarTs4() { 
		FileInputStream file = null; 
		ObjectInputStream obj = null;
		Set<Voertuig> voertuigenTs4 = new TreeSet<Voertuig>();
		try {
			file = new FileInputStream(WAGENPARKLIJST); 
			obj = new ObjectInputStream(file); 
			voertuigenTs4 = (TreeSet<Voertuig>) obj.readObject(); 
			for ( Object o : voertuigenTs4) {
				Voertuig v = (Voertuig) o; 
				System.out.println(v.toString()); 
			} 
		}
		catch (Exception ex) { 
			System.out.println(ex.toString()); 
		}
	} 
	
	/*private static Set<Voertuig> kopieer(Set<Voertuig> voertuigenTs) { 
		Set<Voertuig> voertuigenTs2 = new TreeSet<Voertuig>(Voertuig.getComparatorAankoopprijs);
		voertuigenTs2.addAll(voertuigenTs); 
		for ( Object obj : voertuigenTs2) {
			Voertuig v = (Voertuig) obj; 
			System.out.println(v.toString()); 
		} 
		return voertuigenTs2;
	}*/
	
}
