package ConditionalLoops;

import java.util.Scanner;

public class IfElse {

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
		else
		{
			System.out.println("young");
		}

	}

}
