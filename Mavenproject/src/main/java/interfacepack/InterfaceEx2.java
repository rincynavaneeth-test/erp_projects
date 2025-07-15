package interfacepack;

public class InterfaceEx2 implements InterfaceEx1 {

	public void print() {
		
		
		System.out.println("hello rincy");
	}
	
	
	public static void main(String[] args) {

		InterfaceEx1 object = new InterfaceEx2();  //interfacename object name = new clasname;	
		
		             object.display();
	                 //object.print();
		             
		             InterfaceEx2 object2 = new InterfaceEx2();
		             object2.print();
	}

	@Override
	public void display() {
       System.out.println("hi rincy");		
	}

}
