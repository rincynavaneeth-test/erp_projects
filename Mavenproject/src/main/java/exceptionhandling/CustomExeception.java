package exceptionhandling;

public class CustomExeception {         
	
	public static void main(String args[]) throws VotingExeception {
		
	int age= 12;
	if(age>=18) {
	System.out.println("elgible for voting");	
	}
	
	else {
		throw new VotingExeception("not elgible");
	}
	}

}
