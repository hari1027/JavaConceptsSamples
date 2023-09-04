package ConditionalLoops;

import java.util.Scanner;

public class SwitchInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number : 18 or 40 or 60");
		int a = sc.nextInt();
		switch (a)
		{
		case 18 :
			System.out.println("he belongs to " + 18 + " plus category");
			break;
		case 40 :
			System.out.println("he belongs to " + 40 + " plus category");
			break;
		case 60 :
			System.out.println("he belongs to " + 60 + " plus category");
			break;
		}

	}

}
