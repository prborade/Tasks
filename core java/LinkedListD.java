package CollectionD;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();  
		          ll.add("Ravi");  
    	           ll.add("Vijay");  	           
    	           ll.add("Ajay");  
			           //Traversing the list of elements in reverse order  
			           Iterator i=ll.descendingIterator();  	        
			           while(i.hasNext())  
			           {  
			               System.out.println(i.next());  
		           }

	}

}
