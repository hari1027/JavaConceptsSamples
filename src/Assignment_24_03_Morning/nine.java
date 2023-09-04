package Assignment_24_03_Morning;
import java.util.*;

public class nine {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the length of the array");
		int m=sc.nextInt();
		
		int arr[] = new int[m];
		System.out.println("enter the array elements");
		for(int i=0;i<m;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<(m-1);i++)
		{
		  for(int j=(i+1);j<m;j++)
		  {
			  if(arr[i]==arr[j])
			  {
			  set.add(arr[i]);
			  break;
			  }
		  }
		}
		System.out.println("the dupliacate elements are");
		
		for(Integer i :set)
		{
			System.out.println(i);
		}

	}

}
