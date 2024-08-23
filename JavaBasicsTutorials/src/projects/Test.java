package projects;

public class Test {
	
	public static void main(String[] args) {
		int itr = 100;
		Fibinacci.printSeriesFor(itr);
		System.out.println("Iteration " + itr + ": " + Fibinacci.getIterationInt(itr));
		System.out.println("Iteration " + itr + ": " + Fibinacci.getIterationLong(itr));
		System.out.println("Iteration " + itr + ": " + Fibinacci.getIterationBig(itr));
	}
}

