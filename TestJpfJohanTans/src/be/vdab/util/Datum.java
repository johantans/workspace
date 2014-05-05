package be.vdab.util;

import java.io.Serializable;

public class Datum implements IDatum,Comparable<Datum>,Serializable {
	private static final long serialVersionUID = 1L;
	
	private int dag = 1;
	private int maand = 1;
	private int jaar = 1584;
	
	public Datum() {
	}

	public Datum(int dag, int maand, int jaar) throws DatumException {
		if (!datumOk(dag,maand,jaar)) {
			String dtString = Integer.toString(dag) + "/" + Integer.toString(maand) + "/" +Integer.toString(jaar);
			throw new DatumException("Foutieve datum: ", dtString);
		}
		this.dag = dag;
		this.maand = maand;
		this.jaar = jaar;
	}
	
	public void setDatum(int dag,int maand,int jaar) {
		this.dag = dag;
		this.maand = maand;		
		this.jaar  = jaar;
	}
	
	@Override
	public int compareTo(Datum dt) {
	//Dt1	
		int dtInt = jaar * 10000;
		dtInt = dtInt + (maand * 100);
		dtInt = dtInt + dag; 
		String dt1 = Integer.toString(dtInt);
	//Dt2	
		dtInt = dt.getJaar() * 10000;
		dtInt = dtInt + (dt.getMaand() * 100);
		dtInt = dtInt + (dt.getDag());
		String dt2 = Integer.toString(dtInt);
		
		return dt1.equals(dt2) ? 0 : dt1.compareTo(dt2);
	/*
		String strMaand = Integer.toString(maand);
		if (maand < 10) {
			strMaand = ("0" + Integer.toString(maand));
		} 
		String strDag = Integer.toString(dag);
		if (dag < 10) {
			strDag = ("0" + Integer.toString(dag));
		} 
		String dt1 = Integer.toString(jaar) + strMaand + strDag;
	//Dt2
		strMaand = Integer.toString(dt.getMaand());
		if (dt.getMaand() < 10) {
			strMaand = ("0" + Integer.toString(dt.getMaand()));
		} 
		
		if (dt.getDag() < 10) {
			strDag = ("0" + Integer.toString(dt.getDag()));
		} 
		String dt2 = Integer.toString(dt.getJaar()) + strMaand + strDag;
		
		
		// Die 0 geeft wel probleem als 2 werknemers met zelfde datum => moet dan <> 0 zijn.
		return dt1.equals(dt2) ? -1 : dt1.compareTo(dt2);
		*/
	}
	
	@Override
	public String toString() {
		return Integer.toString(this.dag) + "/" + Integer.toString(this.maand) + "/" +Integer.toString(this.jaar);
	}

	private boolean datumOk(int dd,int mm,int eejj) {
		// Jaar < 1584 of groter dan 4099 beschouwen we als fout. 
				if (eejj < 1584 || eejj > 4099) {
					return false; 
				}
		// maand < 1 of > 12 = fout 		
				if (mm < 1 || mm > 12) {
					return false; 
				}
		// dag afh van maand 	
				int maxDagen = 0;
				switch (mm) { 
					case 1: case 3: case 5:
					case 7: case 8: case 10:
					case 12: 
						maxDagen = 31; break;
					case 4: case 6:
				    case 9: case 11:
				    	maxDagen = 30; break;
				    case 2:  	
						maxDagen = isSchrikkel(eejj) ? 29 : 28;
					default:  
					break;
				}
				if (dd < 1 || dd > maxDagen)  {
					return false;
				}
		// Datum is o.k. 		
				return true; 
			}

	static boolean isSchrikkel(int jaar){
		boolean result = false;
		if (jaar%4 == 0) {
			//System.out.println("deelbaar door 4");
	        if(jaar%100 == 0) {
				if(jaar%400 == 0) {
					result = true;
					}                                  
			}else{
					result = true;
	        }
		}                       
	   	return result;
	}
	
	public int getDag() {
		return dag;
	}
	
	public void setDag(int dag){
		if (datumOk(dag,maand,jaar)) {
			this.dag = dag;
		}
	}
	
	public int getMaand() {
		return maand;
	}
	
	public void setMaand(int maand) {
		if (datumOk(dag,maand,jaar)) {
			this.maand = maand;
		}
	}
	
	public int getJaar() {
		return jaar;
	}
	
	public void setJaar(int jaar) {
		if (datumOk(dag,maand,jaar)) {
			this.jaar = jaar;
		}
	}
	
}
