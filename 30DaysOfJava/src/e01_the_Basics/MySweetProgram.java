package e01_the_Basics;

import java.util.Scanner;

// https://youtu.be/4fwRDzFjOvs?si=nRl9SZZsOyVgvAK5
public class MySweetProgram {

	public static void main(String[] args) {
		basics1();
		basics2();
	}
	
	public static void basics1() {
		System.out.println("Hello World");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String t = "hey";
		String tt = new String("hey"); //invoking the constructor
		
		System.out.println(s);
	}
	//Class -instantiation-> Object
	//      -instantiation-> Object
	
	public static void basics2() {
		System.out.println("Hello World");
		
		//Scanner in = new Scanner(System.in);
		//String s = in.nextLine();
		
		int x = 5; // declared and initialized
		int y; // declared
		y = 5; // initialized
		
		System.out.println(x + y);
		
		char tbtbj = 't'; //can only hold 1 character
		
		double d = 3.14;
		float f = 3.14f; //float always ends with f or else it will think it's a double and not work
		
		System.out.println(tbtbj);
	}
}