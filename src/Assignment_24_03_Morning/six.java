package Assignment_24_03_Morning;

import java.util.Arrays;
import java.util.Scanner;

public class six {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the length of the array");
		int m= sc.nextInt();
		
		int arr[] = new int[m+1];
		System.out.println("enter the array elements");
		for(int i=0;i<m;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("enter the element and the position you want to insert into the array");
		int element = sc.nextInt();
		int position = sc.nextInt();
		
		for(int i=(m-1) ;i>= (position-1) ;i--)
		{
		   arr[i+1] = arr[i];
		}
		
		arr[position-1] = element ;
		
		System.out.println("new array is");
		
		for(int i=0;i<m;i++)
		{
			System.out.print(arr[i] +",");
		}
		
		System.out.print(arr[m]);
		

	}

}
