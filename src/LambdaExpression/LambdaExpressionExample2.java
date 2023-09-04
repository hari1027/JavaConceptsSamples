package LambdaExpression;
import java.util.*;

public class LambdaExpressionExample2 {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put(1,"hari");
		m.put(2,"war");

		System.out.println(m);
		m.forEach((k,v) -> System.out.println("rollno: " + k + " name:" + v));

	}

}
