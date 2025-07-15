package aggregation;

public class Address {

	String address;
	Student reference;
	
	public Address(String address, Student reference) {
	
		this.address = address;
		this.reference = reference;
		
	}
	
	public void details () {
		

		System.out.println("Name of the student is" + " " + reference.studentName);
		System.out.println("Roll number of the student is " + " " + reference.rollNumber);
		System.out.println("Address of the student is" + " " +address);
	}
	public static void main(String[] args) {
		
		
		Student obj1 = new Student("Rincy K", 22);
		Address obj2 = new Address("Anand(Ho), Kodiyeri,Thalaserry", obj1);
		obj2.details();
		

		
	}

}
