package Assignment_24_03_Morning;

import java.util.Scanner;

public class twentytwo {

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
		
		System.out.println();
		System.out.println("enter the element you want to search");
		int a = sc.nextInt();
		
		
		int flag =0;
		for(int i=0;i<m;i++)
		{
			if( a== arr[i])
			{
				System.out.println("the element " +a +" is presented at position " +(i+1) );
				flag =1;
				break;
			}
		}
		
		if(flag == 0)
		    {
				System.out.println("The element is not presented");
			}
		

	}

}
