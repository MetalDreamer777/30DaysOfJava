package ep018to056;

public class Ep034WorkingWithArrays {
	public static void main(String[] args) {
		
		/*
		int[] grades; //you can declare it by itself just like int x;
		int[] grades = new int[10]; //standard way to do it
		int grades[] = new int[10]; //you can do this too, more similar to how it would look in c.
		//*/
		
		/*
		int[] grades = new int[10];
		grades[0] = 10;
		System.out.println(grades[0]);
		//*/
		
		int[] grades = {10, 5, 3, 7, 8, 3, 4, 2, 9, 10}; //shorthand way of doing it
		grades[1] = 900;
		System.out.println(grades[0]);
		System.out.println(grades[1]);
		int[] input = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		grades = input;
		System.out.println(grades[2]);
	}
}
