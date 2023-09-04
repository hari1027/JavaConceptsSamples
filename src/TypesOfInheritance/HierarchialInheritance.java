package TypesOfInheritance;

import java.util.Scanner;

class Student
{
	Student()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Name of the student is:");
		String name = sc.next();
		}
}

class Department extends Student
{
	Department()
	{
         Scanner sc = new Scanner(System.in);
	     System.out.println("Department of the student is:");
	     String dep = sc.next();
		
	}
}

class Branch extends Department
{
	Branch()
	{
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Branch of the student is:");
	     String branch= sc.next();
	}
}

class Maths extends Branch
{
	static int mark;
	Maths(int a)
	{
		 mark=a;
		 System.out.println("Maths mark of the student is: " + mark);
	    
	}
}

class English extends Branch
{
	static int mark; 
	English(int b)
	{
	   mark=b;
       System.out.println("English mark of the student is: " + mark);
	     
	}
}

class Science extends Branch
{
	static int mark; 
	Science(int c)
	{
		mark=c;
	    System.out.println("Science mark of the student is: " +mark);
	}
}
class Grade
{
	Grade(Maths  obj1, English obj2, Science obj3)
	{
		
		int total = Maths.mark + English.mark + Science.mark;
		System.out.println("Total mark of the student is: " +total);
	}

}



public class HierarchialInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Maths obj1 = new Maths(70);
		English obj2 = new English(80);
		Science obj3 = new Science(90);
		
		Grade g = new Grade(obj1, obj2, obj3);

	}

}
