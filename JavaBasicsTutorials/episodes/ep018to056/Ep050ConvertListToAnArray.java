package ep018to056;

import java.util.Arrays;
import java.util.List;

import projects.InputTypeTest;
import projects.ListToArray;

public class Ep050ConvertListToAnArray {
	public static void main(String[] args) {
		List<Integer> me = Arrays.asList(5, 2, 4, 6, 7, 8);
		int[] ye = new int[me.size()];
		
		for (int i = 0; i < me.size(); i++) ye[i] = me.get(i);
		
		System.out.println("List:  " + me);
		System.out.println("Array: " + Arrays.toString(ye));
		
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		//I did a little side project in this lesson! :D
		
		System.out.println();System.out.println("Some more of my custom methods:");System.out.println();
		
		int[] we = ListToArray.integer(me); //using a custom class and method
		System.out.println("Primitive Array: " + Arrays.toString(we));
		
		//testing more of my custom methods!
		Integer[] wow = ListToArray.Integer(me);
		System.out.println("Object Array:    " + Arrays.toString(wow));
		
		System.out.println();
		
		List<String> hmm = Arrays.asList("Eat", "Your", "Beans");
		System.out.println("List:  " + hmm);
		String[] woah = ListToArray.String(hmm);
		System.out.println("Array: " + Arrays.toString(woah));
		
		System.out.println();
		
		List<Boolean> BOOL = Arrays.asList(true, false, true, false, false);
		System.out.println("List:            " + BOOL);
		Boolean[] Bool = ListToArray.Boolean(BOOL);
		System.out.println("Object Array:    " + Arrays.toString(Bool));
		boolean[] bool = ListToArray.bool(BOOL);
		System.out.println("Primitive Array: " + Arrays.toString(bool));
		
		System.out.println();
		
		//Extra little thing testing a method that tests if a string can be converted to an integer or not.
		String bean = "21";
		System.out.println(InputTypeTest.isInteger(bean));
		
	}
}
