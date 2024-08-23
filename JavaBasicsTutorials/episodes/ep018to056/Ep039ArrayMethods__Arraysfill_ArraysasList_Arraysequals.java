package ep018to056;

import java.util.Arrays;
import java.util.List;

public class Ep039ArrayMethods__Arraysfill_ArraysasList_Arraysequals {
	public static void main(String[] args) {
		
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//Arrays.equals
//*
		
		int[] grades1 = {1, 2, 3, 72, 5};
		int[] grades2 = {1, 2, 3, 72, 5};
		
		int[] x = grades1;
		int[] y = grades2;
		
		System.out.print("Test 1: ");
		if (grades1 == grades2) System.out.println("Equal");
		else System.out.println("Not Equal");
		
		//Test 1
		System.out.print("Test 2: ");
		if (grades1.equals(grades2)) System.out.println("Equal");
		else System.out.println("Not Equal");
		
		//Note
		System.out.print("In above tests, it is actually comparing the array pointers: ");
		System.out.println(grades1 + " " + grades2);
		System.out.println("They can be used to compare if two things are the same object.");
		
		//Test 2
		System.out.print("Test 3: ");
		if (Arrays.equals(grades1, grades2)) System.out.println("Euqal");
		else System.out.println("Not Equal");
		System.out.println("This test is comparing the actual value the arrays hold.");
//*/
		
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//Arrays.fill
/*
		int[] grades1 = {1, 2, 3, 72, 5};
		Arrays.fill(grades1, 72);
		System.out.println(Arrays.toString(grades1));
		
		String[] grades2 = new String[5];
		Arrays.fill(grades2, "");
		System.out.println(Arrays.toString(grades2));
		
//Arrays.aslist		

		List<String> testing = Arrays.asList(grades2);
//*/
		
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	}
}
