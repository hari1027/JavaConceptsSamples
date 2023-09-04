package Collections;

import java.util.*;

public class HashSets
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("is my company");
		hs.add("capgemini");
		hs.add(19);
		hs.add('c');
		hs.add(19);
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains("capgemini"));
		System.out.println(hs.remove("capgemini"));
		System.out.println(hs);
		System.out.println(hs.remove(19));
		System.out.println(hs.isEmpty());
		hs.clear();
		System.out.println(hs.isEmpty());
		}

}
