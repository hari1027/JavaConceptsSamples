package RuntimeIntializationOnCollections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		Set<String>set = new HashSet<>();
		Scanner s =new Scanner(System.in);
		System.out.println("enter your name");
		for(int i=0;i<5;i++)
		{
			set.add(s.nextLine());
		}
		System.out.println(set.toString());

	}

}
