package Returntype;

class Add
{
	public static int ReturnValue()
	{
		int a=5,b=10;
		int c=a+b;
		return c;
	}
}

public class ReturntypeInt {

	public static void main(String[] args) {
		Add a = new Add();
		System.out.println("the value of c is :");
		int x = a.ReturnValue();
		System.out.println(x);
}

}

