package ep018to056;

import java.util.Arrays;

public class Ep035ArraystoStringandArraysdeepToString {
	public static void main(String[] args) {
		int[] grades = {10, 5, 3, 7, 8, 3, 4, 2, 9, 10};
		int[][] grades2 = {{10, 5, 3}, {7, 8, 3}, {4, 2, 9, 10}};
		System.out.println(grades);
		System.out.println(Arrays.toString(grades));
		System.out.println(Arrays.toString(grades2));
		System.out.println(Arrays.deepToString(grades2));
	}
}
