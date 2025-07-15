//generic collection sample: to work on


package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sample {

	public static void main(String[] args) {

		
		List <String> li = new ArrayList(); //reference creation of list
		
		li.add("one");
		li.add("two");
		li.add("three");
		li.add("four");
		li.add("1");
		System.out.println(li);
	
		
		li.set(0, "orange");
		System.out.println(li);
		
		System.out.println(li.indexOf("two"));
		
		System.out.println(li.add("1"));
		
		System.out.println(li);
		
		System.out.println(li.lastIndexOf("1"));
		
		li.remove(0);
		System.out.println(li);
		
		li.get(0);
		System.out.println(li.get(0));
		
		System.out.println(li.contains("three"));
		
		
		if(li.isEmpty()) {
			
			System.out.println("true");
		}
		
		else {
			System.out.println("false");
		}
		
		System.out.println(li.size());
		
        for(String color:li){
			
			System.out.println(color);
		}
        
        
 //non generic collection
        
        ArrayList b = new ArrayList();
        
        b.add("one");
        b.add("one");
        b.add("one");
        b.add("one");
        b.add("one");
        System.out.println(b);
		
		ArrayList c = new ArrayList();
		
		c.add("two");
		c.add("two");
		c.add("two");
		c.add("two");
		c.add("two");
		System.out.println(c);
	        
		
		System.out.println(b.addAll(c));
		System.out.println(b);
		
		Iterator itr = b.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	        
	}
	
	

}
