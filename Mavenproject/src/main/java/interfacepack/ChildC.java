//we can do it using interface

package interfacepack;

public class ChildC implements ParentA , ParentB , ParentD{

	public static void main(String[] args) {
	
		
		ChildC object = new ChildC();
		
		       object.print();
		       object.display();
		       object.find();
		
	}

	@Override
	public void print() {

       System.out.println("print method");		
	}

	@Override
	public void display() {
       System.out.println("display method");		
	}

	@Override
	public void find() {
	       System.out.println("find method");		
		
	}

}
