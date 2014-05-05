package HashMap;

	import java.util.*; 
	
	public class BasisOefHashMap {
		
		public static void main(String[] args) { 
			System.out.println("=====================Hashmap==========================");
			hashMap();
			System.out.println("=====================LinkedHashMap========================");
			linkedHashMap();
			System.out.println("=====================TreeMap========================");
			treeMap();
			System.out.println("=====================TreeMapExtra========================");
			treeMapExtra();
			}
	
	private static void hashMap() {	
		Map<String,String> landen = new HashMap<String,String>(); //(1) 
		landen.put("B","Belgie"); //(2) 
		landen.put("NL","Nederland"); 
		landen.put("F","Frankrijk"); 
		landen.put("D","Duitsland"); 
		landen.put("L","Luxemburg"); 
		landen.put(null,null); //(3) 
		
		String eenLand = landen.get("F"); //(4) 
		System.out.println("Land met code F: " + eenLand); 
		
		String vorigLand= landen.put("F", "Finland"); //(5) 
		/* (5)
		 * Er wordt opnieuw een mapping toegevoegd met key “F”, maar nu met value “Finland”. 
		 * Vermits key “F” reeds aanwezig is in de map, 
		 * wordt de vorige value “Frankrijk” overschreven door “Finland”. 
		 * De oude value “Frankrijk” is de terugkeerwaarde van de put(). 
		 * Het is de method put() die er voor zorgt dat de keys uniek blijven in de map!
		 */
		System.out.println("Vorig land met code F: " + vorigLand); 
		
		eenLand = landen.get("F"); 
		System.out.println("Land met code F: " + eenLand); 
		
		System.out.println("*** View van de Keys ***"); 
		Iterator<String> it = landen.keySet().iterator(); //(6) 
					
		/* Een eerste view wordt gemaakt. 
		 * Via de method keySet() bekom je een set van alle keys aanwezig in de map. 
		 * Van deze set kan je een iterator vragen om over de set te itereren. 
		 * Zo wordt per aanwezige key in de set met de method get() de bijbehorende value opgezocht 
		 * zodat je de volledige inhoud van de map kan tonen.
		 * 
		 */
		while (it.hasNext()) { 
			String landcode = it.next(); 
			eenLand = landen.get(landcode); 
			System.out.println(landcode + " heeft als naam: " + eenLand); 
			} 
		
		// testje jt
		System.out.println("*** View2 van de Keys ***"); 
		Collection<String> coll = landen.keySet(); 
		Iterator<String> itjt = coll.iterator();  
		
		while (itjt.hasNext()) { 
			String landcode = itjt.next(); 
			eenLand = landen.get(landcode); 
			System.out.println(landcode + " heeft als naam: " + eenLand); 
			} 
		
		System.out.println("*** View van de Values ***"); 
		it = landen.values().iterator(); //(7) 
		/* Een tweede view wordt gemaakt. 
		 * Via de method values() bekom je een Collection van alle aanwezige values in de map. 
		 * Van deze Collection kan je een iterator opvragen zodat je 
		 * over alle aanwezige values kan itereren om ze vervolgens te tonen.
		 */
		while (it.hasNext()) { 
			String land = it.next(); 
			System.out.println(land); 
			} 
		
		System.out.println("*** View van de Key-Value-paren ***"); 
		Iterator it2 = landen.entrySet().iterator(); //(8) 
		/* Tot slot wordt ook de derde view gemaakt.
		 *  Via de method entrySet() bekom je een set van alle entry-objecten in de map. 
		 *  Via een iterator kan je vervolgens weer itereren over deze set 
		 *  om alle entry-objecten te tonen.
		 */
		while (it2.hasNext()) { 
			System.out.println(it2.next()); 
			} 
	}
	
	private static void linkedHashMap() {
		Map<String,String> landen = new LinkedHashMap<String,String>(); //(1) 
		landen.put("B","Belgie"); //(2) 
		landen.put("NL","Nederland"); 
		landen.put("F","Frankrijk"); 
		landen.put("D","Duitsland"); 
		landen.put("L","Luxemburg"); 
		landen.put(null,null); //(3) 
		
		String eenLand = landen.get("F"); //(4) 
		System.out.println("Land met code F: " + eenLand); 
		
		String vorigLand= landen.put("F", "Finland"); //(5) 
		/* (5)
		 * Er wordt opnieuw een mapping toegevoegd met key “F”, maar nu met value “Finland”. 
		 * Vermits key “F” reeds aanwezig is in de map, 
		 * wordt de vorige value “Frankrijk” overschreven door “Finland”. 
		 * De oude value “Frankrijk” is de terugkeerwaarde van de put(). 
		 * Het is de method put() die er voor zorgt dat de keys uniek blijven in de map!
		 */
		System.out.println("Vorig land met code F: " + vorigLand); 
		
		eenLand = landen.get("F"); 
		System.out.println("Land met code F: " + eenLand); 
		
		System.out.println("*** View van de Keys ***"); 
		Iterator<String> it = landen.keySet().iterator(); //(6) 
					
		/* Een eerste view wordt gemaakt. 
		 * Via de method keySet() bekom je een set van alle keys aanwezig in de map. 
		 * Van deze set kan je een iterator vragen om over de set te itereren. 
		 * Zo wordt per aanwezige key in de set met de method get() de bijbehorende value opgezocht 
		 * zodat je de volledige inhoud van de map kan tonen.
		 * 
		 */
		while (it.hasNext()) { 
			String landcode = it.next(); 
			eenLand = landen.get(landcode); 
			System.out.println(landcode + " heeft als naam: " + eenLand); 
			} 
		
		System.out.println("*** View van de Values ***"); 
		it = landen.values().iterator(); //(7) 
		/* Een tweede view wordt gemaakt. 
		 * Via de method values() bekom je een Collection van alle aanwezige values in de map. 
		 * Van deze Collection kan je een iterator opvragen zodat je 
		 * over alle aanwezige values kan itereren om ze vervolgens te tonen.
		 */
		while (it.hasNext()) { 
			String land = it.next(); 
			System.out.println(land); 
			} 
		
		System.out.println("*** View van de Key-Value-paren ***"); 
		Iterator it2 = landen.entrySet().iterator(); //(8) 
		/* Tot slot wordt ook de derde view gemaakt.
		 *  Via de method entrySet() bekom je een set van alle entry-objecten in de map. 
		 *  Via een iterator kan je vervolgens weer itereren over deze set 
		 *  om alle entry-objecten te tonen.
		 */
		while (it2.hasNext()) { 
			System.out.println(it2.next()); 
			} 
	}
	
	private static void treeMap() {	
		Map<String,String> landen = new TreeMap<String,String>(); //(1) 
		landen.put("B","Belgie"); //(2) 
		landen.put("NL","Nederland"); 
		landen.put("F","Frankrijk"); 
		landen.put("D","Duitsland"); 
		landen.put("L","Luxemburg"); 
		//landen.put(null,null); //(3) 
		
		String eenLand = landen.get("F"); //(4) 
		System.out.println("Land met code F: " + eenLand); 
		
		String vorigLand= landen.put("F", "Finland"); //(5) 
		/* (5)
		 * Er wordt opnieuw een mapping toegevoegd met key “F”, maar nu met value “Finland”. 
		 * Vermits key “F” reeds aanwezig is in de map, 
		 * wordt de vorige value “Frankrijk” overschreven door “Finland”. 
		 * De oude value “Frankrijk” is de terugkeerwaarde van de put(). 
		 * Het is de method put() die er voor zorgt dat de keys uniek blijven in de map!
		 */
		System.out.println("Vorig land met code F: " + vorigLand); 
		
		eenLand = landen.get("F"); 
		System.out.println("Land met code F: " + eenLand); 
		
		System.out.println("*** View van de Keys ***"); 
		Iterator<String> it = landen.keySet().iterator(); //(6) 
					
		/* Een eerste view wordt gemaakt. 
		 * Via de method keySet() bekom je een set van alle keys aanwezig in de map. 
		 * Van deze set kan je een iterator vragen om over de set te itereren. 
		 * Zo wordt per aanwezige key in de set met de method get() de bijbehorende value opgezocht 
		 * zodat je de volledige inhoud van de map kan tonen.
		 * 
		 */
		while (it.hasNext()) { 
			String landcode = it.next(); 
			eenLand = landen.get(landcode); 
			System.out.println(landcode + " heeft als naam: " + eenLand); 
			} 
		
		// testje jt
		System.out.println("*** View2 van de Keys ***"); 
		Collection<String> coll = landen.keySet(); 
		Iterator<String> itjt = coll.iterator();  
		
		while (itjt.hasNext()) { 
			String landcode = itjt.next(); 
			eenLand = landen.get(landcode); 
			System.out.println(landcode + " heeft als naam: " + eenLand); 
			} 
		
		System.out.println("*** View van de Values ***"); 
		it = landen.values().iterator(); //(7) 
		/* Een tweede view wordt gemaakt. 
		 * Via de method values() bekom je een Collection van alle aanwezige values in de map. 
		 * Van deze Collection kan je een iterator opvragen zodat je 
		 * over alle aanwezige values kan itereren om ze vervolgens te tonen.
		 */
		while (it.hasNext()) { 
			String land = it.next(); 
			System.out.println(land); 
			} 
		
		System.out.println("*** View van de Key-Value-paren ***"); 
		Iterator it2 = landen.entrySet().iterator(); //(8) 
		/* Tot slot wordt ook de derde view gemaakt.
		 *  Via de method entrySet() bekom je een set van alle entry-objecten in de map. 
		 *  Via een iterator kan je vervolgens weer itereren over deze set 
		 *  om alle entry-objecten te tonen.
		 */
		while (it2.hasNext()) { 
			System.out.println(it2.next()); 
			} 
	}
	
	private static void treeMapExtra() {	
		TreeMap<String,String> landen = new TreeMap<String,String>(); //(1) 
		landen.put("B","Belgie"); //(2) 
		landen.put("NL","Nederland"); 
		landen.put("F","Frankrijk"); 
		landen.put("D","Duitsland"); 
		landen.put("L","Luxemburg"); 
		// Extra methods 
		System.out.println("*** Extra methods ***");
		System.out.println("Eerste key: " + landen.firstKey()); //(1) 
		System.out.println("Laatste key: " + landen.lastKey()); //(2) 
		SortedMap<String, String> landenSub = landen.subMap("D", "M"); //(3) 
		System.out.println("*** View van de Key-Value-paren van de submap D-M ***"); 
		Iterator itSub = landenSub.entrySet().iterator(); //(4) 
		while (itSub.hasNext()) { 
			System.out.println(itSub.next()); 
			}
		
		
		
	}
}