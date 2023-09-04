package TypesOfInheritance;

import java.util.Scanner;

class Paramount
{
	Paramount()
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

class Relaincetrends extends Paramount
{
	Relaincetrends()
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

class Saravanastores extends Relaincetrends
{
	public void dress(String a , String b)
	{
		System.out.println("coupon is valid till" + a);
		System.out.println(b);
		
	}
}



public class MultilevelInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Saravanastores obj = new Saravanastores();
		obj.dress(" next year. " , " Thank you & visit again ");
		

	}

}
