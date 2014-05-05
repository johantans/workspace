package Oef11;

public class bewerkGetal {
	
	 public static void main(String[] args) { 
	
		Getal cijfer = new Getal(408);
		cijfer.print(cijfer.getX()); 
		int y = cijfer.absoluut(cijfer.getX());
		cijfer.print(y); 
		y = cijfer.som(15);
		cijfer.print(y); 
		
		oef11g();
		oef11h();
		
	}
	
	private static void oef11g() {
	Getal cijfer2 = new Getal(151);
	cijfer2.print("Voor: " , cijfer2.getX());
	cijfer2.x = cijfer2.add(48);
	cijfer2.print("Na: " , cijfer2.getX());
	}

	private static void oef11h() {
		Getal cijfer = new Getal(150);
		cijfer.print("Voor: " , cijfer.getX());
		double y = cijfer.toDouble();
		cijfer.print("Na: " , y);
		}

}

