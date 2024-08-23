package day02_Basics_Part_2__Git_fail__Control_Flow;

import java.util.Scanner;

public class MySweetProgram {
	public static void main(String[] args) {
		System.out.println("What's ya name?");
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		// Control flow statement examples
		
		if (s.equals("Caleb")) {				// if it's just an if statement, then it can happen or it may not
			System.out.println("Welcome " + s); //if you add an else statement, then one of the two will happen
		} else if (s.equals("Sally")) {			//if you add an else if statement, just one of the options will happen
			System.out.println("Welcome " + s);
		} else if (s.equals("Josiah")) {
			System.out.println("Welcome " + s);
		} else {
			System.out.println("YOU ARE NOT WELCOME HERE!!! OOOOUUUUUUTTTTUHHH!!!!!!!!!!!!");
		}
		
		if (s.equals("Caleb")) {
			System.out.println("Welcome " + s);
		} else if (s.equals("Sally")) {
			System.out.println("Welcome " + s);
		}
		
		int i = 0; // initialization
		while (i < 10) { // condition
			System.out.println("i is: " + i);
			i++; // updated
		} 	
		
		for (int e = 0; e < 10; e++) {
			System.out.println("i is: " + e);
		}
		
		int o = 0;
		do { // this will always run at least once
			System.out.println("i is: " + o);
			o++;
		} while (o < 10);
		
		in.close(); // this gets rid of the scanner after we are done with it so that it deosn't take up memory that it doesn't need to
	}
}
