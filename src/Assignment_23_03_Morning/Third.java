package Assignment_23_03_Morning;

abstract class Instrument
{
	public abstract Object play();
}

class piano extends Instrument
{
	public Object play()
	{
		String st1 = ("tan tan tan tan");
		return st1;
		
	}
}


class flute extends Instrument
{
	public Object play()
	{
		String st2 = ("toot toot toot toot");
		return st2 ;
	}
}

class guitar extends Instrument
{
	public Object play()
	{
		String st3 = ("tin tin tin");
		return st3;
	}
}
public class Third {

	public static void main(String[] args) {
		
		piano obj1 = new piano();
		flute obj2 = new flute();
		guitar obj3 = new guitar();
		
		Object Instrument[] = new Object[10];
		
		Instrument[2] = (obj1 instanceof piano);
		Instrument[5] = (obj2 instanceof flute);
		Instrument[7] = (obj3 instanceof guitar);
		
		for(int i=0;i<9;i++)
		{
			System.out.println(Instrument[i]);
		}
		
		System.out.println();
		
		Instrument[2] = obj1.play();
		Instrument[5] = obj2.play();
		Instrument[7] = obj3.play();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Instrument sound is " + Instrument[i]);
		}
		
		
		
		
		

	}

}
