package Returntype;

class bussinesss
{
	public static void  cal (float tax , int bill)
	{
		float tax1 = (float) 50.50;
		tax1=tax1+tax;
		System.out.println("the tax amnt is :"+ tax1);
		
		int bill1 =  200;
		bill1=bill1+bill;
		System.out.println("the bill amnt is :"+ bill1);
		
	}
}

public class Parameter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		bussinesss obj = new bussinesss();
		obj.cal(100, 500);

	}

}
