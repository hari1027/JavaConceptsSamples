package DiffrentMethodConcept;

import java.util.Arrays;

public class ParallelSortingExample {

	public static void main(String[] args) {
		int n[] = {12,92,56,83,14,75,100,62,82,71,62,56};
		Arrays.parallelSort(n);//sorting can only be done not printing.so convert to stream.
		Arrays.stream(n).forEach(m->System.out.println(m));
    
	}

}
