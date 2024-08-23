package ep018to056;

public class Ep037SearchAnArrayWithForLoop {
	public static void main(String[] args) {
		int[] grades = {1, 2, 72, 4, 5};
		boolean found = false;
		int index = 0;
		
		for (int i = 0; i < grades.length; i++) {
			System.out.print(i + " : ");
			System.out.print(grades.length + " : ");
			System.out.println(grades[i]);
			if (grades[i] == 72) {
				found = true;
				index = i;
			}
			
		}
		if (found == false) System.out.println("Not found.");
		else System.out.println("FOUND!!! Found at index " + index);
	}
}

// lookup Arrays.binarysearch