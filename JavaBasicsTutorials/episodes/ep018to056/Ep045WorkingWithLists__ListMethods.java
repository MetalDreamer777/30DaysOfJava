package ep018to056;

import java.util.ArrayList;
import java.util.List;

public class Ep045WorkingWithLists__ListMethods {
	public static void main(String[] args) {
		List<Integer> grades = new ArrayList<Integer>();
		//*
		grades.add(5);
		grades.add(10);
		grades.add(1, 7);
		//*/
		System.out.println(grades);
		if (!grades.isEmpty()) //we put this in an if statement because it will throw an error if it tries to get a value that isn't there.
		{
			System.out.println(grades.get(0));
			System.out.println(grades.get(1));
			System.out.println(grades.get(2));
		}

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println(grades.indexOf(7));
		System.out.println(grades.indexOf(70));
		System.out.println(grades.contains(7));
		System.out.println(grades.contains(70));
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		while (!grades.isEmpty())
		{
			System.out.println(grades.remove(0));
		}
		
		grades.add(5);
		grades.add(10);
		grades.add(1, 7);
		
		grades.clear();
		
		System.out.println(grades);
		
		
	}
}