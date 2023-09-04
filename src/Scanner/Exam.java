package Scanner;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String a;
		a=sc.nextLine();
		
		int b;
		System.out.println("Enter a number");
		b=sc.nextInt();
		
		String c,d = null,e = null;
		c="st";
		
		System.out.println("Enter 2 strings");
	
		d=sc.nextLine();
		e=sc.nextLine();
		
		
		String f=(" "+c+" "+d+" ");
		
		char g;
		System.out.println("enter a character");
		g=sc.next().charAt(0);
		
		boolean h=true;
		
		System.out.println("d is " +d);// cannot input 2 continous string variable in java
		System.out.println("e is " +e);
		
		System.out.println(a+" "+b+f+e+" "+g);
		System.out.println(h);
		
		int x,y;
		System.out.println("enter 2 numbers");
		
		x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println(x);
		System.out.println(y);
		
		

	}

}
