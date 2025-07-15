package abstraction;

public class AbstractTwo extends AbstractOne {

	public static void main(String[] args) {

// we can not create object for the abstract class.(since no constructor invoking)instead we can create reference. 
		
		AbstractOne obj = new AbstractTwo(); //added reference of abstract class
		//abs obj = new child class ( created object for child)
		obj.display();
		obj.find();
		// obj.print(); // we can not access it.we have added reference to the abstract class.	
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}
	
	
	public void print() {
		
		System.out.println("hi world");
	}

}