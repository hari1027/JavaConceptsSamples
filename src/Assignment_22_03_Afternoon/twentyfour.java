package Assignment_22_03_Afternoon;
import java.util.*;

public class twentyfour {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the digits of the number");
		int m = sc.nextInt();
		
		
		int num[] = new int[m];
		System.out.println("enter array elements");
		for(int i=0;i<m;i++)
		{
			num[i] = sc.nextInt();
		}
		
		int temp[] = new int[m];
		
		for(int i=0;i<m;i++)
		{
			 temp[i] =  num[i] ;
		}
		
		int swap[] = new int[m];
		
		for(int i=0;i<m/2 ;i++)
		{
			swap[i] = num[i];
			num[i] = num[m-i-1];
			num[m-i-1] = swap[i];
			
		}
		
		System.out.println("the array after swaping is ");
		for(int i=0;i<m ;i++)
		{
			System.out.print(num[i]);
		}
		System.out.println();
		
		int flag=0;
		for(int i=0;i<m;i++)
		{
			if(num[i] != temp[i])
			{
				flag++;
			}
		}
		
		if(flag == 0)
		{
			System.out.println("it is a palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}

	}

}
