package ep018to056;

import java.util.Scanner;

public class Ep018StringComparisonAndInterning {
	
	public static void main(String[] args) {
		String password = "let me in";
		System.out.println("What is the password: ");
		
		Scanner scanner = new Scanner(System.in);
		String guess = scanner.nextLine();
		
		System.out.println(password.equals(guess)); //this is comparing the contents of the string
		
		System.out.println(password == guess); //this is comparing the memory location
		
		System.out.println("Comparing a and b:");
		String a = "hi";
		String b = "hi";
		System.out.println(a == b); //java sees that these two variables are the same and since they are both literals, it has them both point to the same area of memory
		
		System.out.println("Enter the text \"bi\":");
		String aa = scanner.nextLine();
		String bb = "bi";
		System.out.println(aa == bb); //aa's value is being stored in an object, so it's a different place in memory even if the string is the same
		aa= "bi";
		System.out.println(aa == bb);
		
		System.out.println("Compare c and d:");
		String c = new String("hi");
		String d = new String("hi");
		System.out.println(c == d); //we made string objects instead of literals, so Java says that these two are different things
		
		//password == guess; //this is comparing memory locations, it is comparing if they are the same area of memory
		//int x = 5; //x directly stores the value 5, primitives directly store the value
		//String x = new String("This is a string"); //value is storied differently
		//primitives - == works
		//objects - == does not work
		//values of objects are a reference to the object
		
		System.out.println("Compare int primitives:");
		int x = 10;
		int y = 10;
		System.out.println(x == y);
		x = Integer.parseInt(scanner.nextLine());
		System.out.println(x==y);
		
		scanner.close();
	}
}
