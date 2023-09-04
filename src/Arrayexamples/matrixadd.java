package Arrayexamples;

import java.util.Scanner;

public class matrixadd {

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
		
		if(m!=o || n!=p)
		{
			System.out.println("matrix addition is not possible");
			return ;
		}
		
		int x=m;
		int y=n;
		
		int a[][] = new int [m][n];
		int b[][] = new int [o][n];
		int c[][] = new int [x][y];
		
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
			for(int j=0;j<n;j++)
			{
				c[i][j] = a[i][j]+b[i][j];
			}
		}
		System.out.println("the addition is :");
		
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				System.out.print( c[i][j] + " " );
			}
			System.out.println();
		}
	}

}
