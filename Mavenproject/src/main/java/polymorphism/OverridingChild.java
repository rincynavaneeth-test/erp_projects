package polymorphism;

public class OverridingChild extends OverridingParent {

	public void display(int a, int b) {
		//super.display(5, 5);
		int c= a -b;
		System.out.println(c);
	}
	public void print(String name) {
		
      //super.print("name");
      System.out.println(name);
      }
	
	public static void main(String[] args) {

		OverridingChild obj = new OverridingChild();
		obj.display(5, 5);
		obj.print("Rincy");
		
	}

}


