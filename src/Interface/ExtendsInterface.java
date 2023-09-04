package Interface;

import java.util.Scanner;

interface BankName {
	public void bank();
}

interface Sector extends BankName {
	public void branch();
}

class Money implements Sector {
	int moneypaid, loanbought;

	Money() {
		moneypaid = 10000;
		loanbought = 20000;

	}

	public void branch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name of branch :");
		String name = sc.next();
		System.out.println("branch name is :" + name);
	}

	public void bank() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name of bank :");
		String name = sc.next();
		System.out.println("bank name is :" + name);
	}
	
	

	public int amount() {
		int AmountRemaining = loanbought - moneypaid;
		return AmountRemaining;
	}

}

public class ExtendsInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Money obj1 = new Money();
		obj1.branch();
		
		obj1.bank();
		
		System.out.println("The amount to be paid is :" + obj1.amount());

	}

}
