package AbstractClass;

abstract class Dress
{
	abstract void dress();
	
}

class Men extends Dress
{
	void dress()
	{
		System.out.println("shirt");
	}
}

public class AbstractclassWithReferenceVariable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dress ref;
		Men obj = new Men();
		ref=obj;
		ref.dress();
		

	}

}
