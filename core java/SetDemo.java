package CollectionD;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashSet h = new   HashSet();
    LinkedHashSet lh = new  LinkedHashSet();
    TreeSet<String> t = new  TreeSet<String>();
    h.add("komal");
    h.add("kirti");
    h.add(4);
    h.add(null);
    h.add(null);
    
    lh.add("anu");
    lh.add(6);
    lh.add(null);
    
    t.add("u");
    t.add("ravi");
    
    System.out.println(h);
    System.out.println(lh);
    System.out.println(t);
    h.retainAll(lh);
    System.out.println(h);
    System.out.println(h.contains("kirti"));
    System.out.println(h.containsAll(lh));
    
    
    
    
    
	}

}
