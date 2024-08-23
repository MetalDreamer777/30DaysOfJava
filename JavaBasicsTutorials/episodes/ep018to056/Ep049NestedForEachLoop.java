package ep018to056;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ep049NestedForEachLoop {
	public static void main(String[] args) {
		
		List<List<Integer>> allGrades = new ArrayList<List<Integer>>();
		allGrades.add(Arrays.asList(3, 5, 2, 7, 8));
		allGrades.add(Arrays.asList(5, 1, 9, 10, 40));
		allGrades.add(Arrays.asList(42, 6, 8, 4, 13));
		
		for (List<Integer> grades : allGrades) {
			for (int grade : grades) {
				System.out.print(grade + " ");
			}
			System.out.println();
		}
	}
}
