package RuntimeIntializationOnCollections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		HashSet set = new HashSet();
		System.out.println("enter your name and id");
		set.add(s.nextLine());
		set.add(s.nextInt());
		System.out.println(set.toString());
	}

}
