package Scanner;

import java.util.Scanner;

public class LongScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter 2 numbers");
		long a, b, c;
		a = sc.nextLong();
		b = sc.nextLong();
		c =  (a + b);
		System.out.println(c);


	}

}
