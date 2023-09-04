package Assignment_09_03;

import java.util.Scanner;

public class Looppattern3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a,b ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a & b ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		if(a>b)
		{
			System.out.println("a is greater ");
		}
		else if (b>a)
		{
			System.out.println("b is greater");
		}
		else  
		{
			System.out.println("a and b are same");
		}

	}

}
