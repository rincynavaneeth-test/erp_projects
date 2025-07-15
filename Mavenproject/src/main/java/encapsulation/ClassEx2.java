package encapsulation;

public class ClassEx2 {

	public static void main(String[] args) {

		
		ClassEx1 obj1 = new ClassEx1();
		obj1.setName("Rincy");
		obj1.setPin(12345);
		
		System.out.println(obj1.getName());
		System.out.println(obj1.getPin());
		
	}

}
