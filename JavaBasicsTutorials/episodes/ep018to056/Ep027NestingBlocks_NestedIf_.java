package ep018to056;

public class Ep027NestingBlocks_NestedIf_ {
	public static void main(String[] args) {
		boolean additionalLogging = true;
		
		for (int i = 10; i > 0; i--)
		{
			System.out.println(i);
			if (i == 5)
			{
				if (additionalLogging == true) System.out.println("We found " + i);
			}
		}
	}
}
