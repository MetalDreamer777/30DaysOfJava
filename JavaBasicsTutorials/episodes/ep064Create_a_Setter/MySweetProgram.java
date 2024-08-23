package ep064Create_a_Setter;

public class MySweetProgram {

	public static void main(String[] args) {
		User user = new User();
		user.setFirstName("Sub"); //using setter
		user.setLastName("Scriber");
		
		System.out.println(user.getFirstName() + " " + user.getLastName()); //using setter
	}         

}
