package DiffrentMethodConcept;
interface B
{
	static void add(int a,int b)
	{
		System.out.println("the sum is :" + (a+b));
	}
	
}
public class StaticMethods implements B {

	public static void main(String[] args) {
		B.add(10,23);
		StaticMethods obj = new StaticMethods();
//		obj.add(10,23);// we cannot access static function with other objects
		

	}

}
