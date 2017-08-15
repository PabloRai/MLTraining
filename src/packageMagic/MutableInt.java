package packageMagic;

public class MutableInt {
	private int value = 1;
	
	public void incrementValue() { 
		++value;
	}
	
	public int getValue() {
		return value;
	}
	
}
