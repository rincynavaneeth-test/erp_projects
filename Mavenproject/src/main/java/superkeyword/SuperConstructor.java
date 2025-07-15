package superkeyword;

public class SuperConstructor { //parent

	
public SuperConstructor(int a, int b) {

	this(1,2,3.5f);
	int sum=  a+b;
	System.out.println(sum);
}
	
public SuperConstructor(int a, int b, float c) {
	
	float muliplication = a*b*c;
	System.out.println(muliplication);
}
	
	
	
}
