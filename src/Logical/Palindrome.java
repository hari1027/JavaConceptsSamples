package Logical;

import java.io.IOException;
import java.util.Scanner;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the length of array");
		int m = sc.nextInt();
		char arr1[] = new char[m]  ;
		for(int i=0;i<m;i++)
		    { 
			arr1[i] = sc.next().charAt(0);
			}
		char arr2[] = new char[m];
		System.out.print("the copy of origal array is:");
		for(int i=0;i<m;i++)
		    {
			arr2[i] = arr1[i];
		    System.out.print( arr2[i] + " ");
		    }
		
		System.out.print('\n'+ "the array after palindrome is:");
		 char temp;   
		for(int i=0;i<m/2;i++)
		{	temp = arr1[i];
		    arr1[i] = arr1[m-i-1];
		    arr1[m-i-1]=temp;
		}
		for(int i=0;i<m;i++)
		{ 
			System.out.print(arr1[i] + " ");
		}
		int flag=0;
		for(int i=0;i<m;i++)
		{
			if (arr1[i]!= arr2[i])
			{ 
			   flag=+ 1 ;
			}
		}
		
		System.out.println('\n' + String.valueOf(flag));
		
		if(flag==0)
			{
				System.out.println('\n' + "it is  a palindrome");
			}
		else
		{
			System.out.println('\n'+ "not a palindrome");
		}
			
			
		}

	}


