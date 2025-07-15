//outside the access we can access public, protected, default

package accessmodifier;

public class AccessTwo extends AccessParent {

	public static void main(String[] args) {

		
		AccessTwo obj = new AccessTwo();
		obj.publicMethod();
		obj.protectedMethod();
		obj.defaultMethod();
		// obj.privateMethod();  private method is not visible outside the class. hence we can not override the private method
		
	}

}

//