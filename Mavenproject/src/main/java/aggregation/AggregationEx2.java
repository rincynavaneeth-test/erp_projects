package aggregation;

public class AggregationEx2 {
     String town;
     int pin;
     AggregationEx1 ref;  //parent class reference
     
	public AggregationEx2(String town, int pin, AggregationEx1 ref) {
	this.town = town;
	this.pin =pin;
	this.ref= ref;
		
	}
	
	public void show() {
		
	System.out.println(town);
	System.out.println(pin);
	System.out.println(ref.city + " "+ " " + ref.temp);
	}
	public static void main(String[] args) {

		AggregationEx1 obj2 = new AggregationEx1("vatakara", 32); //parent object created 
		AggregationEx2 obj1 = new AggregationEx2("Calicut", 673101, obj2);	//child object created,passed parent object as reference
		obj1.show();
		
		
	}

}
