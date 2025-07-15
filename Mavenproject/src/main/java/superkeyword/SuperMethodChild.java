package superkeyword;

public class SuperMethodChild extends SuperMethodParent {


	public void show() {
		
		System.out.println("child method");
		super.display();
		super.print();
		this.find();
	}
	
	public void find() {
		
		System.out.println("another child method");
	}
	
	public static void main(String[] args) {
		
		SuperMethodChild obj = new SuperMethodChild();
		obj.show();
		
		
	}

}
