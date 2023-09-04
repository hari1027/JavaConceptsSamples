package Assignment_22_03_Morning;
import java.util.*;

public class Seventh {

	public static void main(String[] args) {
		System.out.println("enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		
		int arr[] = new int[m];
		System.out.println("enter the array elements");
		for(int i=0;i<m;i++)
		{
	         arr[i] = sc.nextInt();
		}
		
		try
		{
			for (int i=0;i<m;i++)
			{
				if(arr[i] < 0) throw new NegativeArraySizeException () ;
			}
			
			for (int i=0;i<m;i++)
			{
				System.out.print(arr[i] + " ");
			}
		}
		
		catch (NegativeArraySizeException e)
		{
			System.out.println("The array elements should not be negative " + e);
		}
		

	}

}
