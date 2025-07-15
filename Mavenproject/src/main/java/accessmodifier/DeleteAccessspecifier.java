package accessmodifier;

public class DeleteAccessspecifier {

	
	public void publicMethod() {
	
	 System.out.println("public method");
	}
	
	public void privateMethod() {
		
		 System.out.println("private");
	}
	
	public void protectedMethod() {
		
		 System.out.println("protected");
	}
	
	void defaultMethod() {
		
		 System.out.println("defualt");
	}
	

	
	public static void main(String[] args) {
		DeleteAccessspecifier object = new DeleteAccessspecifier();
		object.publicMethod();
		object.privateMethod();
		object.defaultMethod();
		object.protectedMethod();
	}

}
