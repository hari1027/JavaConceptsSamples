package LambdaExpression;

import java.util.*;

public class LambdaExpressionExample1{

	public static void main(String[] args) {
		List <String> name = new ArrayList <String>();
		name.add("google");
		name.add("tcs");
		name.add("zoho");
		Iterator <String>itr = name.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		name.forEach(n-> System.out.println(n));

	}

}
