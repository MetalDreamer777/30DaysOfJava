package ep018to056;

public class Ep028NestedForLoops_TrianglesAndPyramids_ {
	
	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++)
		{
			for (int k = i; k >= 0; k--)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
		for (int i = 9; i >= 0; i--)
		{
			for (int k = i; k >= 0; k--)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
		int b = 49;
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
					System.out.print("00" + k + " ");
					} else if (k < 100)
					{
						System.out.print("0" + k + " ");
					} else if (k < 1000)
					{
						System.out.println(k + " ");
					}
			}
			System.out.println();
		}
	}
}
//⁕