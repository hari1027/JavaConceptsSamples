package ExceptionHandling;

public class ArrayIndexOutofBoundException {

	public static void main(String[] args) {
		int a[] = {1,4,8};
		int n1 =10;
		
		try
		{
			System.out.println(n1/a[9]);
		}
		
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("array index out of bound " + ae);
		}
		
		finally
		{
			System.out.println("thank you");
		}

	}

}
