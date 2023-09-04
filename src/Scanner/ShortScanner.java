package Scanner;

import java.util.Scanner;

public class ShortScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter 2 numbers");
		short a, b, c;
		a = sc.nextShort();
		b = sc.nextShort();
		c = (short) (a + b);
		System.out.println(c);


	}

}
