package ep018to056;

import java.util.Arrays;

public class Ep041WorkingWith2DArrays {
	public static void main(String[] args) {
		int[][] grades1 = new int[5][5];
		int[][] grades2 = new int[5][];
		int[][] grades3 = {
				{1, 5, 3},
				{8, 4, 2},
				{4, 6, 2}
		};
		int[][] grades4 = {
				{1, 5, 3},
				{8, 4, 2, 3, 8, 7},
				{4, 6, 2}
		};
		
		System.out.println(grades3[1][1]);
		System.out.println(Arrays.deepToString(grades3));
		
		System.out.println(grades4[1][4]);
		System.out.println(Arrays.deepToString(grades4));
	}
}
