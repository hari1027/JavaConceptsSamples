package String;

public class Substring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer  sb = new StringBuffer ("welcome to java");
		System.out.println(sb.substring(5));//will print from (5th)characters including space
		System.out.println(sb.substring(0,5));// 0 - (5-1)

	}

}
