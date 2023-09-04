package DiffrentMethodConcept;

import java.util.StringJoiner;

public class MergingTwoObjectsUsingStringJoiner {

	public static void main(String[] args) {
		StringJoiner obj = new StringJoiner(",");
		obj.add("a");
		obj.add("b");
		obj.add("c");
		
		StringJoiner obj1 = new StringJoiner("-","pre","suff");
		obj1.add("d");
		obj1.add("e");
		obj1.add("f");
		
		//using merge()
		StringJoiner obj2 = obj.merge(obj1);
		System.out.println(obj2);

	}

}
