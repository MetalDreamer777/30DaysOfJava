package ep018to056;

public class Ep042IterateThrough2DStructureWithForLoop {
	public static void main(String[] args) {
		int[][] grades = {
				{1, 5, 3},
				{8, 4, 2, 3, 8, 7},
				{4, 6, 2},
				{},
				{5},
		};
		
		//System.out.println(grades.length);
		//System.out.println(grades[1].length);
		
		for (int row = 0; row < grades.length; row++) {
			for (int col = 0; col < grades[row].length; col++) {
				System.out.print(grades[row][col] + " ");
			}
			System.out.println();
		}
	}
}