package be.vdab.voertuigen;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

import be.vdab.schoolgerief.Boekentas;
import be.vdab.util.Fout;
import be.vdab.util.Laadbaar;
import be.vdab.util.Maat;
import be.vdab.util.Volume;

public class Voertuigenbeheer implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final String WAGENPARKLIJST = "h:/wagenpark.ser";
	
	public static void main(String[] args) throws Fout {
        Set<Voertuig> voertuigenTs = new TreeSet<Voertuig>();
// 2 personenwagens
        Personenwagen mercedes = new Personenwagen("Mercedes",45000, 5);
        voertuigenTs.add(mercedes);
        Personenwagen bmw = new Personenwagen("Bmw",42000, 5);
        voertuigenTs.add(bmw);
// 2 pickups		
        Maat maatp = Maat.CENTIMETER;
        Volume vol = new Volume(180,160,460,maatp);
        voertuigenTs.add (new Pickup("Toyota",59000,5,vol));
        voertuigenTs.add (new Pickup("Dodge",56000,4,new Volume(185,165,510,maatp)));
// 2 vrachtwagens
        Maat maatv = Maat.DECIMETER;
        vol = new Volume(32,21,184,maatv);
        voertuigenTs.add( new Vrachtwagen("Man",123000,vol,35000,4)); 
        vol = new Volume(34,23,186,maatv);
        voertuigenTs.add( new Vrachtwagen("Man",134000,vol,38000,3)); 

        System.out.println("Toon Treeset 1: "); 
        toon(voertuigenTs);
        System.out.println();
        System.out.println("Toon Treeset 2 gesorteerd op aankoopprijs: "); 
        Set<Voertuig> voertuigenTs2 = new TreeSet<>(Voertuig.getComparatorAankoopprijs);
        voertuigenTs2.addAll(voertuigenTs); 
        toon(voertuigenTs2);
        System.out.println();
        System.out.println("Toon Treeset 3 gesorteerd op merk: "); 
        Set<Voertuig> voertuigenTs3 = new TreeSet<>(Voertuig.getComparatorMerk);
        voertuigenTs3.addAll(voertuigenTs);
        toon(voertuigenTs3);
        System.out.println();
        System.out.println("Naar bestand: " + WAGENPARKLIJST + ":");
        naarBestand(voertuigenTs3);
        System.out.println();
        System.out.println("Toon Treeset 4 vanuit bestand: " + WAGENPARKLIJST + ":"); 
        naarTs4();
        System.out.println();
        System.out.println("Array van Laadbaar: "); 
        arayLaadbaar();
        System.out.println();
        System.out.println("Einde oefening!"); 
    }
	
	private static void toon(Set<Voertuig> voertuigenTs) { 
		//System.out.println(); 
		System.out.println("Aantal voertuigen: " + voertuigenTs.size()); 
		for ( Object obj : voertuigenTs) {
			Voertuig v = (Voertuig) obj; 
			System.out.println(v); 
		} 
    }

	private static void naarBestand(Set<Voertuig> voertuigenTs) { 
        try {
        	FileOutputStream file  = new FileOutputStream(WAGENPARKLIJST);
        	ObjectOutputStream objectOutputStream = new ObjectOutputStream(file); 
        	for ( Voertuig v : voertuigenTs) {
        		objectOutputStream.writeObject(v); 
			}
            file.close();
        }
        catch (Exception ex) { 
        	System.out.println(ex); 
        }
	} 
	
	private static void naarTs4() {
        ObjectInputStream inputStream = null;
        Set<Voertuig> voertuigenTs4 = new TreeSet<Voertuig>();
        try {
			FileInputStream fileI = new FileInputStream(WAGENPARKLIJST);
			inputStream = new ObjectInputStream(fileI);
            Object obj = null;
            while ((obj = inputStream.readObject()) != null) {
                if (obj instanceof Voertuig) {
            		voertuigenTs4.add((Voertuig)obj);
			    }
            }
        } 
        catch (EOFException ex) {  
    	}   //komt hier in bij eof.
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
    	} 
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } 
        catch (IOException ex) {
            ex.printStackTrace();
        } 
        finally {
        	try {
        		if (inputStream != null) {
        			inputStream.close();
        		}
        	} catch (IOException ex) {
        		ex.printStackTrace();
        	}
        }
        // Afdrukken Treeset4:    
        for ( Object o : voertuigenTs4) {
            Voertuig v = (Voertuig) o;
            System.out.println(v.toString());
        }
    }
        
    private static void arayLaadbaar() throws Fout {
	    Laadbaar[] laadbaar = new Laadbaar[6];
	    Maat cm = Maat.CENTIMETER;
	    Maat dm = Maat.DECIMETER;
		// 2 pickups		
	    Volume vol = new Volume(180,160,460,cm);
		laadbaar[0]=new Pickup("Toyota",59000,5,vol);
		vol = new Volume(185,165,510,cm);
		laadbaar[1]=new Pickup("Dodge",56000,4,vol);
		// 2 vrachtwagens
		vol = new Volume(32,21,184,dm);
		laadbaar[2]= new Vrachtwagen("Man",123000,vol,35000,4); 
		vol = new Volume(34,23,186,dm);
		laadbaar[3] = new Vrachtwagen("Man",134000,vol,38000,3);
		// 2 boekentasen  
	    vol = new Volume(30,20,10,cm);
	    laadbaar[4]=new Boekentas(vol,"rood");
	    vol = new Volume(20,15,12,cm);
	    laadbaar[5]=new Boekentas(vol,"zwart"); 
	    for (Laadbaar lb:laadbaar)
	            System.out.println(lb.getLaadvolume()); 
	    }
}
