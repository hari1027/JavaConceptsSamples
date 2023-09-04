package DiffrentMethodConcept;

interface insurance
{
	default void premium()
	{
		System.out.println("for primium customers it is free");
	}
		 void add();
		
	
}

public class DefaultMethod implements insurance {
	public void add()
	{
		{
			int amount=100;
			int tax=10;
			int total=amount+tax;
			System.out.println("total amount = " + total);
		}
	}

	public static void main(String[] args) {
		DefaultMethod obj = new DefaultMethod();
		obj.add();
		obj.premium();

	}

}
