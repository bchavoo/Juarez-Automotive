package entities;

public class PhoneNumber {
	/**
	 * Encapsulation is shown here, the strings are all private which
	 * can't be accessed by the user
	 */
	private int areaCode;
	private int base;
	private int ending;
	
	public PhoneNumber(int areaCode, int base, int ending) {
		super();
		this.areaCode = areaCode;
		this.base = base;
		this.ending = ending;
	}

	public int getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getEnding() {
		return ending;
	}

	public void setEnding(int ending) {
		this.ending = ending;
	}
	

	
}
