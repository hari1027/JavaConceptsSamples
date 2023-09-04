package Assignment_22_03_Afternoon;
import java.util.*;

public class six {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter two numbers");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("The two numbers after swaping is :" +a +" "+b);
		
		

	}

}
