package Assignment_24_03_Morning;
import java.util.*;

public class ten {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the length of the array");
		int m = sc.nextInt();
		
		String arr[] = new String[m];
		System.out.println("enter the array elements");
		for(int i=0;i<m;i++)
		{
			arr[i] = sc.next();
		}
		
		List L = Arrays.asList(arr);
		System.out.println(L);

	}

}
