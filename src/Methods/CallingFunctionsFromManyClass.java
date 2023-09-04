package Methods;

import java.util.Scanner;

class Men
{
	public static void main()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the type of dress you want :");
	String type = sc.nextLine();
	System.out.println("enter the size :");
	int size = sc.nextInt();
	System.out.println("dress:" + type);
	System.out.println("dress:" + size);
	}
}


public class CallingFunctionsFromManyClass {

	public static void main(String[] args) {
		Men m = new Men();
		m.main();

	}

}
