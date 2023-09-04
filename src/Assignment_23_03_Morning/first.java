package Assignment_23_03_Morning;
import java.util.*;

abstract class GeneralBank
{
	public String Savinginterestrate (int amount , int years) 
	{
		String st1 ="The rate of saving interest in icici bank is 4%" + "The rate of saving interest in kotm bank is 6%";
		return st1 ;
	}
	
	public  String Fixedinterestrate (int amount ,int years)
	{
		String st2 ="The rate of Fixed interest in icici bank is 8.5%" + "The rate of saving interest in kotm bank is 9%";
		return st2 ;
	}
	
}

class IciciBank extends GeneralBank
{
	
	public String Savinginterestrate(int amount , int years)
	{
		
		double IFS =  (0.04 * amount * years);
		String st3 =("Saving interest  in icici bank  is :" + IFS);
		return st3;
		
	}
	
	public String Fixedinterestrate (int amount , int years)
	{
		
		double IFL =  (0.085 * amount * years);
		String st4 = ("Fixed interest  in icici bank is :" + IFL);
		return st4;
		
	}
	

}

class KotMBank extends GeneralBank
{
	public String Savinginterestrate(int amount , int years)
	{
		double IFS =  (0.06 * amount * years);
		String st5 = ("Saving interest  in kotmbank is :" + IFS);
		return st5;
		
	}
	
	public String Fixedinterestrate(int amount , int years)
	{
		double IFL =  (0.09 * amount * years);
		String st6 =("Fixed interest  in kotmbank is :" + IFL);
		return st6;
	}
	
}

public class first {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter the amount you want to put in bank");
		int amount = sc.nextInt();
		System.out.println("enter the No.of years");
		int years = sc.nextInt();
		
		IciciBank obj1 = new IciciBank();
		KotMBank obj2 = new KotMBank();
		
		
		System.out.println(obj1.Savinginterestrate(amount,years));
		System.out.println(obj1.Fixedinterestrate(amount,years));
		
		System.out.println(obj2.Savinginterestrate(amount,years));
		System.out.println(obj2.Fixedinterestrate(amount,years));
		
		}

}
