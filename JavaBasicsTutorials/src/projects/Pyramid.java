package projects;

import java.util.Scanner;

public class Pyramid {
	
	public static void main(String[] args) {
		
		System.out.println("How many layers do you want your pyramid?");
		
		Scanner scanner = new Scanner(System.in);
		int b = scanner.nextInt();
		scanner.close();
		
		if (b > 128)
		{
			System.out.println(b + " is larger than max size. Max size is 128. Reducing size to 128 layers...");
			b = 128;
		}
		System.out.println("Creating a size " + b + " pyramid:");
		b--;

		if (b < 5) // ((b < 5) && (k < 10))
		{
			for (int i = b; i >= 0; i--)
			{
				for (int k = (b - 1) - i; k >= 0; k--)
				{
					System.out.print("  ");
				}
				for (int k = (2 * i); k >= 0; k--)
				{
					if (k < 10)
					System.out.print(k + " ");
				}
				System.out.println();
			}
		} else if (b < 50) // ((b < 50) && (k < 10)), ((b < 50) && (k < 100))
		{
			for (int i = b; i >= 0; i--)
			{
				for (int k = (b - 1) - i; k >= 0; k--)
				{
					System.out.print("   ");
				}
				for (int k = (2 * i); k >= 0; k--)
				{
					if (k < 10)
						{
							System.out.print("0" + k + " ");
						} else if (k < 100)
						{
							System.out.print(k + " ");
						}
				}
				System.out.println();
			}
		} else if (b <= 128) // ((b <= 128) && (k < 10)), ((b <= 128 && (k < 100)), ((b <= 128) && (k < 1000))
		{
			for (int i = b; i >= 0; i--)
			{
				for (int k = (b - 1) - i; k >= 0; k--)
				{
					System.out.print("    ");
				}
				for (int k = (2 * i); k >= 0; k--)
				{
					if (k < 10)
						{
						System.out.print("00" + k + " ");
						} else if (k < 100)
						{
							System.out.print("0" + k + " ");
						} else if (k < 1000)
						{
							System.out.print(k + " ");
						}
				}
				System.out.println();
			}
		}
	}
}
