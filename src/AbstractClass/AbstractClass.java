package AbstractClass;

import java.lang.Math;

abstract class Cal
{
	abstract  void cal(double x);
}

class subcal1 extends Cal
{
	 protected void cal(double x)
	{
		System.out.println(x*x);
	}
}

class subcal2 extends Cal
{
	protected void cal(double x)
	{
		System.out.println(x*x*x);
	}
}

class subcal3 extends Cal
{
	protected void cal(double x)
	{
		System.out.println(Math.sqrt(x));
	}
}
public class AbstractClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		subcal1 obj1 = new subcal1();
		subcal2 obj2 = new subcal2();
		subcal3 obj3 = new subcal3();
		
		obj1.cal(4);
		obj2.cal(4);
		obj3.cal(4);
		
		

	}

}
