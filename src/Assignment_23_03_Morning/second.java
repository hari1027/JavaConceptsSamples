package Assignment_23_03_Morning;
import java.util.*;

abstract class Compartment
{
	public abstract Object notice();
}

class Firstclass extends Compartment
{
	public Object notice()
	{
	 String st1 = "This is firstclass";
	 return st1;
	}
}

class Ladies extends Compartment
{
	public Object notice()
	{
		String st2 ="This is ladiesclass";
		return st2;
	}
}

class General extends Compartment
{
	public Object notice()
	{
		String st3 ="This is Generalclass";
		return st3;
	}
}

class Luggage extends Compartment
{
	public Object notice()
	{
		String st4 ="This is Luggageclass";
		return st4;
	}
}

public class second {

	public static void main(String[] args) {
		
		Firstclass obj1 = new Firstclass();
		Ladies obj2 = new Ladies();
		General obj3 = new General();
		Luggage obj4 = new Luggage();
		
		
		Object  Compartment[] = new Object[10];
		Compartment[0] = obj1.notice() ;
		Compartment[1] = obj1.notice() ;
		Compartment[2] = obj2.notice() ;
		Compartment[3] = obj2.notice() ;
		Compartment[4] = obj2.notice() ;
		Compartment[5] = obj3.notice() ;
		Compartment[6] = obj3.notice() ;
		Compartment[7] = obj3.notice() ;
		Compartment[8] = obj4.notice() ;
		Compartment[9] = obj4.notice() ;
		
		for(int i=0; i<10 ;i++)
		{
			System.out.println(" Compartment " + i +" - "+ Compartment[i]);
		}
		
		

	}

}
