package Assignment_24_03_Morning;
import java.util.*;

public class seven {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the length of the array");
		int m= sc.nextInt();
		
		int arr[] = new int[m];
		System.out.println("enter the array elements");
		for(int i=0;i<m;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		int temp;
		for(int i=0;i<m/2;i++)
		{
			temp = arr[i];
			arr[i] = arr[m-i-1];
			arr[m-i-1] = temp ;
		}
		
		System.out.println("The reversed array is");
		for(int i=0;i<m;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}
