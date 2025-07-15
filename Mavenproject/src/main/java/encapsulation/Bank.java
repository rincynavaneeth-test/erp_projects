package encapsulation;

public class Bank {
	
	private int pinNumber;

	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	
	public int validate(int pinNumber) {
		return pinNumber;
		
	}
	

}
