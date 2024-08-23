package ep018to056;

public class Ep031Break {
	public static void main(String[] args) {
		
    	for(int i = 9; i >= 0; i--) {
    		if(i==3) {
    			break;
			}
			for(int k = i; k >= 0; k--) {
				if(k == 6) {
					break;
				}
				System.out.print(k + " ");
			}
			System.out.println(); 
		}
    	
	}
	
}
