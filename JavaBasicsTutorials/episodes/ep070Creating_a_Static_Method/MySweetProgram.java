package ep070Creating_a_Static_Method;

public class MySweetProgram {

	public static void main(String[] args) {

		User u = new User();
		u.setFirstName("Josiah");
		u.setLastName("Wathen");
		
		User.printUser(u);
	}
}
