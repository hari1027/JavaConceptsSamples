package Returntype;

import java.util.Scanner;

class Bussiness
{
	public static int cal(int bill)
	{
		System.out.println("enter the AM ");
		Scanner sc = new Scanner (System.in);
		int AM = sc.nextInt();
		AM = AM + bill;
		String Name ="hari";
	    return AM;
	}

}
public class ParameterReturn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bussiness obj = new Bussiness ();
		int x = obj.cal(1000);
		System.out.println("the total amount is:" +x);
		
		

	}

}
