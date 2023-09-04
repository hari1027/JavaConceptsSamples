package ConditionalLoops;

import java.util.Scanner;

public class ElseIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		if(a>18)
		{
			System.out.println("adult");
		}
		else if (a>12 && a<18)
		{
			System.out.println("teeneger");
		}
		else if(a>3 && a<12)
		{
			System.out.println("schoolboy");
		}
		else if ( a<3)
		{
			System.out.println("baby");
		}

	}

}
