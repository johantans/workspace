package be.vdab.util;

public class VolumeException extends Exception {
	private static final long serialVersionUID = 1L;

	public VolumeException() {
	}
	
	public VolumeException(String oms) {
		super(oms);
	}
}
