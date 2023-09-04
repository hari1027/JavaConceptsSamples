package Assignment_22_03_Afternoon;
import java.util.*;

public class eight {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a binarynumber");
		int a = sc.nextInt();
		
		int temp=a;
		int base=1;
		int dec_value = 0;
		
		while(temp > 0)
		{
			int last_digit = temp%10;
			temp = temp/10;
			dec_value += last_digit * base;
			base = base*2;
		}
		
		System.out.println("the decimal number is " + dec_value);
		
		

	}

}
