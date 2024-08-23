package ep018to056;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ep051SortAndReverseAListWith__CollectionsSort_and_CollectionsReverse {
	public static void main(String[] args) {
		List<Integer> allGrades = Arrays.asList(5, 3, 2, 6, 3);
		
		Collections.sort(allGrades);
		System.out.println(allGrades);
		for (int grade : allGrades) System.out.print(grade + " ");
		
		System.out.println();
		
		Collections.reverse(allGrades);
		System.out.println(allGrades);
		for (int grade : allGrades) System.out.print(grade + " ");
	}
}
