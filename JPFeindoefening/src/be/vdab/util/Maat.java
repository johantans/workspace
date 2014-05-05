package be.vdab.util;

public enum Maat {CENTIMETER(1),DECIMETER(1000),METER(1000000);

	private final int factor; // 
	
	private Maat (int factor) {
		this.factor = factor;
	}	

	public long getFactor() {
		return factor;
	}
}
