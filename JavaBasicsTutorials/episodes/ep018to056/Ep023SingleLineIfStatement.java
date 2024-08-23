package ep018to056;

public class Ep023SingleLineIfStatement {
	
	public static void main(String[] args) {
		String name = "ClAre";
		boolean welcome = false;
		
		if(name.toLowerCase().equals("clare"))
			welcome = true;
			System.out.println("This line is not in the if statement.");
			
		System.out.println(welcome);
			
		if(welcome=true) System.out.println("Welcome Clare!"); //it's better to do it this way, in a single line. That way, you don't accidentally try to put two lines of code in it.


	}

}
