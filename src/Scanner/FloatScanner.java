package Scanner;

import java.util.Scanner;

public class FloatScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter 2 numbers");
		float a, b, c;
		a = sc.nextFloat();
		b = sc.nextFloat();
		c =  (a + b);
		System.out.println(c);


	}

}
