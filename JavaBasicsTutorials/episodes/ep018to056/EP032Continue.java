package ep018to056;

public class EP032Continue {
	public static void main(String[] args) {
    	for(int i = 9; i >= 0; i--) {
    		if(i==6) {
    			continue;
    		}
			for(int k = i; k >= 0; k--) {
	    		if(k==5) {
	    			continue;
	    		}
				System.out.print(k + " ");
			}
			System.out.println(); 
		}
	}

}
