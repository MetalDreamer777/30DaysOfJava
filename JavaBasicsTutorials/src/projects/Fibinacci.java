package projects;

import java.math.BigInteger;

public class Fibinacci {

	public static void printSeriesFor(int iterations) {
		BigInteger a = new BigInteger("1");
		BigInteger b = new BigInteger("0");
		BigInteger c = new BigInteger("0");
		for (int i = 0; i <= iterations; i++) {
			System.out.println(i + " : " + b);
			c = a.add(b);
			b = a;
			a = c;
		}
	}
	
	public static int getIterationInt(int iteration) {
		int x = 1;
		int y = 0;
		int z = 0;
		if (iteration < 47) {
			for (int i = 0; i < iteration; i++) {
				z = x + y; 
				y = x;
				x = z;
			}
			return y;			
		}
		return -1;
	}
	
	public static long getIterationLong(int iteration) {
		long x = 1L;
		long y = 0L;
		long z = 0L;
		if (iteration < 100) {
			for (int i = 0; i < iteration; i++) {
				z = x + y; 
				y = x;
				x = z;
			}
			return y;			
		}
		return -1;
	}
	
	public static BigInteger getIterationBig(int iteration) {
		BigInteger a = new BigInteger("1");
		BigInteger b = new BigInteger("0");
		BigInteger c = new BigInteger("0");
		for (int i = 0; i < iteration; i++) {
			c = a.add(b);
			b = a;
			a = c;
		}
		return b;
	}
	
	public static int getRecursion(int n) {
		BigInteger a = new BigInteger(String.valueOf(n));
		BigInteger b = new BigInteger("1");
		if (0 == (b.compareTo(a)) || -1 == (a.compareTo(b))) return 1;
		return getRecursion(n - 1) + getRecursion(n - 2);
	}
	
	public static int getRecursionShow(int n) {
		BigInteger a = new BigInteger(String.valueOf(n));
		BigInteger b = new BigInteger("1");
		if (0 == (b.compareTo(a)) || -1 == (a.compareTo(b))) {
			System.out.print(n + " ");
			return 1;
		}
		System.out.print(n + " ");
		return getRecursionShow(n - 1) + getRecursionShow(n - 2);
	}
	
	
}