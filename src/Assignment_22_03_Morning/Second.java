package Assignment_22_03_Morning;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		int earning ;
		System.out.println("enter the earning of the employee");
		Scanner s = new Scanner (System.in);
		earning = s.nextInt();
		
		
		
		if(earning > 150000 )
		{
			int tax = (int) (.3 * earning);

			System.out.println("tax paid by the employee is :" + tax);
			
			
		}
		
		if(earning > 60000 && earning <= 150000)
		{
			int tax = (int) (.2* earning) ;

			System.out.println("tax paid by the employee is :" + tax);
			
			
		}
		
		if (earning > 50000 && earning <= 60000)
		{
			int tax = (int) (.1 * earning) ;

			System.out.println("tax paid by the employee is :" + tax);
			
			
		}
		
		if(earning <= 50000)
		{
			int tax = 0;

			System.out.println("tax paid by the employee is :" + tax);
			
			
		}
		
		
		

	}

}
