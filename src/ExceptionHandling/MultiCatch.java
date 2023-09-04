package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		
		try
		{
			int n = sc.nextInt();
			if( 99%n == 0) 
			
				System.out.println(n + " is a factor of 99");
				else throw new ArithmeticException() ;
		}
		
		catch(InputMismatchException | ArithmeticException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
