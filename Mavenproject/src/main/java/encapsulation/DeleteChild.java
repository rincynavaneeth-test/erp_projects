package encapsulation;

public class DeleteChild {

	public static void main(String[] args) {

		DeleteParent object2 = new DeleteParent();
		object2.setUserName("Rincy");
		object2.setPinNumber(12345);
		
		System.out.println(object2.getPinNumber());
		System.out.println(object2.getUserName());
		
	}

}
