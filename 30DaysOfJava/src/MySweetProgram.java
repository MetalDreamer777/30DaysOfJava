import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args) {
		boolean run = true;
		while (run == true) {
			Scanner in = new Scanner(System.in);
			System.out.println(
					  "Enter a number to choose a method\n"
					+ "1 : arrays2D");
			String method = in.nextLine();
			switch (method) {
			default:
				System.out.println("Not a Method");
				break;
			case "1":
				arrays2D();
				run = false;
				break;
			}
			in.close();
		}
	}
	
	public static void arrays2D() {
		int[][] data = {
				{4, 60, 7, 82},
				{4, 6, 420, 8, 5, 8, 3, 9},
				{5, 42, 7, 64}
		};
		
		System.out.println(data[1][2]);
		data[1][2] = 69;
		
		for(int i = 0; i < data.length; i++) {
			for(int k = 0; k < data[i].length; k++) {
				System.out.print(data[i][k] + " ");
			}
			System.out.println();
		}
	}
}


