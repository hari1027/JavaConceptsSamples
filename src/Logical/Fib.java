package Logical;

import java.util.Scanner;

public class Fib {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the length of array as");
		int m = sc.nextInt();
		int fib[] = new int[m];
		 fib[0] = 0;
		 fib[1] = 1;
		
		for(int i=2;i<m;i++)
		{
			fib[i] = fib[i-1]+ fib[i-2];
			
		}
		System.out.println(" the fib series :" );
		for(int i=0;i<m;i++)
		{
			System.out.print(fib[i]+ " ");
		}
		
	

}
}
