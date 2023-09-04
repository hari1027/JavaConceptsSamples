package Operator;

public class Inc_Dec_operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x=4 ; 
		System.out.println("preincrement is" + (++x + ++x));
		System.out.println("postincrement is" + (x++ + x++) );
		System.out.println("predecrement is" + (--x - x--) );
		System.out.println("postdecrement is" +(x-- - x--) );

	}

}
