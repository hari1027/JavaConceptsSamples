package Arrayexamples;

import java.util.Scanner;

public class arrayruntime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of arrays");
		int m = sc.nextInt();
		int a[] = new int [m];
		int n = sc.nextInt();
		int b[] = new int [n];
		int temp=0;
		
		if(m!=n)
		{
			System.out.println("both arrays are not equal");
			return ;
		}
		System.out.println("enter array 1");
		for(int i=0;i<m;i++)
		{
			a[i]= sc.nextInt();
		}
		
		System.out.println("enter array 2");
		for(int i=0;i<n;i++)
		{
			b[i]= sc.nextInt();
		}
		
		for(int i=0;i<m;i++)
		{
			if(a[i]!=b[i])
			{
				temp=+ 1;
			}
		}
		
		if(temp==0)
		{
			System.out.println("both arrays are equal");
		}
		
		else
		{
			System.out.println("both arrays are not equal");
		}

	}

}
