//we can access all the access specifiers here

package accessmodifier;

public class AccessParent {
	
	public void publicMethod() { 
		
	System.out.println("this is a public method");	
	}
	
	private void privateMethod() {
		
		System.out.println("this is s private method");
	}
	
	protected void protectedMethod() {
		
		
		System.out.println("this is a protected method");
	}
	
	void defaultMethod () {
		System.out.println("this is default method");
	}

	public static void main(String[] args) {

		
		AccessParent obj = new AccessParent();
		
		obj.publicMethod();
		obj.privateMethod();
		obj.protectedMethod();
		obj.defaultMethod();
		
	}

}
