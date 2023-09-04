package Logical;

import java.util.Scanner;

public class Amastrongnumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number except 0");
		int a = sc.nextInt();
		int b=a;
		int temp=0,res =0;
		while(a != 0)
			
		      {
	        	temp=a%10;
	          	res += temp*temp*temp;
	          	a= a/10;
		      }
		      
		System.out.println(res);
		
		if(b == res)
		{
			System.out.println("given number is amstrong number");
		}
		else
		{
			System.out.println("not an amstrong number");
		}

	}

}
