package superkeyword;

public class DivisionResult extends AdditionResult {
	
    public void DisplaySum(int a , int b) {
    	
    	int c = super.sum(a, b);
    	
    	if (c % 10 == 0) {
    		System.out.println(c + " " + "is divisible by 10");
        } else {
    		System.out.println(c + " " + "is not divisible by 10");
        }
    	
    }
	public static void main(String[] args) {

		DivisionResult obj = new DivisionResult();
		obj.DisplaySum(10, 10);
		obj.DisplaySum(5, 0);
	}

}
