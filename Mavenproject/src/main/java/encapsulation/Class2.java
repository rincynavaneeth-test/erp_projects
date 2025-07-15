package encapsulation;

public class Class2 {

	public static void main(String[] args) {

		Class1 obj1 = new Class1();  //parent object created.
		obj1.setUsername("Rincy");
		obj1.setPassword(123);
		System.out.println(obj1.getUsername());
	    System.out.println(obj1.getPassword());
	}

}
