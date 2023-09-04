package Assignment_25_03_Morning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class eight {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter the number of elements to be in the set");
		int n = sc.nextInt();
		
		System.out.println("enter set elements");
		for(int i=0;i<n;i++)
		{
			hs.add(sc.next());
		}
		
		System.out.println("the set is : " +hs);
		
		ArrayList<String> al = new ArrayList<>(hs);
		
		System.out.println("the arraylist is " + al.get(2));
		
	}

}
