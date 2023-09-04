package Assignment_25_03_Morning;
import java.util.*;

public class Two {

	public static void main(String[] args) {
		ArrayList  Al = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the  number of elements to be in list");
		int n = sc.nextInt();
		
		System.out.println("enter list elements");
		for(int i=0;i<n;i++)
		{
			Al.add(sc.nextInt());
		}
		
		System.out.println("the arraylist is ");
			System.out.println(Al);
		
		

	}

}
