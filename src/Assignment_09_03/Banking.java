package Assignment_09_03;

import java.util.Scanner;

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
interface Transfermoney
{
	Scanner sc = new Scanner(System.in);
	int transfermoney = sc.nextInt();
		
}
interface Checkbalance
{
}
class BankDetails implements BankName,BankBranch,Deposit,Withdraw,Transfermoney,Checkbalance
{
	 public  BankDetails()
	{
		System.out.println("enter Bank Name");
		String name = BankName.bankname;
		System.out.println("enter Bank Branch");
		String branch =BankBranch.bankbranch;
		System.out.println("enter the amount you want to deposit");
		int dep= Deposit.dep;
		System.out.println("enter withdraw amount");
		int withdraw = Withdraw.withdraw;
		System.out.println("enter TransferMoney");
		int transfermoney = Transfermoney.transfermoney;
		int checkbalance= (Deposit.dep - Withdraw.withdraw - Transfermoney.transfermoney);
		
		System.out.println("BankName :" + name);
		System.out.println("BankBranch :" + branch);
		System.out.println("deposited amount :" + dep);
		System.out.println("withdrawn amount :" +withdraw);
		System.out.println("Transfered amount :" +transfermoney);
		System.out.println("your Acc Balance :" + checkbalance);
		
	}
}




public class Banking {

	public static void main(String[] args) {
		BankDetails obj = new BankDetails();
		
		
	}

}
