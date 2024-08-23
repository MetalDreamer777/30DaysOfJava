package ep018to056;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ep046QuicklyInitializeAListWithElementsAndHowToPrintList {
	public static void main(String[] args) {
		int[] gradeeess = {1, 4, 3, 3};
		List<Integer> grades = Arrays.asList(5, 3, 2, 6, 3);
		
		System.out.println(Arrays.toString(grades.toArray()));
		System.out.println(grades);
		
	}
}
