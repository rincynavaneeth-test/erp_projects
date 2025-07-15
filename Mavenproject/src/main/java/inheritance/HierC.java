//hierarchial
package inheritance;

public class HierC extends HierA { //child 2
	
	public void print() {
		
		System.out.println("child 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HierC obj = new HierC();
		obj.display();
		obj.print();
		
		
		
	}

}
