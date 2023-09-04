package Constructor;

class Area
{
	int r;
	Area()
	{
		r=14;
	}
	
	public double area ()
	{
		double area= (3.14*r*r);
		return area;
	}
}

public class DefaultConstructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Area obj = new Area();
		System.out.println("area is :" + obj.area());

	}

}
