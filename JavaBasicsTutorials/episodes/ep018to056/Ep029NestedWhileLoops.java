package ep018to056;

public class Ep029NestedWhileLoops {
	public static void main(String[] args) {
		
		int i = 9;
		while(i >= 0) {
			int k = i;
			while(k >= 0) {
				System.out.print(k + " ");
				k--;
			}
			System.out.println();
			i--;
		}
		/*
    	for(i = 9; i >= 0; i--) {
			for(int k = i; k >= 0; k--) {
				System.out.print(k + " ");
			}
			System.out.println(); 
		}
		*/
	}
}