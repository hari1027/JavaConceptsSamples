package Assignment_22_03_Afternoon;
import java.util.*;

public class twentyfive {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=0;i<b;i++)
		{
			a++;
		}
		System.out.println(" the addition of two numbers without using operator is :" +a);

	}

}
