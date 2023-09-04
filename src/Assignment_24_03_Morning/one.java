package Assignment_24_03_Morning;
import java.util.*;

public class one {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the array");
		int m = sc.nextInt();
		
		int arr[] = new int[m];
		System.out.println("enter the array elements");
		for (int i=0;i<m;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int temp =0;
		
		for(int i=0;i<m;i++)
		{
			temp+= arr[i];
		}
		
		System.out.println("The sum of the array elements is" +temp);

	}

}
