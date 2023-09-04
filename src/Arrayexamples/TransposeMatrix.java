package Arrayexamples;

import java.util.Scanner;

/**
 * @param args
 */

class Trans {

	static void transpose(int a[][], int c[][]) {
		int i, j;

		for (i = 0; i <TransposeMatrix .n; i++) {
			for (j = 0; j <TransposeMatrix.m; j++) {
				c[i][j] = a[j][i];
			}
		}
	}
}

	public class TransposeMatrix {

		public static final int m = 3;
		public static final int n = 2;
		

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			int a[][] = new int[m][n];
			int c[][] = new int[n][m];
			

			System.out.println("Enter array elements");
			
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
				}
			}
            Trans t = new Trans();
			t.transpose(a, c);

			System.out.println(" transpose matrix is:");

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++)

				{
					System.out.print(c[i][j] + " ");
				}

				System.out.println();
			}
		}
	}
