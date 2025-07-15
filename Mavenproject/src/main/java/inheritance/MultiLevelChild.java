//multi level inheritance
package inheritance;

public class MultiLevelChild extends IntermediateChild {

	public void show() {
		
		System.out.println("multi child");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelChild obj = new MultiLevelChild();
		obj.show();
		obj.display();
		obj.print();
	}

}
