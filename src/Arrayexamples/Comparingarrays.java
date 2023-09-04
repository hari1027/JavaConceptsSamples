package Arrayexamples;


public class Comparingarrays {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x[] =  {1,2,3};
		int y[] =  {1,2,3};
		int temp=0;
		if(x.length != y.length)
		{
			System.out.println("both arrays are not equal");
			return ;
		}
	     else
		{
		  for (int i=0;i<x.length;i++)
		  {
			  if (x[i] != y[i])
			  {
				temp =+ 1;
			  }
		   }
		}
		if(temp==0)
		{
			System.out.println("both arrays are equal");
		}
		else
		{
			System.out.println("both arrays are not equal");
		}

	}

}
