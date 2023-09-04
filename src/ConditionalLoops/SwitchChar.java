package ConditionalLoops;

import java.util.Scanner;

public class SwitchChar {


	/**
	 * @param args
	 * @param M 
	 * @param F 
	 * @param  
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a character : M or f or T");
		char a = sc.next(). charAt(0);
		switch (a)
	{
		case 'M' :
		
			System.out.println( "Male");
			break;
		
		case  'F' :
		 
			System.out.println("Female");
			break;
		
		case 'T' :
		
			System.out.println("Trans");
			break;
		
	}
		}

}
