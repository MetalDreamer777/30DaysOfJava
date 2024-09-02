package day04_Reading_from_a_File_Collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args) throws FileNotFoundException {
		//arrays();
		//readFromFile();
		//collectInArrayList();
		bestPractice();
		
	}
	
	private static void arrays() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many grades?");
		
		int size = in.nextInt();
		int[] grades = new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.println("Input grade " + (i+1) + ":");
			grades[i] = in.nextInt();
		}
		
		System.out.println(Arrays.toString(grades));
		in.close();
	}
	
	private static void readFromFile() throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("students.txt"));
		
		while(in.hasNextLine()) {
			System.out.println(in.nextLine());
		}
		
		in.close();	
	}
	
	public static void collectInArrayList() throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("students.txt"));
		
		List<String> students = new ArrayList<String>();
		
		while(in.hasNextLine()) {
			students.add(in.nextLine());
		}
		
		System.out.println(students);
		
		for (int i = 0; i < students.size(); i++) {
			System.out.println("Name: " + students.get(i));
		}
		
		in.close();	
	}
	
	public static void bestPractice() {
		
		try {
			
			Scanner in = new Scanner(new File("students.txt"));
			List<String> students = new ArrayList<String>();
			
			while(in.hasNextLine()) {
				students.add(in.nextLine());
			}
			System.out.println(students);
			
			for (int i = 0; i < students.size(); i++) {
				System.out.println("Name: " + students.get(i));
			}
			
			in.close();	
			
		} catch (FileNotFoundException e) {
			
			System.out.println("File Not Found\n" + e);
			e.printStackTrace();
			
		}
		
	}
}
