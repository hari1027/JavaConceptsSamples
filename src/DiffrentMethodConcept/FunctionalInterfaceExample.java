package DiffrentMethodConcept;


@FunctionalInterface
interface A
{
	 void hello(String str);
	 //void bye();
}

public class FunctionalInterfaceExample implements A
{
	public void hello(String str)
	{
		System.out.println(str);
		 str=str+"Dad";
		 str=str+"Mom";
	    System.out.println(str);
		
	}
	
	//public void hello(String str)
	

	public static void main(String[] args) {
		FunctionalInterfaceExample obj = new FunctionalInterfaceExample();
		obj.hello("hello");
		

	}

}
