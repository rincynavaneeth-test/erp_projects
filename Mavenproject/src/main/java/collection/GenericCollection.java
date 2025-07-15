package collection;

import java.util.ArrayList; //imported arraylist
import java.util.List;       //imported list

public class GenericCollection {

	public static void main(String[] args) {
		
		
	List <String> li = new ArrayList<String>(); //reference creation of list
		
	//add is a method - to add elements to the list
   li.add("red");
   li.add("green");
   li.add("black");
   li.add("white");
   System.out.println(li);
   
   //set method: to set element based on index values
   
   li.set(0, "orange");
   System.out.println(li);
   
  // li.set(6, "orange");
   //System.out.println(li);  //error index bound
		
   
   li.set(3, "orange");
   System.out.println(li);
   
	//indexof - find out the index value of an element in list
	
	System.out.println(li.indexOf("orange"));
	
	//lastIndexOf
	System.out.println(li.lastIndexOf("orange"));
	
	
   //remove
	
	li.remove(0);
	System.out.println(li);
	//System.out.println(li.remove(0));
   
   //get - to get element
	li.get(1);
   System.out.println(li.get(1));
   
   //contains to check whether element is present
   
   System.out.println(li.contains("white"));
   
   System.out.println(li.contains("orange"));
   
   //IsEmpty : checking whether list is empty or not.
   
   if(li.isEmpty()) {
   
	   System.out.println("list is empty");
	}
   
   else {
	   System.out.println("not empty");

	   
   }
   
   
	//size - size of the list
   
   System.out.println(li.size());
   
   for(int i=0;i<li.size();i++) {
	   
	   System.out.println(li.get(i));
   }
   
   
   //foreach
   
   for(String color:li) {
	   
	   System.out.println(color);
   }
   
   
	}

	
	
	
	
 	
	

	
}
