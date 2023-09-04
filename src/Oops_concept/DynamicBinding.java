package Oops_concept;

class X1
{
	static int d=12;
	int e=4;
	void additon()
	{
		int a,b,c;
		a=12;b=14;
		e=7;

	c=a+b+d+e;
	System.out.println(c);
	}
}

public class DynamicBinding {

	public static void main(String[] args) {
		X1 x = new X1();
		x.additon();
		

	}

}
