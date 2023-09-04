package Assignment_24_03_Morning;
import java.util.*;

public class five {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the array");
		int m= sc.nextInt();
		
		int arr[] = new int[m];
		System.out.println("enter the array elements");
		for(int i=0;i<m;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int temp=arr[0];
		for(int i=1;i<(m-1);i++)
		{
			if(arr[i]>temp)
			{
				temp = arr[i];
			}
		}
		
		System.out.println("the maximum element in the array is "+temp);
		
		int temp1=arr[0];
		for(int i=1;i<(m-1);i++)
		{
			if(arr[i]<temp1)
			{
				temp1 =arr[i];
			}
		}
		
		System.out.println("the minimum element in the array is "+temp1);

	}

}
