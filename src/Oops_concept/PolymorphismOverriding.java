package Oops_concept;

class Dad
{
	void calculate(int a,int b)
	{
		System.out.println("output :" + (a+b));
	}
}

class Son extends Dad
{
	void calculate(int a,int b)
	{
		System.out.println("output :" + (a*b));
	}
	
	
}

public class PolymorphismOverriding {

	public static void main(String[] args) {
		Son s = new Son ();
		s.calculate(3,5);// though Son class extends Dad it will execute Son class function only since object is created for Son only.

	}

}
