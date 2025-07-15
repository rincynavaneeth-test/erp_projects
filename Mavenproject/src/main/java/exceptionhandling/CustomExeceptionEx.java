package exceptionhandling;

public class CustomExeceptionEx {

	public static void main(String[] args) throws MyException {

		
	int age= 10;
	
	if(age>=18) {
		System.out.println("eligible");
	}
	
	else {
		
		throw new MyException("not eligible"); //throwing exception
		//System.out.println("not eligible");
	}

	}

}
