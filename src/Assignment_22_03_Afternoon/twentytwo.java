package Assignment_22_03_Afternoon;
import java.util.*;

public class twentytwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the array");
		int m = sc.nextInt();
		
		int arr[] = new int[m];
		System.out.println("enter array elements");
		
		for(int i=0;i<m;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("even elements are :");
		for(int i=0;i<m;i++)
		{
			if(arr[i]%2 == 0)
			{
				System.out.println(arr[i]);
			}
				
		}
		System.out.println("if 1 is presented in array add 1 in odd elements list ");
		System.out.println("odd elements are :");
		for(int i=0;i<m;i++)
		{
			if(arr[i]%2 != 0)
			{
				System.out.println(arr[i]);
			}
		}
		

	}

}
