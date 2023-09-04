package Assignment_24_03_Morning;

import java.util.Scanner;

public class fifteen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the array");
		int m= sc.nextInt();
		
		int arr[] = new int[m];
		System.out.println("enter the array elements");
		for(int i=0;i<m;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int temp1=arr[0];
		for(int i=1;i<(m);i++)
		{
			
			if(arr[i]>temp1)
			{
				temp1 = arr[i];
			}
		}
		
		System.out.println("the maximum element in the array is "+temp1);
		
		int temp2=arr[0];
		for(int i=0;i<m;i++)
		{
		
			if(arr[i]<temp2)
			{
				temp2 =arr[i];
			}
		}
		
		System.out.println("the minimum element in the array is "+temp2);
		
		System.out.println("The difference between max and min element in an array is : " +(temp1-temp2));


	}

}
