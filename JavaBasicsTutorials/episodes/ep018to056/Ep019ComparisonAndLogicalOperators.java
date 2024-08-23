package ep018to056;

import java.util.Scanner;

public class Ep019ComparisonAndLogicalOperators {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("HOW OLD ARE YA, TWERP!!!?");
		int age = Integer.parseInt(scanner.nextLine());
		
		if(age > 21)
		{
			System.out.println("Oh, oh ok, sorry about that sir. Heh... alright");
		}
		
		System.out.println("Cats or Dogs?");
		String animal = scanner.nextLine().toLowerCase();
		
		System.out.println(age);
		System.out.println(animal);
		
		/*	Comparison Operators: (boolean)
		 *	==	equality (equal to)
		 *	!=	inequality (not equal to)
		 *	<	less than
		 *	>	greater than
		 *	<=	less than or equal to
		 *	>=	greater than or equal to
		 */
		
		/*	Logical Operators
		 *	&&	And (both must be true)
		 *	||	Or  (one more must be true)
		 *	!	Not (inverse the boolean)
		 *	^	Xor (only one can be true)
		 */
		
		if(age > 12 && animal.equals("dogs"))
		{
			System.out.println("Alright, you pass. Welcome into the dog club!");
		}
		if (age > 12 || animal.equals("dogs"))
		{
			System.out.println("If you wanna pet some " + animal + ", there's some in the corrner over here.");
		}
		if (age > 12 && !animal.equals("cats") && !animal.equals("dogs"))
		{
			System.out.println("Ummmmmm... I asked cats or dogs... not " + animal + " ya dumbby!");
		}
		if(age < 13 && !animal.equals("cats") && !animal.equals("dogs"))
		{
			System.out.println("Awww, sorry kiddo, we don't have any " + animal + " here... Now SCRAM!!!");
		}
		if((age > 12 && animal.equals("cats")) || (age < 13 && animal.equals("dogs"))) //xor
		{
			System.out.println("Well that was weird.");
		}
		if(age > 12 ^ animal.equals("cats"))  //xor
		{
			System.out.println("Bye.");
		}
		scanner.close();
	}
}
