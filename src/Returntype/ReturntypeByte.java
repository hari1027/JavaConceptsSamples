package Returntype;

import java.util.Scanner;

class Add2
{
	public static byte Returnbyte()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a:");
		byte a = sc.nextByte();
		System.out.println("enetr b:");
		byte b = sc.nextByte();
		byte c=( byte) (a+b) ;
		return c ;
		
	}

}

public class ReturntypeByte {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Add2 a = new Add2();
		System.out.println("the value of c is : ");
		int x = a.Returnbyte();
		System.out.println(x);
		
		

	}

}
