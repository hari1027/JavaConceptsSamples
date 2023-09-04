package Assignment_22_03_Morning;
import java.util.*;

abstract class employee
{
	public abstract  void salary();
}

class Drivemanager extends employee
{
	public void salary()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the salary of the manager");
		int salary = sc.nextInt();
		
		System.out.println("the salary of the manger is :" +salary);
	}
}

class Clerk extends employee
{
	public void salary()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the salary of the clerk");
		int salary = sc.nextInt();
		
		System.out.println("the salary of the clerk is :" +salary);
	}
}

public class Fifth {

	public static void main(String[] args) {
		Drivemanager obj1 = new Drivemanager();
		Clerk obj2 = new Clerk();
		employee ref1;
		ref1=obj1;
		
		
		ref1.salary();
		obj2.salary();
		

	}

}
