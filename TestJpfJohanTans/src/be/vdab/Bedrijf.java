package be.vdab;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

import be.vdab.personeel.Arbeider;
import be.vdab.personeel.Bediende;
import be.vdab.personeel.NaamException;
import be.vdab.personeel.PersnrException;
import be.vdab.personeel.Werknemer;
import be.vdab.personeel.kader.Kaderlid;
import be.vdab.util.DatumException;
import be.vdab.util.WerknemersDatum;

public class Bedrijf implements Serializable{
	private static final long serialVersionUID = 1L;
	private static final String personeelsLijst = "h:/personeel.dat";

	public static void main(String[] args) throws PersnrException, NaamException, DatumException {
		System.out.println("Lijst werknemers:");
		System.out.println();
		
		Set<Werknemer> ts = new TreeSet<Werknemer>();
		ts.add(new Arbeider(1,"Anna",new WerknemersDatum(1, 2, 1980),15));
		ts.add(new Bediende(2,"Brenda",new WerknemersDatum(1, 3, 1980),1500));
		ts.add(new Arbeider(3,"Carla",new WerknemersDatum(1, 2, 1979),15));
		ts.add(new Bediende(4,"Daniel",new WerknemersDatum(1, 3, 1978),1500));
		ts.add(new Kaderlid(5,"Els",new WerknemersDatum(13, 3, 1977),2500,"chef"));
		try { 
			ts.add(new Kaderlid(6,"Frank",new WerknemersDatum(13, 12, 1777),3000,"heel oude chef"));
		}
		catch (DatumException ex) { 
	       	System.out.println(ex.getMessage() + ": " + ex.getDatumVerkeerd()); 
	    }
		
		for ( Werknemer w : ts) {
			System.out.println(w); 
		} 
		
		System.out.println();
		
		System.out.println("Kontrole:");
		System.out.println();
		
		try {
        	FileOutputStream file  = new FileOutputStream(personeelsLijst);
        	ObjectOutputStream o = new ObjectOutputStream(file); 
        	//for ( Werknemer w : ts) {
        	//	System.out.println(w); 
        	//	o.writeObject(w);
        	//  }
    		o.writeObject(ts);
            file.close();
        }
        catch (Exception ex) { 
        	System.out.println(ex); 
        }
	}
}
