package Assignment_24_03_Morning;
import java.util.*;

public class eight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of two arrays");
		int m =sc.nextInt();
		int n =sc.nextInt();
		
		int arr1[] = new int [m];
		System.out.println("enter the array1 elements");
		for(int i=0;i<m;i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		int arr2[] = new int [n];
		System.out.println("enter array2 elements");
		for(int i=0;i<n;i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				 if(arr1[i]==arr2[j])
				 {
				    set.add(arr1[i]);
				    break;
				 }
			}
				
		}
		
		
		System.out.println("common elements between two arrays are");
		
		for(Integer i :set)
		{
			System.out.println(i);
		}

	}

}
