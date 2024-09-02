// https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MySweetProgram {
	
	
	List<String> stuff; //we can use this list as anything that implements it
	ArrayList<String> stuffs;
	Collection<String> stuf;

	public static void main(String[] args) throws FileNotFoundException {
		boolean run = true;
		while (run == true) {
			Scanner in = new Scanner(System.in);
			System.out.println(
					  "Enter a number to choose a method\n"
					+ "1 : collections\n"
					+ "2 : linkedListQueue\n"
					+ "3 : linkedListStack\n");
			String method = in.nextLine();
			switch (method) {
			default:
				System.out.println("Not a Method");
				break;
			case "1":
				collections();
				run = false;
				break;
			case "2":
				linkedListQueue();
				run = false;
				break;
			case "3":
				linkedListStack();
				run = false;
				break;
			}
			in.close();
		}
		
//		
//		
//		
		
	}
	
	public static void collections() throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("students.txt"));
		
//*
		Collection<String> studentss = new ArrayList<String>(); //collection is an interface that contains sub-interfaces
		List<String> studentsss = new ArrayList<String>(); //list is a sub-interface that contains implementations such as ArrayList
//		Interface<>					  Implementation<>
//*/
		
		ArrayList<String> students = new ArrayList<String>(); //no reason to be general here
		
		System.out.println("Reading from file...");
		
		while(in.hasNextLine()) {
			students.add(in.nextLine());
		}
		
		System.out.println(students);
		
		for (int i = 0; i < students.size(); i++) {
			System.out.println("Name: " + students.get(i));
		}
		in.close();
		
		MySweetProgram p = new MySweetProgram();
		p.stuff = new ArrayList<String>(); //this works because ArrayList implements the List interface
//		p.stuffs = new LinkedList<String>(); //this won't work because LinkedList doesn't implement the ArrayList class, and classes can't be implemented anyways
//		p.stuf = new List<>(); //this wont work because you can only instantiate classes, not interfaces
		p.stuf = new ArrayList<String>();
	}
	
// a stack is first in last out, like doing a stack of dishes
// a queue is first in first out, like standing in line at a roller coaster	
	
	public static void linkedListQueue() {
		LinkedList<String> names = new LinkedList<String>();
		//Pulls from opposite end that stuff is added too
//*/
		//Queuing
		names.addLast("Josiah"); //same as .add
		names.addLast("Caleb");
		names.addLast("Sue");
		names.addLast("Sally");
		
		while (!names.isEmpty()) {
			System.out.println(names.removeFirst()); //same as .remove
		}
//*/
/*
		//you could also do .addFirst and .removeLast
		names.addFirst("Josiah");
		names.addFirst("Caleb");
		names.addFirst("Sue");
		names.addFirst("Sally");
		
		while (!names.isEmpty()) {
			System.out.println(names.removeLast());
		}
//*/
	}
	
	public static void linkedListStack() {
		LinkedList<String> names = new LinkedList<String>();
		//Pulls from same end that stuff is added too
//*
		//Stacking
		names.addFirst("Josiah");
		names.addFirst("Caleb");
		names.addFirst("Sue");
		names.addFirst("Sally");
		
		while (!names.isEmpty()) {
			System.out.println(names.removeFirst());
		}
//*/
/*
		//you could do .addLast and .removeLast
		names.addLast("Josiah");
		names.addLast("Caleb");
		names.addLast("Sue");
		names.addLast("Sally");
		
		while (!names.isEmpty()) {
			System.out.println(names.removeLast());
		}
//*/
	}
}


