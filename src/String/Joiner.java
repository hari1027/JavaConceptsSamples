package String;

import java.util.StringJoiner;

public class Joiner {

	public static void main(String[] args) {
		StringJoiner s = new StringJoiner("-");
		StringJoiner m = new StringJoiner(";");
		s.add("apple");
		s.add("mango");
		s.add("banana");
		System.out.println(s);
		
		m.add("sun");
		m.add("moon");
		m.add("star");
		System.out.println(m);

	}

}
