package ep018to056;

import java.util.Scanner;

public class Ep020If_ElseIf_Else {
	public static void main(String[] args) {
		String password = "let me in";
		System.out.println("What is the password:");
		
		Scanner scanner = new Scanner(System.in);
		String guess = scanner.nextLine();
		
		System.out.println(password.equals(guess));
		
		if(password.toLowerCase().equals(guess.toLowerCase()))
		{
			System.out.println("Correct!");
		} 
		else if("Welcome To The Black Parade".toLowerCase().equals(guess.toLowerCase()))
		{
			System.out.println("You found the easter egg!");
		} else
		{
			System.out.println("WRONG!!!");
		}
		
		System.out.println("This is always gonna run, yo.");
		
		if(password.equals(guess))
		{
			System.out.println("There is a line of code ending the method after this line!");
		}
		System.out.println("This is NOT always gonna run... *sobs*.");
		
		scanner.close();
	}
}
