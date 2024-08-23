package ep018to056;

import java.util.Arrays;
import java.util.List;

public class Ep048ForEachLoopInJava {
	public static void main(String[] args) {
		List<Integer> grades = Arrays.asList(5, 3, 2, 6, 3);
		
		for (int i = 0; i < grades.size(); i++) {
			System.out.print(grades.get(i) + " ");
		}
		
		System.out.println();
		System.out.println("~~~~~~~~~");
		
		for (int grade : grades) {
			System.out.print(grade + " ");
		}
	}
}
