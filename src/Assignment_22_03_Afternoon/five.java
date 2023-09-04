package Assignment_22_03_Afternoon;
import java.util.*;

public class five {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter five numbers");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		
		double avg = (a+b+c+d+e)/5 ;
		System.out.println("The average of five numbers is :" + avg);
		
		

	}

}
