package accessmodifiertwo;

import accessmodifier.AccessParent;

public class AccessFour extends AccessParent {

	public static void main(String[] args) {

		AccessFour obj = new AccessFour();
		obj.publicMethod();
		obj.protectedMethod();
		// obj.defaultMethod();  not visible
		// obj.privateMethod();  not visible
	}

}
