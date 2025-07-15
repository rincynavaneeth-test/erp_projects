package encapsulation;

public class User {

	public static void main(String[] args) {

	Bank obj1 = new Bank();
	obj1.setPinNumber(123);
	obj1.setPinNumber(0);
	
	System.out.println(obj1.getPinNumber());
		
	}

}
