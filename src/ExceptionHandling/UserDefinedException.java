package ExceptionHandling;

class Error extends Exception
{
	
}

class Triangle
{
	double m,n;
	Triangle(double l , double o)
	{
		m=l;
		n=o;
	}
	
	public void area() throws Error
	{
		if(m<=0 || n<=0) throw new Error();
		
		else
		{
			System.out.println("Area is :" + 0.5*m*n);
		}
		
	}
}

public class UserDefinedException {

	public static void main(String[] args) {
		 
		Triangle t = new Triangle(-4,3);
		try
		{
			t.area();
		}
		catch (Error err)
		{
			System.out.println("Input value should be greater than 0");
			System.out.println(err);
		}


	}

}
