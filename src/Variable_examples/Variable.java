
package Variable_examples;

class Instance
{
	static int y=8; // static variable
	
	int x;
	Instance()
	{
		x=12; // instance variable
	}
}

public class Variable 
{

	public static void main(String[] args) 
	{
		
		Instance obj = new Instance();
		int z=9; // local variable
		z=10+z;
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(z);

	}
}



