package ep018to056;

import java.util.Scanner;

public class Ep021SwitchStatement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String name = scanner.nextLine();
		
		switch (name)
		{
			default: //this case the executes if none of the other cases are met
				System.out.println("Hmm, your not on the list, so I can't let you in. Have a nice day though!");
				break; //if there is no break statement, the code for each case after will execute until it does reach a break statement
			case "Sam":
			case "Nealy":
				System.out.println("Welcome in my dude!");
				break;
			case "Harvard":
			case "Rjinder":
				System.out.println("GO AWAY YOU MONSTER!!!");
				break;
		}
		
		if (name.equals("Sam") || name.equals("Nealy"))
		{
			System.out.println("Welcome in my dude!");
		} else if(name.equals("Rjinder") )
		{
			System.out.println("GO AWAY YOU MOSTER!!!");
		} else
		{
			System.out.println("Hmm, your not on the list, so I can't let you in. Have a nice day though!");
		}
		scanner.close();
	}
	
}
