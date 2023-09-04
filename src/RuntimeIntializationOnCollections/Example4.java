package RuntimeIntializationOnCollections;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Example4 {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("enter your id and name");
		Scanner s = new Scanner(System.in);
		v.add(s.nextInt());
		v.add(s.nextLine());
		System.out.println(v.toString());
		
		List l =new Vector();
		System.out.println("enter you id and name");
		l.add(s.nextInt());
		l.add(s.nextLine());
		System.out.println(l.toString());

	}

}
