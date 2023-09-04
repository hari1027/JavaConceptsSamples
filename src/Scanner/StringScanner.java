package Scanner;

import java.util.Scanner;

public class StringScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter 2 strings");
		String a, b, c;
		a = sc.nextLine();
		b = sc.nextLine();
		c = (a + b);
		System.out.println(c);


	}

}
