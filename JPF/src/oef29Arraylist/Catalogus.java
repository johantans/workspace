package oef29Arraylist;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Catalogus { 
	private List <Product> lijst = new ArrayList<Product> (10); 	
	/* Opm.: List: nu kan 2x hetzelfde product in de catalogus zitten 
	 * * --> wat wil je ermee kunnen doen, wat is bepaald in de analyse? 
	*/ 
	
	public Catalogus() { 
		lijst.add(new Product("appelen", new BigDecimal("0.34") ) ); 
		lijst.add(new Product("peren", new BigDecimal("0.56"))); 
		lijst.add(new Product("citroenen", new BigDecimal("0.64" ) ) ); 
		lijst.add(new Product("aardbeien", new BigDecimal("2.85" ) ) );
		lijst.add(new Product("mandarijnen", new BigDecimal("1.60" ) )); 
		lijst.add(new Product("noten", new BigDecimal("2.35" ) ) ) ; 
		lijst.add(new Product("kastanjes", new BigDecimal("2.15" ) ) ) ;
		lijst.add(new Product("rozijnen", new BigDecimal("1.90" ) ) ) ; 
		lijst.add(new Product("pruimen", new BigDecimal("0.42" ) ) ) ;
		lijst.add(new Product("tomaten", new BigDecimal("0.32" ) ) ) ; 
	} 
	
	public Iterator <Product> iterator() { 
		return lijst.iterator(); 
	} 
}