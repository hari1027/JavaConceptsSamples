package AbstractClass;

import java.lang.Math;

class Add
{
	void calculate1(double x)
	{
		System.out.println("square value is :" +(x*x) );
	}
	
	void calculate2(double x)
	{
		System.out.println("cube value is :" + (x*x*x));
	}
	
	void calculate3(double x)
	{
		System.out.println("square root is :" + (Math.sqrt(x)) );
	}
}

public class NeedForAbstractclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Add obj = new Add();
		obj.calculate1(5);
		obj.calculate2(5);
		obj.calculate3(16);
		

	}

}
