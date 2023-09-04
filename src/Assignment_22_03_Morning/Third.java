package Assignment_22_03_Morning;
import java.util.*;


interface BankName
{
	Scanner sc = new Scanner(System.in);
	String bankname = sc.nextLine();

}

interface BankBranch 
{
	    Scanner sc = new Scanner(System.in);
		String bankbranch = sc.nextLine();
	
}
interface Deposit
{
	Scanner sc = new Scanner(System.in);
	int dep = sc.nextInt();
}
interface Withdraw
{
	Scanner sc = new Scanner(System.in);
	int withdraw = sc.nextInt();
}

class Checkbalance implements BankName , BankBranch ,Deposit , Withdraw 
{
	public int balance()
	{
	System.out.println("enter Bank Name");
	String name = BankName.bankname;
	System.out.println("enter Bank Branch");
	String branch =BankBranch.bankbranch;
	System.out.println("enter the amount you want to deposit");
	int dep= Deposit.dep;
	System.out.println("enter withdraw amount");
	int withdraw = Withdraw.withdraw;
	int checkbalance= (Deposit.dep - Withdraw.withdraw);
	
	
	System.out.println("BankName :" + name);
	System.out.println("BankBranch :" + branch);
	System.out.println("deposited amount :" + dep);
	System.out.println("withdrawn amount :" +withdraw);
	
	return checkbalance;
	}

}
public class Third {

	public static void main(String[] args) {
		
		Checkbalance obj = new Checkbalance() ;
		System.out.println("the balance in the account is " + obj.balance());
		

	}

}
