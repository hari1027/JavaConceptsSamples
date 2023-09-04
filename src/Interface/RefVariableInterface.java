package Interface;

interface Home
{
	void home() ;

}
class Family implements Home
{
	public void home()
	{
		System.out.println("We are a family of four");
	}
}
public class RefVariableInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Home h ; // ref variable
		Family f = new Family();
		h=f;
		h.home(); // calling by reference variable 

	}
}


