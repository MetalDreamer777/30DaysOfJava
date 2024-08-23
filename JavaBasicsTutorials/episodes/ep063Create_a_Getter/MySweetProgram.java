package ep063Create_a_Getter;

public class MySweetProgram {

	public static void main(String[] args) {
		User user = new User();
	  //user.firstName = "Sub"; //it can't get access this anymore because it is private now and needs a setter to assign it a value 
		user.lastName = "Scriber";
		
		String message = user.output();
		System.out.println(message);
	}         

}
