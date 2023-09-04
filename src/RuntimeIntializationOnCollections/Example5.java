package RuntimeIntializationOnCollections;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue();
		Scanner s = new Scanner(System.in);
		System.out.println("enter company and name");
		p.add(s.nextLine());
		p.add(s.nextLine());
		System.out.println(p.toString());

	}

}
