package Assignment_22_03_Morning;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		int BasicSalary,DA,HRA;
		System.out.println("enter the basic salary");
		Scanner s = new Scanner (System.in);
		BasicSalary = s.nextInt();
		
		DA=  (int) (0.4*BasicSalary);
		HRA= (int) (0.2*BasicSalary);
		
		int GrossSalary = BasicSalary  + DA + HRA ;
		System.out.println("GrossSalary =" + GrossSalary);

	}

}
