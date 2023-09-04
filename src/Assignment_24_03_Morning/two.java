package Assignment_24_03_Morning;
import java.util.*;

public class two {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the length of the array");
		int m= sc.nextInt();
		
		int arr[] = new int[m];
		System.out.println("enter the array elements");
		for(int i=0;i<m;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("the array elements are");
	      for(int i=0;i<m;i++)
	      {
	    	  System.out.println(arr[i] + " ");
	      }
	      
	      System.out.println("enter an element present in the array");
	      int n=sc.nextInt();
	      
	      int index=0;
	      for(int i=0;i<m;i++)
	      {
	    	  if(n == arr[i])
	    	  {
	    		  index = i ;
	    		  break;
	    	  }
	    		  
	      }
	      System.out.println("index position of the element is : " +index);
	   

	}

}
