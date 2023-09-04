package Assignment_22_03_Morning;
import java.util.*;

interface Politician
{
	Scanner sc = new Scanner (System.in);
	int salary = sc.nextInt();
	String function = sc.nextLine();
}

interface Sportsman
{
	Scanner sc = new Scanner (System.in);
	int salary = sc.nextInt();
	String function = sc.nextLine();
}

class Person implements Politician , Sportsman
{
	Person()
	{
	System.out.println("enter the salary and job of politician");
	System.out.println("the salary of the politician is :"+ Politician.salary);
	System.out.println("the job of the politician is :"+ Politician.function);
	
	System.out.println("enter the salary and job of  sportsman");
	System.out.println("The salary of the sportsman is :"+ Sportsman.salary);
	System.out.println("The job of the sportsman is :"+ Sportsman.function);
	
	System.out.println();
	
	System.out.println("The totalsalary of that person is :"+ (Politician.salary + Sportsman.salary));
	System.out.println("The job of the person is to :" + (Politician.function + Sportsman.function));
	}
	
	
}
public  class Fourth {

	public static void main(String[] args) {
		Person obj = new Person();
		

	}

}

