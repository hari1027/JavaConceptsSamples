package RuntimeIntializationOnCollections;

import java.util.HashMap;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		Scanner s = new Scanner (System.in);
		System.out.println("enter your id and name");
		m.put(s.nextInt(),s.nextLine());
		System.out.println(m.toString());
		

	}

}
