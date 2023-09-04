package Assignment_25_03_Morning;
import java.util.*;

class EmployeeId
{
	public void id()
	{
	HashSet id = new HashSet();
	Scanner sc = new Scanner(System.in);
	int n=5 ;
	System.out.println("enter the id's of the employees ");
	
	for(int i=0;i<n;i++)
	{
		id.add(sc.nextInt());
	}
	System.out.println("The employee id's are : " +id);
	}
}

class EmployeeName
{
	public void name()
	{
		HashSet name = new HashSet();
		Scanner sc = new Scanner(System.in);
		int n=5;
		System.out.println("enter the names of the employees");
		
		for(int i=0;i<n;i++)
		{
			name.add(sc.next());
		}
		System.out.println("The employee names are : "+name);
	}
}

class EmployeeDesignation
{
	public void designation()
	{
		HashSet designation = new HashSet();
		Scanner sc = new Scanner(System.in);
		int n=5 ;
		System.out.println("enter the designation of the employees");
		
		for(int i=0;i<n;i++)
		{
			designation.add(sc.next());
		}
		System.out.println("The employees Designation are : " +designation);
	}
}

class EmployeeDOB
{
	public void dob()
	{
		HashSet dob = new HashSet();
		Scanner sc = new Scanner(System.in);
		int n=5;
		System.out.println("enter the dob of the employees");
		
		for(int i=0;i<n;i++)
		{
			dob.add(sc.next());
		}
		System.out.println("The employees date of birth are : " +dob);
	}
}

class Employeeaddress
{
	public void address()
	{
		HashSet address = new HashSet();
		Scanner sc = new Scanner(System.in);
		int n=5 ;
		System.out.println("enter the address of the employees");
		
		for(int i=0;i<n;i++)
		{
			address.add(sc.next());
		}
		System.out.println("The employees address are : " +address);
	}
}

class EmployeeEmail
{
	public void email()
	{
		HashSet email = new HashSet();
		Scanner sc = new Scanner(System.in);
		int n=5;
		System.out.println("enter the email id of the employees");
		
		for(int i=0;i<n;i++)
		{
			email.add(sc.next());
		}
		System.out.println("The employees email id are : " +email);
	}
}

class EmployeeMobileNum
{
	public void mobile()
	{
		HashSet mob = new HashSet();
		Scanner sc = new Scanner (System.in);
		int n=5;
		System.out.println("enter the mobile numbers of the employes");
		
		for(int i=0;i<n;i++)
		{
			mob.add(sc.nextLong());
		}
		System.out.println("The employee mobile numbers are : " +mob);
	}
}

public class Employee {

	public static void main(String[] args) {
		
		EmployeeId obj1 = new EmployeeId();
		EmployeeName obj2 = new EmployeeName();
		EmployeeDesignation obj3 = new EmployeeDesignation();
		EmployeeDOB obj4 = new EmployeeDOB();
		Employeeaddress obj5 = new Employeeaddress();
		EmployeeEmail obj6 = new EmployeeEmail();
		EmployeeMobileNum obj7 = new EmployeeMobileNum();
		
	  obj1.id();
	  obj2.name();
	  obj3.designation();
	  obj4.dob();
	  obj5.address();
	  obj6.email();
	  obj7.mobile();
	  
		
		
		

	}

}
