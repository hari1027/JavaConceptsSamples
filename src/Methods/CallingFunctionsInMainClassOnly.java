package Methods;

import java.util.Scanner;

public class CallingFunctionsInMainClassOnly {

	public static void main(String[] args) 
	    {
		emp();
		}
		public static void emp()
		{
			Scanner sc = new Scanner (System.in);
			System.out.println("enter id");
			int id = sc.nextInt();
			System.out.println("id is :" +id);
			name();
		}
		public static void name()
		{
			String name = "hari";
			System.out.println("name is : " +name);
			age();
		}
		public static void age()
		{
			Scanner sc = new Scanner (System.in);
			System.out.println("enter the age");
			int age = sc.nextInt();
			System.out.println("age is :" + age);
		}
		}

	




