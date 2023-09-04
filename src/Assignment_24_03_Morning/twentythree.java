package Assignment_24_03_Morning;
import java.util.*;


public class twentythree {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the no of subjects");
		int m = sc.nextInt();
		
		
		int arr[] = new int[m];
		System.out.println("enter the marks of the student out of 100");
		for(int i=0;i<m;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("total marks is : ");
		
		int temp = 0;
		for(int i=0;i<m;i++)
		{
			temp+= arr[i];
		}
		
		System.out.println(temp);
		
		System.out.println("percentage is : ");
		
		temp = (temp/m) ;
		
		System.out.println(temp);

	}

}
