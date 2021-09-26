package CollectionD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
public class ArrayL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList al = new  ArrayList();
     ArrayList a=new ArrayList();
     al.add(2);
     al.add("pooja");
     al.add(null);
     al.add(3.14f);
     System.out.println(al);
     System.out.println(al.get(1));
     al.set(0, 'b');
     System.out.println(al);
     Collections.reverse(al);
     System.out.println(al);
     a.add(5);
     a.add("shobha");
     a.add(5.5f);
     System.out.println(a);
     al.addAll(a);
     System.out.println(al);
     a.add(0,"r");
     System.out.println(a);
     a.add("shobha");
     System.out.println(a);
     a.remove("shobha");
     System.out.println(a);
     System.out.println("***************************");
      Iterator itr = al.iterator();
      while(itr.hasNext()){
    	  System.out.println(itr.next());
      }

      
      System.out.println("***************************");
     
     for(Object obj:a){
    	 System.out.println(obj);
     }
     
     System.out.println("***************************");
     
     
     LinkedList l = new LinkedList();
     l.add("sam");
     l.add(4);
     l.add(7.7f);
     l.add("sam");
     l.removeLast();
     System.out.println(l);
     
     
     l.forEach(z ->{System.out.println(z);});
     
 
	    }
     
     
	}


