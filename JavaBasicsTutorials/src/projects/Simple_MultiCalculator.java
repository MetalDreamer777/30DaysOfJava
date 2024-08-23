package projects;

import java.util.Scanner;

public class Simple_MultiCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a;
		double b;
		System.out.println("Enter first number to be calculated:");
		a = scanner.nextDouble();
		System.out.println("Enter second number to be calculated:");
		b = scanner.nextDouble();
		scanner.close();
		System.out.println("+ " + (a + b));
		System.out.println("- " + (a - b));
		System.out.println("* " + (a * b));
		System.out.println("/ " + (a / b));
	}
}
