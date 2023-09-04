package Operator;

import java.util.Scanner;

public class ArithimaticOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a,b;
		System.out.println("enter 2 numbers:");
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		b=sc.nextInt();
		System.out.println("addition is :"+ (a+b));
		System.out.println("Subraction is :"+ (a-b));
		System.out.println("multiplication is :"+ (a*b));
		System.out.println("division is :"+ (a/b));
	    System.out.println("modulus is :"+ (a%b));
	}

}
