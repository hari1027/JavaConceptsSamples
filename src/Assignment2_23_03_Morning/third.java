package Assignment2_23_03_Morning;
import java.util.*;

class Globalvariable
{
public static double initialBalance = 0 ;
}



interface PaymentMode
{
	public void checkbalance();
	public void checkbalance(double spotcash);
}

class cash implements PaymentMode
{
	public void checkbalance()
	{
		
	}
	
	public void checkbalance(double spotcash) 
	{
		try
		{
		    if(spotcash<3000) throw new Exception();
		   
		    System.out.println("I purchased a mobilephone for 3000 using spot cash");
		
	        double cash = (spotcash - 3000);
		
		    System.out.println("spot cash i am having after buying mobilephone is "+ cash);
		}
		
		catch (Exception e)
		{
			System.out.println("you dont have sufficient cash " +e);
		}
		
	}
}

class cheque implements PaymentMode
{
	public void checkbalance(double dummy)
	{
		
	}

	public void checkbalance()
	{
		try
		{
		  if(Globalvariable.initialBalance < 1000) throw new Exception();
		
		  System.out.println("I purchased a cooker for 1000 using cheque");
		
		  Globalvariable.initialBalance = Globalvariable.initialBalance - 1000 ;
		 
		  System.out.println("Your taransaction is successful. " +" your acc balance is "+ Globalvariable.initialBalance);
		}
		
		catch (Exception e)
		{
			System.out.println("you dont have sufficient amount"+ e);
		}
	}
}

class creditcard implements PaymentMode
{

	public void checkbalance(double dummy)
	{
		
	}
	
	public void checkbalance()
	{
		try
		{
			if(Globalvariable.initialBalance<3000) throw new Exception();
		
		    System.out.println("I purchased a sofa for 3000 using creditcard");
		
		    Globalvariable.initialBalance = Globalvariable.initialBalance - 3000 ;
		
		    System.out.println("your transaction is sucessful. " +" your acc balance is "+ Globalvariable.initialBalance);
		}
		
		catch (Exception e)
		{
			System.out.println("your dont have sufficienr amount" +e);
		}
	}
}

class debitcard implements PaymentMode
{

	public void checkbalance(double dummy)
	{
		
	}
	
	public void checkbalance()
	{
		try
		{
			if(Globalvariable.initialBalance<1000) throw new Exception();
		
		    System.out.println("I purchased a watch for 1000 using debitcard");
		
		    Globalvariable.initialBalance = Globalvariable.initialBalance - 1000 ;
		
		    System.out.println("your transaction is sucessful. "+" your acc balance is"+ Globalvariable.initialBalance);
		}
		
		catch(Exception e)
		{
			System.out.println("you dont have sufficient amount" +e);
		}
	}
}

public class third  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the amount you have");
		int amount = sc.nextInt();
		
		System.out.println("enter the name of the bank");
		String name = sc.next();
		
		System.out.println("enter the account number");
		double AccNo = sc.nextInt();
		
		System.out.println("enter the deposit amount");
		double depamount = sc.nextInt();
		
	
		System.out.print("Amount I have in spotcash after depositing some money in bank is ");
		double spotcash = ( amount - depamount ) ;
		System.out.println(spotcash);
		
	    Globalvariable.initialBalance = depamount ;
		
		cash obj2 = new cash();
		cheque obj3 = new cheque();
		creditcard obj4 = new creditcard();
		debitcard obj5 = new debitcard();
		
		obj2.checkbalance(spotcash);
		obj3.checkbalance();
		obj4.checkbalance();
		obj5.checkbalance();
	}

}
