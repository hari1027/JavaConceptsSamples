package Operator;

import java.util.Scanner;

public class RelationalOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 no's:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("result of a>b is =" + (a>b));
		System.out.println("result of a>=b is =" + (a>=b));
		System.out.println("result of a<b is =" + (a<b));
		System.out.println("result of a<=b is =" + (a<=b));
		System.out.println("result of a==b is =" + (a==b));
		System.out.println("result of a!=b is =" + (a!=b));
		
		
	}

}
