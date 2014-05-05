package be.vdab;

import be.vdab.util.Datum;
import be.vdab.util.DatumException;

public class DatumTest {

	public static void main(String[] args) throws DatumException {
		
		System.out.println();
		System.out.println("Eigen kontrole");
		System.out.println();
		
		kontroleDt (1,1,1584);
		kontroleDt (1,1,2000);
		kontroleDt (1,2,2000);
		kontroleDt (29,2,2000);
		kontroleDt (29,2,1900);
		kontroleDt (31,2,1900);
		kontroleDt (31,1,1900);
		kontroleDt (31,1,1900);
		kontroleDt (31,2,1900);
		kontroleDt (31,2,1600);
		
		System.out.println();
		System.out.println("Kontrole toets");
		System.out.println();
		
		try {
		Datum d1 = new Datum(32,13,5100);
		System.out.println(d1);
		}
		catch (DatumException de) {
			System.out.println(de.getMessage() + de.getDatumVerkeerd()); 
		}	
		
		Datum d2 = new Datum();
		d2.setJaar(2000);
		System.out.println("1/1/2000 = " + d2);
		d2.setMaand(2);
		System.out.println("1/2/2000 = " + d2); 
		d2.setDag(29);
		System.out.println("29/2/2000 = " + d2); 
		d2.setJaar(1900);
		System.out.println("29/2/2000 = " + d2); 
		d2.setDag(31);
		System.out.println("29/2/2000 = " + d2); 
		d2.setMaand(1);
		System.out.println("29/1/2000 = " + d2); 
		d2.setDag(31);
		System.out.println("31/1/2000 = " + d2); 
		d2.setMaand(2);
		System.out.println("31/1/2000 = " + d2); 
		d2.setJaar(1600);
		System.out.println("31/1/1600 = " + d2);
		
		System.out.println();
		System.out.println("Datums vergelijken:");
		System.out.println();
		
		Datum d3 = new Datum(1,1,2014);
		Datum d4 = new Datum(1,1,2014);
		kontrole2Dt (d3,d4);
		
		d3 = new Datum(1,1,2014);
		d4 = new Datum(1,10,2014);
		kontrole2Dt (d3,d4);
		
		d3 = new Datum(1,1,2015);
		d4 = new Datum(1,11,2015);
		kontrole2Dt (d3,d4);
	}
	
	private static void kontroleDt(int d,int m,int j) {
		try {
			String dtString = Integer.toString(d) + "/" + Integer.toString(m) + "/" +Integer.toString(j);
			Datum dt = new Datum(d,m,j);
			System.out.println(dtString + " = " + dt);
		}
		catch (DatumException de) {
			System.out.println(de.getMessage() + de.getDatumVerkeerd()); 
		}	
	}
	
	private static void kontrole2Dt(Datum d1,Datum d2) {
		int result = d1.compareTo(d2);
		if (result == 0) {
			System.out.println(d1 + " is gelijk aan " + d2);
		}
		if (result > 0) {
			System.out.println(d1 + " is groter dan " + d2);
		}
		if (result < 0) {
			System.out.println(d2 + " is groter dan " + d1);
		}
	}
}
