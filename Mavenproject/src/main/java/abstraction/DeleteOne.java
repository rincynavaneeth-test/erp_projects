package abstraction;

public abstract class DeleteOne {

	/*
	 * public abstract void display(); //abtsract method
	 * 
	 * public void show() {
	 * 
	 * System.out.println("hello world"); //non abstract }
	 */

	public abstract void display(); //abstract method
	
	public void show() {
		System.out.println("non abstract parent");
	}
	
	public abstract void read();// another abstract method
	
}
