package Arrayexamples;

import java.util.Scanner;

public class Multiplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("enter rows and coloumns of array1");
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		System.out.println("enter rows and coloumns of array2");
		int o=sc.nextInt();
		int p=sc.nextInt();
		
		if( n!= o)
		{
			System.out.println("matrix addition is not possible");
			return ;
		}
		
		
		int a[][] = new int [m][n];
		int b[][] = new int [o][p];
		int c[][] = new int [m][p];
		
		System.out.println("enter array1 elements :");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("enter array2 elements :");
		for(int i=0;i<o;i++)
	    {
			for(int j=0;j<p;j++)
			
			{
				b[i][j] = sc.nextInt();
			}
	    }
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<p;j++)
			{
				
			   for(int k=0;k<n;k++)
			{
				c[i][j] += a[i][k] * b[k][j];
			}

			}
		}
		System.out.println("the multiplication is :");
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<p;j++)
			{
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

}
