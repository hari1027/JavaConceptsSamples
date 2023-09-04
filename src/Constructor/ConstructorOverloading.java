package Constructor;

class Num
{
	int l,b;
	int m ,n , o;
	
	Num()
	{
		l=0;
		b=0;
		System.out.println("l is:" +l);
		System.out.println("b is :" +b);
	}
	
	int Num(int l1,int b1)
	{
		l=l1;
		b=b1;
		return l+b;
	}
	
	int Num(int m1,int n1,int o1)
	{
		m=m1;
		n=n1;
		o=o1;
		return (m+n+o);
	}
}
public class ConstructorOverloading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Num obj = new Num();
		System.out.println(obj.Num(10,15));
		System.out.println(obj.Num(20,25,30));
	

	}

}
