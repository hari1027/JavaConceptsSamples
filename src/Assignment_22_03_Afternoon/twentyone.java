package Assignment_22_03_Afternoon;
import java.util.*;

public class twentyone {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the length of the array");
		int m = sc.nextInt();
		int arr[] = new int[m];
		
		for(int i=0;i<m;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int temp = arr[0];
		arr[0] = arr[m-1];
		arr[m-1] = temp ;
		
		System.out.println("new array is ");
		for(int i=0;i<m;i++)
		{
			System.out.print( arr[i] + " ");
		}
		
		

	}

}
