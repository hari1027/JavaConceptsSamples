package Constructor;

class Rec
{
	double l;
	double b;
	double h;
	Rec(double L ,double B ,double H)
	{
		l=L;
		b=B;
		h=H;
	}
	public double volume()
	{
		double volume = l*b*h;
		return volume;
	}
}
public class ParameteriazedConstructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rec obj = new Rec(10.5 ,20.5,15);
		System.out.println("the volume is :" + obj.volume());
		

	}

}
