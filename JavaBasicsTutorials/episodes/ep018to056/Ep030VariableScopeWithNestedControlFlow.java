package ep018to056;

public class Ep030VariableScopeWithNestedControlFlow {
	public static void main(String[] args) {
		
		
		{   //you can't declare the same variable twice in the same scope and a viable cannot be called outside of it's scope
			int i = 9;
			while(i >= 0) {
				int k = i;
				int pizza = 5;
				while(k >= 0) {
					System.out.print(k + " ");
					k--;
				//  int pizza; // you ca't do this here because pizza is already declared in this scope
				}
				System.out.println();
				i--;
			}
			int pizza = 5; // pizza can be called here because it is outside 
		} //this bracket allows i to be declared again in the for loop as a unique variable that scope by moving the first code to a lower scope
	//  pizza = 10;   // pizza can't be called here because it is outside the scope of where pizza is declared
    	for(int i = 8; i >= 0; i--) {
			for(int k = i; k >= 0; k--) {
				System.out.print(k + " ");
			}
			System.out.println(); 
    	}
    	
    	/*//Btw you can also do this with a for loop:
    	 * 
     	int i = 9;
       	for(; i >= 0; i--) {
			for(int k = i; k >= 0; k--) {
				System.out.print(k + " ");
			}
			System.out.println(); 
    	}
    	
    	 */
	}
}
