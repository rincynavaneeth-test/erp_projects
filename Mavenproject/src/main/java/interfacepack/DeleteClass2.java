package interfacepack;

public class DeleteClass2 implements DeleteInterface2{

	
    public void print() {
    	
    	System.out.println("hellow");
    }
	
	public void show() {
           System.out.println("abstract method");		
	}

	
	
public static void main(String[] args) {
   
	/*
	 * DeleteClass2 object1= new DeleteClass2(); object1.show(); object1.print();
	 */
	DeleteInterface2 object1 = new DeleteClass2();
	object1.show();
	
	
	DeleteClass2 object2 = new DeleteClass2();
	object2.print();
		
	}



}
