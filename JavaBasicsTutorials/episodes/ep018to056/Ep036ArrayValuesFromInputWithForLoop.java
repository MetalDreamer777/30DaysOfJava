package ep018to056;

import java.util.Arrays;
import java.util.Scanner;

public class Ep036ArrayValuesFromInputWithForLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] grades = new int[size];
		
		System.out.println(Arrays.toString(grades));
		
		for(int i = 0; i < size; i++) {
			grades[i] = 5;
		}
		System.out.println(Arrays.toString(grades));
		
		for(int i = 0; i < size; i++) {
			int x = input.nextInt();
			grades[i] = x;
		}
		
		System.out.println(Arrays.toString(grades));
		
		for(int i = 0; i < size; i++) {
			System.out.print(grades[i] + " ");
		}
		System.out.println();
		
		System.out.print("[");
		for(int i = 0; i < size; i++) {
			if(i < (size - 1)) System.out.print(grades[i] + ", ");
			if(i == (size - 1)) System.out.println(grades[i] + "]");
		}
		
		for(int i = 0; i < size; i++) {
			if(i == 0 & !(i == (size - 1))) System.out.print("[" + grades[i] + ", ");
			if(i < (size - 1) & i != 0) System.out.print(grades[i] + ", ");
			if(i == (size - 1) & !(i == 0)) System.out.println(grades[i] + "]");
			if(i == 0 & i == (size - 1)) System.out.println("[" + grades[i] + "]");
		}
		input.close();
	}
}
