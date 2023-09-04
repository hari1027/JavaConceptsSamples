package Assignment_25_03_Morning;
import java.io.IOException;
import java.util.*;

public class one {

	public static void main(String[] args) throws IOException {
		HashSet hs = new HashSet();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter how many elements you want to have in set");
		int n = sc.nextInt();
		
		System.out.println("enter set elements");
		for(int i=0;i<n;i++)
		{
			hs.add(sc.next());
		}
		System.out.println("enter the elements you want to insert in set");
		String m = sc.next();
		hs.add(m);
		
		System.out.println("the set after adding element is" + hs);
		
		

	}

}
