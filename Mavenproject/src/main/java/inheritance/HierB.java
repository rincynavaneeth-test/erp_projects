//hierarchial

package inheritance;

public class HierB  extends HierA { //child one

	public void show () {
		
	System.out.println("child 1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierB obj = new HierB();
		obj.show();
		obj.display();

	}

}
