package Assignment_25_03_Morning;

import java.util.HashSet;

public class ten {

	public static void main(String[] args) {
		HashSet <Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		
		HashSet <Integer> hs1 = new HashSet<>();
		hs1.add(3);
		hs1.add(4);
		hs1.add(2);
		hs1.add(0);
		
	    hs.retainAll(hs1);
	    System.out.println("the common elements on both the sets are : " +hs );

	}

}
