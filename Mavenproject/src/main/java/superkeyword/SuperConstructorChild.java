package superkeyword;

public class SuperConstructorChild extends SuperConstructor {

	
public SuperConstructorChild(int a, int b) {
	
	
	super(12,13);
	int division = a/b;
	System.out.println(division);
	
}

public SuperConstructorChild(int a, int b,int c) {
	
	super(1,2,3.5f);
	int sub = a-b-c;
	System.out.println(sub);
	
}
	public static void main(String[] args) {
		
		SuperConstructorChild obj= new SuperConstructorChild(10,5);
		SuperConstructorChild obj1= new SuperConstructorChild(5,2,3);

		
		
	}

}
