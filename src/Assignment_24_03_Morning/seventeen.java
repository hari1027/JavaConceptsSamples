package Assignment_24_03_Morning;
import java.util.*;

public class seventeen {

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
		
		int j;
		
		for(int i=0;i<m;i++)
		{
			for( j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
					break;
			}
			if(i==j)
			{
				System.out.println(arr[i] +" ");
			}
			
			
		}

	}

}
