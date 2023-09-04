package Assignment_22_03_Morning;
import java.util.*;

public class Sixth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the length of array");
		int m = sc.nextInt();
		int arr[] = new int[m];
		
		
		
		try
		{
		
		if(arr.length >10) throw new ArrayIndexOutOfBoundsException ();
		
		System.out.println("enter the array elements");
		for(int i=0;i<m;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<m;i++)
		{
			arr[i] = arr[i]*arr[i];
		}
		
		for(int i=0;i<9;i++)
	       {
	          if(arr[i]>=100) throw new ArithmeticException ();
	       }
		
		for (int i=0;i<m;i++)
		{
			System.out.print(arr[i] +" ");
		}
		
        }
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("the array size should be 10 or less than 10 " + e);
		}
		
		catch(ArithmeticException se)
		{
			System.out.println("the square value of the number should not exceed 100 " + se);
		}
		

	}

}
