package CollectionD;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		LinkedHashMap lhm= new LinkedHashMap();
        TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
        
		hm.put(1, "A");
		hm.put(2, "B");
		hm.put(2, "A");
		hm.put(null, null);
		System.out.println(hm);

		lhm.put(4, "c");
		lhm.put(5, "d");
		lhm.put(6, null);
		lhm.put(null, "f");
		System.out.println(lhm);
		
		tm.put(8, "g");
		tm.put(9, "h");
		tm.put(10, "i");
		tm.put(11, null);
		System.out.println(tm);

		
	}

}
