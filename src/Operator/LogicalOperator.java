package Operator;

public class LogicalOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int age =38;
		if(age>18 && age<=40)
		{
			System.out.println("Adult");
		}
		if(age>40 || (age<=80 && age>40))
		{
			System.out.print("old");
		}
		if(age!=0 && age<19)
		{
			System.out.println("young");
		}
		if(age>80)
		{
			System.out.print(" or died");
		}

	}

}
