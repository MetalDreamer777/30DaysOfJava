import java.util.LinkedList;
import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args) {
		boolean run = true;
		while (run == true) {
			Scanner in = new Scanner(System.in);
			System.out.println(
					  "Enter a number to choose a method\n"
					+ "1 : stack");
			String method = in.nextLine();
			switch (method) {
			default:
				System.out.println("Not a Method");
				break;
			case "1":
				stack();
				run = false;
				break;
			}
			in.close();
		}
	}
	
	public static void stack() {
		LinkedList<String> names = new LinkedList<String>();
		names.push("Josiah");
		names.push("Caleb"); //push and addFirst are the same thing
		names.addFirst("Sue");
		
		System.out.println(names.pop()); //pop and removeFirst are identical
		System.out.println(names.removeFirst());
		System.out.println(names.remove()); //remove can take an index argument but defaults to 0 if left blank, can input an object to remove that object. these different ways of doing it are called overloads
	}
}


