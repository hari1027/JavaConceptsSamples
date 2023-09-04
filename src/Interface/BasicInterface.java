package Interface;

interface bank
{
	public void banks() ;
}

class Sbi implements bank
{
	 public void banks()// function
	{
		System.out.println("I transfered Rs 500 to sbi bank");
	}
}

class Indian
{
       Indian() // constructor
	{
		System.out.println("I transfered Rs 1000 to indian bank");
	}
}

public class BasicInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sbi obj1 = new Sbi();
		Indian obj2 = new Indian();
		obj1.banks();
		

	}

}
