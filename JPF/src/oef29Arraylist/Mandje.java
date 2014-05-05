package oef29Arraylist;

import java.math.BigDecimal; 
import java.util.HashMap; 
import java.util.Iterator; 
import java.util.Map; 

public class Mandje { 
	public Mandje() { } 
	
	private Map <Product,Integer> mandje = new HashMap <Product,Integer> (20); 
	
	public void add(Product product, int aantal) { 
		if (! mandje.containsKey(product) ) mandje.put(product, aantal); 
		else
			set(product, aantal); 
		} 
	
	public void set(Product product, int aantal) { 
		int oudeAantal=mandje.get(product); 
		mandje.put(product,oudeAantal + aantal); 
		} 
	
	public void remove(Product product) { 
		mandje.remove(product); 
		} 
	
	public void clear() { 
		mandje.clear(); 
		} 
	
	public BigDecimal getSom() { 
		BigDecimal som = BigDecimal.ZERO; 
		for (Map.Entry<Product,Integer> entry : mandje.entrySet()) { 
			som = som.add(entry.getKey().getPrijs().multiply( new BigDecimal (entry.getValue() ) ) ); 
			} 
		return som; 
		} 
	/* iterator --> er zijn 3 zichten : alleen de keys, alleen de 
	 *  values of beiden ! 
	 *  Dus hier een iterator van Map.Entry objecten 
	 */ 
	
	public Iterator <Map.Entry <Product,Integer>> iterator() { 
		return mandje.entrySet().iterator(); 
		} // een entry is een interne class van Map 
			
}