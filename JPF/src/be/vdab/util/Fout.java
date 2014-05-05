package be.vdab.util;

public class Fout extends Exception {
	private static final long serialVersionUID = 1L;

	public Fout() {
	}
	
	public Fout(String oms) {
		super(oms);
	}
}
