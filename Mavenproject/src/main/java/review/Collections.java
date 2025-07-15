package review;

import java.util.HashSet;
import java.util.Iterator;

public class Collections {

	public static void main(String[] args) {

		
	HashSet s= new HashSet();
	
	s.add("one");
	s.add("two");
	s.add("three");
	s.add("four");
	System.out.println(s);
	
	HashSet p= new HashSet();
	
	p.add("jan");
	p.add("feb");
	p.add("mar");
	p.add("apr");
	System.out.println(p);
	
    s.addAll(p);
    System.out.println(s);
    
    s.remove(0);
    System.out.println(s);
    
    Iterator<String> itr = s.iterator();
    
    while(itr.hasNext()) {
    
    System.out.println(itr.next());
    
    }
    
    
	
	
	
	
	
	
	

	
	
	
	
	}

}
