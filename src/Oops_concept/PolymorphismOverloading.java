package Oops_concept;

class Example
{
	void calculate(float a,float b, int c)
	{
		System.out.println("output is :" + (a+b+c));
	}
	
	void calculate(int a, int b)
	{
		System.out.println("the output is :" + (a+b));
	}
	
	
	
	
	void calculate (int a,int b,int c)
	{
		System.out.println("the output is :" + (a+b+c));
	}
}

public class PolymorphismOverloading {

	public static void main(String[] args) {
	   Example ex = new Example ();
	   ex.calculate(12.4f, 12.67f, 12);
	   ex.calculate(10, 13);
	   ex.calculate(10, 12, 13);

	}

}
