package Assignment_22_03_Afternoon;
import java.util.*;

public class twentysix {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		int temp=0;
		
		while(a>0)
		{
			temp += a%10;
			a=a/10;
		}
		System.out.println("sum of digits of an integer is :" + temp);
		

	}

}
