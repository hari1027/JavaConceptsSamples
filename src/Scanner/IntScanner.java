package Scanner;

import java.util.Scanner;

public class IntScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter 2 numbers");
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c =  (a + b);
		System.out.println(c);


	}

}
