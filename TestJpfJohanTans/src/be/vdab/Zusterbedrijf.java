package be.vdab;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

import be.vdab.personeel.Werknemer;

public class Zusterbedrijf implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final String personeelsLijst = "h:/personeel.dat";

	public static void main(String[] args) {
		System.out.println("Lijst werknemers vanuit personeel.dat:");
		System.out.println();
		
		ObjectInputStream inputStream = null;
        try {
			FileInputStream fileI = new FileInputStream(personeelsLijst);
			inputStream = new ObjectInputStream(fileI);
            Object obj = null;
            while ((obj = inputStream.readObject()) != null) {
            	//System.out.println(((Werknemer)obj).toString());
            	Werknemer w = (Werknemer) obj; 
        		System.out.println(w); 
        		}
            }
        catch (Exception ex) {  
        	ex.getMessage();
    	}   //komt hier in bij eof.
        finally {
        	try {
        		if (inputStream != null) {
        			inputStream.close();
        		}
        	} catch (IOException ex) {
        		ex.printStackTrace();
        	}
        }

	}

}
