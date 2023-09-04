package DiffrentMethodConcept;

import java.util.Arrays;
import java.util.List;

public class forEachLoopExample {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(12,13,14,15,16);
		
		System.out.println("applying for loop");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("applying for each loop");
		for(int j:list)
		{
			System.out.println(j);
		}
		
		System.out.println("applying for each method");
		{
			list.forEach(n-> System.out.println(n));
		}
		

	}

}
