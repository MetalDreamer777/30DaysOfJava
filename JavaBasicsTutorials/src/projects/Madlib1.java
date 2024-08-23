package projects;


import java.util.Scanner;

public class Madlib1 {
	
	public static void main(String[] args) {
		System.out.println("Give me a name.");
		
		Scanner scanner1 = new Scanner(System.in);
		String Name1 = scanner1.nextLine();
		
		System.out.println("Give me another name.");
		
		Scanner scanner2 = new Scanner(System.in);
		String Name2 = scanner2.nextLine();
		
		System.out.println("Give me a place.");
		
		Scanner scanner3 = new Scanner(System.in);
		String Place1 = scanner3.nextLine();
		
		System.out.println("Give me an adjective.");
		
		Scanner scanner4 = new Scanner(System.in);
		String Adjective1 = scanner4.nextLine();
		
        System.out.println("Give me a noun.");
		
		Scanner scanner5 = new Scanner(System.in);
		String Noun1 = scanner5.nextLine();
		
        System.out.println("Give me another noun.");
		
		Scanner scanner6 = new Scanner(System.in);
		String Noun2 = scanner6.nextLine();
		
        System.out.println("And give me another noun.");
		
		Scanner scanner7 = new Scanner(System.in);
		String Noun3 = scanner7.nextLine();
		
        System.out.println("Now, give me an animate noun.");
		
		Scanner scanner8 = new Scanner(System.in);
		String AnimateNoun1 = scanner8.nextLine();
		
        System.out.println("Give me a past tense verb.");
		
		Scanner scanner9 = new Scanner(System.in);
		String PastVerb1 = scanner9.nextLine();
		
        System.out.println("Give me a building or structure.");
		
		Scanner scanner10 = new Scanner(System.in);
		String Structure1 = scanner10.nextLine();
		
        System.out.println("Give me an object.");
		
		Scanner scanner11 = new Scanner(System.in);
		String Object1 = scanner11.nextLine();
		
        System.out.println("Give me a tense verb.");
		
		Scanner scanner12 = new Scanner(System.in);
		String Verb2 = scanner12.nextLine();
		
		System.out.println(Name1 + " and " + Name2 + " were walking through the " + Place1 + ". Along their walk, they saw some " + Adjective1 + " things. They saw a " + Noun1 + ", a " + Noun2 + ", and even a " + Noun3 + "!");
		System.out.println("But then, they came across a " + AnimateNoun1 + "!!! Dun-dunn dunn duuuunnnnn! Immediately, they turned around and " + PastVerb1 + " until they came across a " + Structure1 + ".");
		System.out.println("The " + AnimateNoun1 + " chased them all the way there, so they went inside, grabbed a " + Object1 + " and used it to " + Verb2 + " the " + AnimateNoun1 + ".");
		
	}
	

}

// PersonPronoun verb a noun
// (name1) and (name2) were walking through the (place1). Along their walk, they saw some (adjective1) things.They saw a (noun1), a (noun2), and even a (noun3)!
// But then, they came across a (animate noun1). Immediately, they turned around and (past tense verb1) until they came across a (type of building or structure1).
// They when't inside, grabbed a (object1) and used it to (verb2) the (animate noun1).