package projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListRotator {
	public static void main(String[] args) {
		//Setup
		List<String> rotateMe = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		boolean run = true;
		//Build List
		do {
			//Set default size for list to empty.
			int size = 0;
			//Get List Size
			System.out.println("Choose your list size:");
			String sizeIn = input.nextLine();
			//Set size only if input for size is compatible for conversion to integer, otherwise the list stays empty.
			if (sizeIn.matches("[0-9]+")) size = Integer.parseInt(sizeIn);
			//Get inputs for list until list is correct size.
			for (int i = 0; i < size; i++) {
				System.out.println("Enter slot " + (i + 1) + ":");
				rotateMe.add(input.nextLine());
			}
			//Tell user if list creation was valid or not.
			if (rotateMe.size() == 0) System.out.println("Dude! I can't rotate that, you brick head!");
			else System.out.println("Your list is: " + rotateMe);
		} while (rotateMe.isEmpty() == true); //Only allows valid list to pass to rotator code. Tries again if invalid.
		//Give user instructions for rotator.
		System.out.println("Enter 'A' to rotate Left, 'D' to rotate right, or 'W' to finalize list:");
		//Rotator
		do {
			//Get Input
			String rotatorInput = input.nextLine().toUpperCase();
			//Respond To Input
			switch (rotatorInput) {
			//Catch Bad Input
			default: 
				System.out.println("Invalid input.");
				break;
			//Rotate Left	
			case "A": 
				String enda = rotateMe.get(0);
				for (int i = 0; i < rotateMe.size(); i++) {
					if (i < rotateMe.size() - 1) {
						rotateMe.set(i, rotateMe.get(i + 1));
					}
					if (i == rotateMe.size() - 1) {
						rotateMe.set(rotateMe.size() - 1,  enda);
					}
				}
				System.out.println(rotateMe);
				break;
			//Rotate Right	
			case "D": 
				String endb = rotateMe.get(rotateMe.size() - 1);
				for (int i = rotateMe.size() - 1; i > -1; i--) {
					if (i > 0) {
						rotateMe.set(i, rotateMe.get(i - 1));
					}
					if (i == 0) {
						rotateMe.set(0, endb);
					}
				}
				System.out.println(rotateMe);
				break;
			//Finalize List	
			case "W": 
				run = false;
				System.out.println("Your final list is: " + rotateMe);
				break;
			}
		} while (run == true); //Allow list to keep being rotated until list is finalized
		
		//End program or Make another list
		run = true; //prepare run for new loop
		do {
			System.out.println("Start another list? Yes or No:");
			String choice = input.nextLine().toLowerCase();
			
			//Restart or truly end
			switch (choice) {
			default: // Invalid input catch
			System.out.println("Invalid input. Please say 'Yes' or 'No'!");
			break;
			case "yes": //Restart program
				ListRotator.main(args);
				run = false; //end this copy of the loop
				break;
			case "no": //End program
				System.out.println("Ending Program");
				System.out.println("Your Lists are: ");
				run = false;
				break;
			}
		} while (run == true);

		System.out.println(rotateMe);
		input.close(); 
	}
}