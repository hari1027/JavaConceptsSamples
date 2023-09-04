package Returntype;

import java.util.Scanner;

public class ReturnShort
{
  public static short Returnshort()
   {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a:");
	short a = sc.nextByte();
	System.out.println("enetr b:");
	short b = sc.nextByte();
	short c=( short) (a+b) ;
	return c ;
	}
public static void main(String[] args) {
		short x = Returnshort();
		System.out.println(x);
		

	}

}
