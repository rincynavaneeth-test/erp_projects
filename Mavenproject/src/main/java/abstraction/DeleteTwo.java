package abstraction;

public class DeleteTwo extends DeleteOne{


	/*
	 * public static void main(String[] args) {
	 * 
	 * DeleteOne object = new DeleteTwo(); object.display(); object.show();
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 * @Override public void display() {
	 * 
	 * System.out.println("hello"); }
	 * 
	 * public void print() { System.out.println("hellodddd"); }
	 */

	@Override
	public void display() {
        System.out.println("abstract display method");		
	}

	@Override
	public void read() {
		System.out.println("abstract read");		
		
	}
	
	public void list() {
		
		System.out.println("child non abstract method");
	}
	
	
	public static void main(String args[]) {
		
		DeleteTwo object1= new DeleteTwo();
		object1.display();
		object1.show();
		object1.read();
		object1.list();
		
		
	}
	
	
l
	
	
	
	
	
	
}
