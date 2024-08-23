package projects;

import java.util.Scanner;

public class Pyramid2 {
	
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
		{
			for (int i = b; i >= 0; i--)
			{
				for (int k = (b - 1) - i; k >= 0; k--)
				{
					if ((b < 5))
						{
							System.out.print("  ");
						} else if ((b < 50))
						{
							System.out.print("   ");
						} else if ((b < 128))
						{
							System.out.print("    ");
						}
				}
				for (int k = (2 * i); k >= 0; k--)
				{
					if (((b >= 50) && (b <= 128) && (k < 10)))
						{
						System.out.print("00" + k + " ");
						} else if (((b >= 5) && (b < 50) && (k < 10)) ^ ((b >= 50) && (b <= 128) && (k < 100)))
						{
							System.out.print("0" + k + " ");
						} else if (((b < 5) && (k < 10)) ^ ((b >= 5) && (b < 50) && (k < 100)) ^ ((b >= 50) && (b <= 128) && (k < 1000)))
						{
							System.out.print(k + " ");
						}
				}
				System.out.println();
			}
		}
	}
}
