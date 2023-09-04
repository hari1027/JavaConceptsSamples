package Scanner;

import java.util.Scanner;

public class ByteScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter 2 numbers");
		byte a, b, c;
		a = sc.nextByte();
		b = sc.nextByte();
		c = (byte) (a + b);
		System.out.println(c);

	}

}
