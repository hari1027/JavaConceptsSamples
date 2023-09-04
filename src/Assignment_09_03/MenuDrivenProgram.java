package Assignment_09_03;
import java.util.*;


public class MenuDrivenProgram {

	public static void main(String[] args) {
	
		
			System.out.println("press 1 for add");
			System.out.println("press 2 for subtract");
			System.out.println("press 3 for multilipaction");
			System.out.println("press 4 for division");
			System.out.println("press 5 for modulus");
		
		
		System.out.println("Make a choice");
		System.out.println("enter 1 or 2 or 3 or 4 or 5");
		Scanner sc = new Scanner (System.in);
		int choice = sc.nextInt();
		
		switch(choice)
		{
		
		case 1:
			
		{
				System.out.println("enter first number");
		        int a = sc.nextInt();
			    System.out.println("enter second number");
			    int b = sc.nextInt();
			    int c=a+b;
			    System.out.println("the addition is :"+ c);
			    break;
		}
			
		case 2:
		{
			System.out.println("enter first number");
	        int a = sc.nextInt();
		    System.out.println("enter second number");
		    int b = sc.nextInt();
		    int c=a-b;
		    System.out.println("the subraction is :"+ c);
		    break;
		}
		
		case 3:
		{
			System.out.println("enter first number");
	        int a = sc.nextInt();
		    System.out.println("enter second number");
		    int b = sc.nextInt();
		    int c=a*b;
		    System.out.println("the multiplication is :"+ c);
		    break;
		}
		
		case 4:
			{
			    System.out.println("enter first number");
	            int a = sc.nextInt();
		        System.out.println("enter second number");
		        int b = sc.nextInt();
		        int c=a/b;
		        System.out.println("the division is :"+ c);
		        break;
		    }
			
		case 5:
		{
			 System.out.println("enter first number");
	            int a = sc.nextInt();
		        System.out.println("enter second number");
		        int b = sc.nextInt();
		        int c=a%b;
		        System.out.println("the modulus is :"+ c);
		        break;
		  }
			
	}
  }

}
