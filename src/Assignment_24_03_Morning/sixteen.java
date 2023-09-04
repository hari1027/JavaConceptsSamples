package Assignment_24_03_Morning;

import java.util.Scanner;

public class sixteen {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the length of the array");
		int m= sc.nextInt();
		
		int arr[] = new int[m];
		System.out.println("enter the array elements");
		for(int i=0;i<m;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<m;i++)
		{
			System.out.print(arr[i] +" ");
		}
		int last = arr[m-1];
		
		for (int i=(m-1);i> 0; i--)
		{
		    arr[i] = arr[i-1];
		}
		    arr[0] = last;
		
	
		
		System.out.println();
		System.out.println("The array after one clockwise rotation");
		
		for(int i=0;i<m;i++)
		{
		System.out.print(arr[i] +" ");
		}

	}

}
