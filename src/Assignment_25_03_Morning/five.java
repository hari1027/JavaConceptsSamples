package Assignment_25_03_Morning;

import java.util.HashSet;
import java.util.Scanner;

public class five {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of the set");
		int m = sc.nextInt();
		
		System.out.println("enter the set elements");
		for(int i=0;i<m;i++)
		{
			hs.add(sc.nextInt());
		}
		
		hs.clear();
		System.out.println(hs);
		
		System.out.println(hs.isEmpty());

	}

}
