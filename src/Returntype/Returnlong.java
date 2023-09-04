package Returntype;

import java.util.Scanner;

public class Returnlong
{
  public static long Returnlong()
   {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a:");
	long a = sc.nextLong();
	System.out.println("enetr b:");
	long b = sc.nextLong();
	long c= a+b ;
	return c ;
	}
public static void main(String[] args) {
		long x = Returnlong();
		System.out.println(x);
		

	}

}

