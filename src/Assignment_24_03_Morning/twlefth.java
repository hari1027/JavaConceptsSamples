package Assignment_24_03_Morning;

import java.util.Scanner;

public class twlefth {

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
		
		int temp=0;
		for(int i=0;i<(m-1);i++)
		{
			for(int j=1 ;j<m ;j++)
			{
				if(arr[j-1]<arr[j])
				{
					temp = arr[j-1] ;
					arr[j-1] = arr[j] ;
					arr[j] = temp ;
				}
			}
		}
		
		
		System.out.println();
		System.out.println("the sorted array is");
		
		for(int i=0;i<m;i++)
		{
			System.out.print(arr[i] +" ");
		}
		
		System.out.println();
		System.out.println("The second largest number in the array is :"+ arr[1]);
		


	}

}
