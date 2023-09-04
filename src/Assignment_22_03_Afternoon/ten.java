package Assignment_22_03_Afternoon;
import java.util.*;

public class ten {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		int temp =0;
		int b=0;
		
		for(int i=0;a>0;i++)
		{
	        temp = temp + (a%10);
		    a=a/10;
			i++;
		}
		
		System.out.println("the sum of the digits in a number is :" + temp);
		

	}

}
