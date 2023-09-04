package Collections;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
			HashMap m = new HashMap();
			m.put(1,5); // (1 is key 5 is value .)
			m.put(5,10);
			m.put(10, 2);
			System.out.println(m);
			
			HashMap n = new HashMap();
			n.put("fruit", "banana");
			n.put("rate", 5);
			n.put("rating","9.6");
			System.out.println(n);
			
			HashMap o = new HashMap();
			o.put(3,"1st palce");
			
			// (we can use can data type at key and value)
			//(cannot use used keys in a set)
			
			System.out.println(m.size());
			System.out.println(m.isEmpty());
			System.out.println(m.remove(5));
			System.out.println(m);
			System.out.println(m.get(1));
			System.out.println(n.containsKey("rate"));
			System.out.println(n.containsValue(5));
			n.clear();
			System.out.println(n);
			
			m.putAll(o);
		    System.out.println(m);// note keys should not be same in both sets
			m.put(20, 100);
			System.out.println(m);
			 

	}

}
