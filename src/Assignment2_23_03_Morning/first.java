package Assignment2_23_03_Morning;
import java.util.*;

interface LibraryUser
{
	public void registerAccount();
	public void requestBook();

}

class KidUser implements LibraryUser 
{
	int age ;
	int booktype ;
	
	void setmethod(int age1 , int booktype1)
	{
		age= age1;
		booktype = booktype1 ;
	}
	
	public void registerAccount()
	{
		if(age<12)
		{
			System.out.println("you have successfully registered under a Kids Account");
		}
		if(age>12)
		{
			System.out.println("Sorry, Age must be less than 12 to register as a Kid");
		}
	}
	
	public void requestBook()
	{
		if (booktype == 1)
		{
			System.out.println("Book issued Successfully, please return the book within 10 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}
	
}

class AdultUser implements LibraryUser
{
	int age ;
	int booktype;
	
	void setmethod(int age1 , int booktype1)
	{
		age= age1;
		booktype = booktype1 ;
	}
	
	public void registerAccount()
	{
		if(age>12)
		{
			System.out.println("you have successfully registered under an Adults Account");
		}
		if(age<12)
		{
			System.out.println("sorry, age must be greater than 12 to register as an adult");
		}
	}
	
	public void requestBook()
	{
		if(booktype == 2)
		{
			System.out.println("Book issued successfully , please return the book within 7 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}
}


public class first {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int age1 = sc.nextInt();
	
		System.out.println("for kidsbooks enter 1 , for Fictionbooks enter 2 ");
		System.out.println(" enter 1 or 2 ");
		int booktype1 = sc.nextInt();
		
		
		
		KidUser obj1 = new KidUser();
		AdultUser obj2 = new AdultUser();
		
		obj1.setmethod(age1,booktype1);
		obj2.setmethod(age1, booktype1);
		
		obj1.registerAccount();
		obj1.requestBook();
		
		System.out.println();
		
		
		obj2.registerAccount();
		obj2.requestBook();
		
		

	}

}
