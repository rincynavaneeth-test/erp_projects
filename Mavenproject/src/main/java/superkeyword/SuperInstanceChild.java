package superkeyword;

public class SuperInstanceChild extends SuperInstance{
    
	String color= "Red";
	public void display () {
		System.out.println(color);
		System.out.println(super.color);
		
	}
	
	public static void main(String[] args) {
    
		SuperInstanceChild obj = new SuperInstanceChild();
		obj.display();
	
	}

}
