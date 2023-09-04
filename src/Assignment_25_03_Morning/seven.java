package Assignment_25_03_Morning;
import java.util.*;

public class seven {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter the number of elements to be in the set");
		int n = sc.nextInt();
		
		System.out.println("enter set elements");
		for(int i=0;i<n;i++)
		{
			hs.add(sc.next());
		}
		
		
		System.out.println("the set is : " +hs);
		
		String [] arr = new String[hs.size()];
		
		hs.toArray(arr);
		
		for(String p : arr)
		{
			System.out.println(p);
		}
		
		

	}

}
