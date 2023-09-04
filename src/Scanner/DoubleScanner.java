package Scanner;

import java.util.Scanner;

public class DoubleScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter 2 numbers");
		double a, b, c;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c =  (a + b);
		System.out.println(c);


	}

}
