package Oef11;

public class Getal {
	
	public int x;	
	
	public Getal (int a) {
		setX(a);
	}
	
	public void print(int x) {
		System.out.println (x);
	}
	
	public void print(String y,int x) {
		System.out.println (y + x);
	}
	
	public void print(String y,double x) {
		System.out.println (y + x);
	}
	
	public int  absoluut(int x) {
		return Math.abs(x);
	}
	
	public int som(int a) {
		return (a + this.x);
	}
	
	public int add(int a) {
		return (a + this.x);
	}
	
	public double toDouble () {
		return (double) x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int a) {
		this.x = a;
	}

	
}
