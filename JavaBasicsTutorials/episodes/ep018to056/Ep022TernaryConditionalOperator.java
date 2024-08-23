package ep018to056;

public class Ep022TernaryConditionalOperator {
	
	public static void main(String[] args) {
		
		String name = "Clair";
		
		boolean welcome = name.equals("Clair") ? true : false;
		int points = name.equals("Clair") ? 5 : 10;
		
		System.out.println(welcome);
		System.out.println(points);
		
		boolean welcome2;
		
		if(name.equals("Clair"))
		{
			welcome2 = true;
		} else
		{
			welcome2 = false;
		}
		
		System.out.println(welcome2);
	}

}

//unary operator works on one operand. ex: ! a
//binary operator works on two operands. ex: a + b
//ternary operator works on three operands. ex: a ? b : c