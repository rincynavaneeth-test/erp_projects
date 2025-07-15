package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {

int age = 10;
if(age>= 18) {
	System.out.println("elgible for voting");
	}
else {
	throw new ArithmeticException("not eligible");
}
}
}