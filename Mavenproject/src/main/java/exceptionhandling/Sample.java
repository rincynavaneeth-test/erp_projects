package exceptionhandling;

public class Sample {

	public static void main(String[] args) {

		
	int age = 22;
	if(age>=18) {
		throw new ArithmeticException("not eligible");

	}

	else 
	{
		System.out.println("eligible for voting");

	}
	}

}
