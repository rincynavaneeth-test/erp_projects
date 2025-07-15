package exceptionhandling;

public class ExceptionHandling {

	public static void main(String[] args) {

		int a=8;
		int b=0 ;
		
		try {
			int c= a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e){  //className
			b=2;
			int d=a/b;
			System.out.println(d);
		}
		finally {
			
			System.out.println("end of the program");
		}
		
		
		
		try {
			
			int arr[] = {1,2,3};
			for(int i =0;i<10;i++) {
				System.out.println(arr[i]);
			}
		}
        catch(Exception w) {
        	
        	System.out.println("exeception handled easily");
        }
		
		try {
			String name =null;
			System.out.println(name.length);
		}
		catch(NullPointerException n) {
			String name="rincy";
			System.out.println(name.length);
		}
		finally {
		System.out.println("end of the program");
		}
	}
}
