package oef29Arraylist;

import java.util.Iterator;
import java.util.Map;

public class MainMandje { 
	
	public static void main(String[] args) { 
		Catalogus catalogus = new Catalogus(); //wordt meteen gevuld door de constructor
		Iterator <Product> pi = catalogus.iterator(); //Iterator op een list
		
		int i=1; 
		Mandje mandje = new Mandje (); 
		//mandje programmatorisch vullen 
		while(pi.hasNext() ) { 
			Product p = pi.next(); 
			System.out.println(p); 
			i++; 
			//Mandje opvullen als i modulus 2 0 is dus elementen 0,2,4,6 en 8
			//aantal gekocht per produkt = i
			if (i%2==0) mandje.add(p,i);   
			} 
		System.out.println("u kocht:"); 
		Iterator <Map.Entry <Product,Integer>> mi = mandje.iterator(); 
		while(mi.hasNext() ) { 
			Map.Entry<Product,Integer> aankoop = mi.next(); // iterator op hashmap
			System.out.printf("%s %d \n",aankoop.getKey(), aankoop.getValue()); 
			} 
		System.out.printf("u kocht voor een totaal van: %.2f \n", 
				mandje.getSom() ); 
		} 
	
	/*private static void vulMandje() {
		String prodOms = "";
		int aantal = 0; 
		while (prodOms != "99") {  
			System.out.print("Geef product (99 = stop): ");
			Scanner sc = new Scanner(System.in);
			prodOms = sc.next();
			if (!"99".equals(prodOms) ) {
				System.out.print("Geef aantal: ");
				//Scanner sc = new Scanner(System.in);
				aantal = sc.nextInt();
			}
			sc.close();
			
			
		}
	*/	

}
