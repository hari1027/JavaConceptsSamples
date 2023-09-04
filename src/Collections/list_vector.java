package Collections;

import java.util.List;
import java.util.*;

public class list_vector {

	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add(30);
		v1.add('c');
		v1.add("capgemini");
		System.out.println(v1);
		
		List v2 = new Vector ();
		v2.add("apple");
		v2.add("banana");
		v2.add(2);
		System.out.println(v2);
		
		List<String> v3 = new Vector<String>(); // we can specify the Datatype .it will not show warning also.More specified like this only.
		v3.add("car");
		v3.add("bike");
		v3.add("lory");
		System.out.println(v3);
		
		Vector<Integer> v4 = new Vector<Integer>();
		v4.add (12);
		v4.add (15);
		v4.add (21);
		System.out.println(v4);
		
		System.out.println(v4.size()); // shows the size of set
		v4.set(1,50); // setting the value or changing the value
		System.out.println(v4);
		
		System.out.println(v3.remove("bike")); // if yes the output should be true .
		System.out.println(v3.remove("bus")); // if no the output should be false.
		System.out.println(v3);
		
		System.out.println(v2.isEmpty()); // if yes true else false .
		System.out.println(v2.contains(2)); // if yes the output should be true.
		System.out.println(v2.contains("grapes")); // if no the output is false
		
		v1.clear(); // clearing all elements in the set .
		System.out.println(v1);
		
		v3.addAll(v2); //joining two sets.
		System.out.println(v3);
		
		
		Vector v5 = new Vector();
		v5.add("day");
		v5.add("night");
		v5.add("sun");
		v5.add("moon");
		v5.add("stars");
		v5.add("rainbow");
		
		List lst = v5.subList(1,4); //subListing certain range of elements
		System.out.println(lst);
		

		
		
		
		 
		
		
		
		
		

	}
}


