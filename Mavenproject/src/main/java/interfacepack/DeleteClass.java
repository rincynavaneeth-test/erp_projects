package interfacepack;

public class DeleteClass implements DeleteInterface{

	
	
	public void show() {
		
		
		System.out.println("show");
	}
	public static void main(String[] args) {

		DeleteClass obj= new DeleteClass();
		obj.display();
		System.out.println(obj.a);
		obj.show();
		
		
	}

	public void display() {

		System.out.println("hello");

	}

	
	
}
