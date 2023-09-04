package Assignment_24_03_Morning;

import java.util.Scanner;

public class twenty {

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
		
		System.out.println("array before sorting");
		for(int i=0;i<m;i++)
		{
		System.out.println(arr[i]);
		}
		
		String  temp ;
		for(int i=0;i<m;i++)
		{
			for(int j=(i+1) ;j<m; j++)
			{
				if(arr[i].compareTo(arr[j]) > 0)
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp ;
				}
			}
		}
		
		System.out.println("The alphabatically sorted array is ");
		
		for(int i=0;i<m;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
