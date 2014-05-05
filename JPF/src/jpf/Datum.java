package jpf;


public class Datum {
	
	private int dag;
	private int maand;
	private int jaar;
	
	public Datum(int dag, int maand, int jaar)  throws DatumException{
		if (!datumOk(dag,maand,jaar)) {
			String dtString = Integer.toString(dag) + "/" + Integer.toString(maand) + "/" +Integer.toString(jaar);
			throw new DatumException("Foutieve datum: ", dtString);
		}
		this.dag = dag;
		this.maand = maand;
		this.jaar = jaar;
	}
	
	private boolean datumOk(int dd,int mm,int eejj) {
// Jaar < 1000 of groter dan 3000 beschouwen we als fout. 
		if (eejj < 1000 || eejj > 3000) {
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
		} else {
			result = true;
       	}
	}                       
   	return result;
}
		
	public int getDag() {
		return dag;
	}

	public void setDag(int dag) throws DatumException {
		if (!datumOk(dag,maand,jaar)) {
			String dtString = Integer.toString(dag) + "/" + Integer.toString(maand) + "/" +Integer.toString(jaar);
			throw new DatumException("Foutieve datum: ", dtString);
		}
		this.dag = dag;
	}

	public int getMaand() {
		return maand;
	}

	public void setMaand(int maand) throws DatumException {
		if (!datumOk(dag,maand,jaar)) {
			String dtString = Integer.toString(dag) + "/" + Integer.toString(maand) + "/" +Integer.toString(jaar);
			throw new DatumException("Foutieve datum: ", dtString);
		}
		this.maand = maand;
	}

	public int getJaar() {
		return jaar;
	}

	public void setJaar(int jaar) throws DatumException {
		if (!datumOk(dag,maand,jaar)) {
			String dtString = Integer.toString(dag) + "/" + Integer.toString(maand) + "/" +Integer.toString(jaar);
			throw new DatumException("Foutieve datum: ", dtString);
		}
		this.jaar = jaar;
	}
	
}
