package Oops_concept;

class Histyle
{
	Histyle()
	{
	String a="modern";
	String b="traditional";
	System.out.println("like "+ a +" dress ");
	System.out.println("like "+ b +" dress ");
	}
	
	void histyle()
	{
		System.out.println("I am also a function");
	}
	
}
class Paramount extends Histyle
{
	Paramount()
	{
		System.out.println("dress");
	}
	
	void paramount()
	{
		System.out.println("function");
	}
}
public class Inheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Paramount obj = new Paramount();
		obj.paramount();
		obj.histyle();
		
	    }

}
