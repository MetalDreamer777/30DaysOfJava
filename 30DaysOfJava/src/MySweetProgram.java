import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args) {
		boolean run = true;
		while (run == true) {
			Scanner in = new Scanner(System.in);
			System.out.println(
					  "Enter a number to choose a method\n"
					+ "1 : iteraton\n"
					+ "2 : insertAndIteratingWithForLoop\n"
					+ "3 : listIterator");
			String method = in.nextLine();
			switch (method) {
			default:
				System.out.println("Not a Method");
				break;
			case "1":
				iterator();
				run = false;
				break;
			case "2":
				insertAndIteratingWithForLoop();
				run = false;
				break;
			case "3":
				listIterator();
				run = false;
				break;
			}
			in.close();
		}
	}
	
	public static void iterator() {
		LinkedList<String> names = new LinkedList<String>();
		names.push("Josiah");
		names.push("Caleb"); 
		names.push("Sue");

		Iterator<String> it = names.iterator();
/*/
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
//		System.out.println(it.next()); // will throw an exception
		
		if(it.hasNext()) {
			System.out.println(it.next());
		}
/*/		
		// better way to do all that ^^
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//*/
	}
	
	public static void insertAndIteratingWithForLoop() {
		LinkedList<String> names = new LinkedList<String>();
		names.push("Josiah");
		names.push("Caleb"); 
		names.push("Sue");

		names.add(2, "Susan");
		
		for(String s : names) {
			System.out.println(s);
		}
	}
	
	public static void listIterator() {
		LinkedList<String> names = new LinkedList<String>();
		names.push("Josiah");
		names.push("Caleb"); 
		names.push("Sue");
		
		ListIterator<String> it = names.listIterator();
		it.next();
		it.next();
		it.add("Susan");
		
		for(String s : names) {
			System.out.println(s);
		}
	}
}


