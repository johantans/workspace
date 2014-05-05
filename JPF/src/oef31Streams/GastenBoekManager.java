package oef31Streams; 

import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileOutputStream; 
import java.io.ObjectInputStream; 
import java.io.ObjectOutputStream; 

public class GastenBoekManager { 
	
	private static final String GASTENBOEK_PATH = "c:/johanTans/gastenboek.dat"; 
	
	public void save(GastenBoek gastenboek) { 
		try { 
			FileOutputStream fileOutputStream = new FileOutputStream(GASTENBOEK_PATH); 
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream); 
			objectOutputStream.writeObject(gastenboek);
			objectOutputStream.close();
			} 
		catch (Exception ex) { 
			System.out.println(ex); } 
		} 
	
	public GastenBoek load() { 
		File file = new File(GASTENBOEK_PATH); 
		if (file.exists()) { 
			try { FileInputStream fileInputStream = new FileInputStream(GASTENBOEK_PATH); 
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream); 
			return (GastenBoek) objectInputStream.readObject(); 
			} 
			catch (Exception ex) { 
				System.out.println(ex);
				return null; 
				} 
			} else { 
				return new GastenBoek(); 
				} 
		} 
	}	
	

