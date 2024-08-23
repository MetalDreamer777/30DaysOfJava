package ep061Return_Statement;

public class MySweetProgram {

	public static void main(String[] args) {
		User user = new User();
		user.firstName = "Sub";
		user.lastName = "Scriber";
		
		String message = user.output();
		System.out.println(message);
		
		user.outputToConsol(11, true);
	}         

}
