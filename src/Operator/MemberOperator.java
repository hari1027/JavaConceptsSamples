package Operator;

import java.util.Scanner;

class A
{
	Scanner sc = new Scanner (System.in);
	int x = sc.nextInt();
}

public class MemberOperator {

	public static void main(String[] args) {
		A a = new A();
		System.out.println("the value of x is :" + a.x);
		

	}

}
