package interfacepack;

public class InterfaceClass implements InterfaceExample{
	
	
	public void show() {      //instance method
		
	System.out.println("hello world");	
	
	}

	public static void main(String[] args) {

		
		InterfaceClass obj=  new InterfaceClass(); //object creation
		
		               obj.display();//abstract method invoked
		               
		               System.out.println(obj.a); //static variable printed
		               obj.show();
		

	}

	@Override
	public void display() {

		System.out.println("hello");
	}

}
