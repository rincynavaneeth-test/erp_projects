package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		
	Set s=  new HashSet();  //reference for set created
	
	s.add("One");
	s.add("Two");
	s.add("Three");
	s.add("Four");
	System.out.println(s);  //its unordered
	
	Set p = new HashSet();
	
	p.add("Jan");
	p.add("Feb");
	p.add("March");
	p.add("April");
	
	System.out.println(p);
	
	System.out.println(s.addAll(p));
	System.out.println(s);
	
	//add
	//remove
	//contains
	//size
	//isempty
	//iterator
	//clear
	
	System.out.println(s.contains("One"));  //true

	System.out.println(s.containsAll(p)); //true- specific set
	
	System.out.println(s.size());  //8
	System.out.println(s);
	
	
	System.out.println(s.isEmpty()); //false
	
	s.remove("One"); //
	
	
	System.out.println(s);

	Iterator itr = s.iterator();
	
	while(itr.hasNext()) {
		
		
		System.out.println(itr.next());
	}
	
 itr.remove();
 System.out.println(s);
	
	
	
	
	
		
		
	}

}
