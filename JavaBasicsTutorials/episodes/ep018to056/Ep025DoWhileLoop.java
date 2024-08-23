package ep018to056;

import java.util.Scanner;

public class Ep025DoWhileLoop {

	public static void main(String[] args) {
		
		/*	ICU
		 * 
		 * 	initialization
		 *	condition or comparison
		 *	update
		 */
		
		Scanner scanner = new Scanner(System.in);
		String password = "let me in";
		String guess;
		
		do //do while with always do the code inside at least one, and then will repeat as long as the while condition is met
		{
			System.out.println("What is the password?");
			guess = scanner.nextLine();
		} while(!guess.equals(password));
		
		System.out.println("Ok, you may come in.");
		scanner.close();
	}
	
}
