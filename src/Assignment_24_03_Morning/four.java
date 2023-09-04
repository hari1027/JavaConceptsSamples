package Assignment_24_03_Morning;
import java.util.*;

public class four {

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
		
		System.out.println("enter the specific interger you want to search in array");
		int a = sc.nextInt();
		
		int flag=0;
		for(int i=0;i<m;i++)
		{
			if(a == arr[i])
			{
			System.out.println("the integer " +a+ " is present in the array");
		    flag =1;
			break;
			}
			
		}
		if(flag != 1)
			System.out.println("the integer " +a+ " is not presented");
			
		

	}

}
