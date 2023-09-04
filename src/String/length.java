package String;

import java.util.StringJoiner;

public class length {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringJoiner sb = new StringJoiner("-");
		sb.add("welcome to java");
		sb.add("Hello");
		System.out.println(sb.length());

	}

}
