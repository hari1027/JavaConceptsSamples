package Assignment_22_03_Afternoon;
import java.util.*;

public class seven {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int binarynum[] = new int[1000];
		int i=0;
		
		while(a>0)
		{
			binarynum[i] = a%2;
			a=a/2;
			i++;
		}
		
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(binarynum[j]);
		}
		
		
		

	}

}
