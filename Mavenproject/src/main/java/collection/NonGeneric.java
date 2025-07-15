package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class NonGeneric {

	public static void main(String[] args) {

		
		ArrayList obj = new ArrayList(); //a is a variable
		
		obj.add("one");
		obj.add("two");
		obj.add("three");
		obj.add("four");
		System.out.println(obj);
		
		ArrayList obj1 = new ArrayList(); //a is a variable

		obj1.add("jan");
		obj1.add("feb");
		obj1.add("mar");
		obj1.add("apr");
		
		//addall - to add one list to another list
		
		System.out.println(obj1);
		System.out.println(obj.addAll(obj1));
		System.out.println(obj);
		
		//iterator
		
		Iterator itr = obj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//removes last elemnt of list
		itr.remove();
		System.out.println(obj);
		
	}

}
