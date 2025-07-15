package abstraction;

public class Child extends Parent {
    public void print() {
    	
    	System.out.println("non-abstract child");
    	
    }
	public static void main(String[] args) {

		Child obj = new Child();
		obj.display();
		obj.show();
		obj.print();
		obj.sum();//
	}

	@Override
	public void display() {

		
		System.out.println("parent's abstract method");
	}
	@Override
	public void sum() {

		int a= 10;
		int b=10;
		int c= a+b;
		System.out.println(c);
	}

}
