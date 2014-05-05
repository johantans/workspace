package Oef28CollectionsHashmap;

import java.util.*;


public class main {

	public static void main(String[] args) {
		
		String [] namen = new String[] {"Johan","Mariella","Marijn","Senne","Janna","Anke","Rivo","Magic"}; 
		
		Map<Character,Integer> landen = new HashMap<Character,Integer>();
		int aantal = 0; 
		for (int tel = 0; tel <=namen.length - 1 ; tel++) {
			Character x = namen[tel].charAt(0); 
			//aantal = landen.get(x);
			if (landen.get(x) == null) {
				landen.put(x,1);
			} else { 
				aantal = landen.get(x) + 1;
				landen.put(x, aantal);
			}
		}
		
		System.out.println ("Voorkomens per letter: ");
		Iterator<Character> it = landen.keySet().iterator(); 
		while (it.hasNext()) { 
			Character eersteletter = it.next(); 
			aantal = landen.get(eersteletter); 
			System.out.println(eersteletter + " komt " + aantal + " keer voor."); 
			}
			
	
		System.out.println ("Grootte vd hashmap: " + landen.size());
		
		System.out.println ("Afdruk vd keys: ");
		Iterator<Character> it2 = landen.keySet().iterator(); 
		while (it2.hasNext()) { 
			System.out.println(it2.next()); 
			}
		
		System.out.println ("Afdruk vd values: ");
		Iterator<Character> it3 = landen.keySet().iterator(); 
		while (it3.hasNext()) { 
			Character eersteletter = it3.next(); 
			aantal = landen.get(eersteletter); 
			System.out.println(aantal); 
			}
		
		
	}	
	
}
