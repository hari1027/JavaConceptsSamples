package Scanner;

import java.util.Scanner;

public class CharacterScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter 2 characters");
		char a, b;
		a = sc.nextLine().charAt(0);
		b = sc.nextLine() .charAt(0);
		System.out.println(a);


	}

}
