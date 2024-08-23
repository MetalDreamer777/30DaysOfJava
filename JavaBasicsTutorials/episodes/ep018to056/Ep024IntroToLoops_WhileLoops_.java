package ep018to056;

import java.util.Scanner;

public class Ep024IntroToLoops_WhileLoops_ {
	
	public static void main(String[] args) {
		
		/*	ICU
		 * 
		 * 	initialization
		 *	condition or comparison
		 *	update
		 */
		
		Scanner scanner = new Scanner(System.in);
		String password = "let me in";
		System.out.println("What is the password?");
		String guess = scanner.nextLine();
		
		while(!guess.equals(password))  //while loops will only run if the condition is met
		{
			System.out.println("What is the password?");
			guess = scanner.nextLine();
		}
		
		System.out.println("Congrats!");
		
		int i = 0;
		while(i <= 10)
		{
			System.out.println("Iteration " + i);
			i++;
		}
		
		scanner.close();
	}
}
