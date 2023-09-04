package AbstractClass;

abstract class bank
{
	bank() // constructor
	{
		System.out.println("balance is = 1000");
	}
	void banks() // function
	{
		System.out.println("please maintain");
	}
}

class Hdfc extends bank
{
	void hdfc()
	{
	int a=100;
	System.out.println(a);
	}

}

public class ConcreteMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hdfc obj = new Hdfc();//(it also executes the statements inside constructor)
		obj.banks(); // (it also executes the statements inside functions)
		obj.hdfc();
		

	}

}
