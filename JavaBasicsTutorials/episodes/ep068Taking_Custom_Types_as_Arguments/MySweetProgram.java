package ep068Taking_Custom_Types_as_Arguments;

public class MySweetProgram {

	public static void main(String[] args) {
		
		User u = new User();
		u.setFirstName("Josiah");
		u.setLastName("Wathen");

		MySweetProgram m = new MySweetProgram();
		m.printUser(u);  //using the method with a custom type argument
	}
	
	public void printUser(User u) {      //method with a custom type as a parameter
		System.out.println("User: " + u.getFullNameActual());
	}
}
