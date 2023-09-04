package Scanner;

import java.util.Scanner;

public class BooleanScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter true or false");
		boolean a, b;
		a = sc.nextBoolean();
		b = sc.nextBoolean();
		System.out.println(a);
		System.out.println(b);


	}

}
