package TypesOfInheritance;

import java.util.Scanner;

class Dressshop
{
	 Dressshop()
	{
		String name;
		int size;
		String color;
		Scanner sc = new Scanner (System.in);
		System.out.println("specify the type of dress");
		name=sc.next();
		System.out.println("specify the size of dress");
		size=sc.nextInt();
		System.out.println("specify the color of dress");
		color=sc.next();
	}
}

class Histyle extends Dressshop
{
	Histyle()
	{
		int rate ;
		int discount ;
		int totalamount;
		Scanner sc = new Scanner (System.in);
		System.out.println("the bill amount is :");
		rate=sc.nextInt();
		System.out.println("discount is ");
		discount=sc.nextInt();
		totalamount=rate-discount;
		System.out.println("the cost of your dress is " + totalamount );
		}
}

public class SingleInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Histyle obj = new Histyle();
		
	

	}

}
