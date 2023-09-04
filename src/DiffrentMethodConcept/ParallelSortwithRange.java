package DiffrentMethodConcept;

import java.util.Arrays;

public class ParallelSortwithRange {

	public static void main(String[] args) {
		int n[]={12,80,56,89,45,67,67,94,82};
		Arrays.parallelSort(n,2,6);//sorting will be done for range 2 to (6-1) only.
		Arrays.stream(n).forEach(m->System.out.println(m+""));
//		for(int j:n)
//		{
//			System.out.println(j);
//		}

	}

}
