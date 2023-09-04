package Assignment_25_03_Morning;
import java.util.*;

public class nine {

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
		hs1.add(1);
		
		HashSet <Integer> hs2 = new HashSet<>();
		hs2.add(3);
		hs2.add(4);
		
		System.out.println(hs.equals(hs1));
		System.out.println(hs.equals(hs2));
		

	}

}
