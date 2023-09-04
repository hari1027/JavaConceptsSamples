package Assignment_24_03_Morning;
import java.util.*;

public class fourteen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the array");
		int m= sc.nextInt();
		
		int arr[] =new int[m];
		System.out.println("enter array elements");
		for(int i=0;i<m;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int flag1=0;
		int flag2=0;
		
		for(int i=0;i<m;i++)
		{
			if(arr[i]%2 == 0)
			{
				flag1++ ;
			}
			
			if(arr[i]%2 != 0)
			{
				flag2++ ;
			}
		}
		
		System.out.println("No.Of even number elements in the array is : " +flag1);
		System.out.println("No.of odd number elements in the array is : " +flag2);
		

	}

}
