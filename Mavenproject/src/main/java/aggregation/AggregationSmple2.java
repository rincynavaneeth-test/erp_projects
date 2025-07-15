package aggregation;

public class AggregationSmple2 {

	
	String subject;
	int mark;
	AggregationSample1 ref; //referring the parent class
	
	public AggregationSmple2(String subject, int mark, AggregationSample1 ref) {
		
	this.subject= subject;
	this.mark = mark;
	this.ref = ref;
		
	}
	
	public void display() {
		
	System.out.println(subject);
	System.out.println(mark);
	System.out.println(ref.age + " " + ref.name);
	}
	
	public static void main(String[] args) {

		AggregationSample1 obj2 = new AggregationSample1("Rincy", 31);  // created an object of the parent class
		
		
		AggregationSmple2 obj = new AggregationSmple2("English", 90, obj2); // added parent class object as last parameter
		obj.display();
		
		
		
	}

}
