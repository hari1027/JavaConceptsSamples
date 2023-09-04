package Assignment_24_03_Morning;
import java.util.*;

import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the array");
		int m = sc.nextInt();
		
		int arr[] = new int [m];
		System.out.println("enter the array elements");
		for(int i=0;i<m;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		double temp=0;
		for(int i=0;i<m;i++)
		{
			temp+= arr[i];
		}
		
		temp=temp/m;
		System.out.println("the average of the arrayelements is " +temp);

	}

}
