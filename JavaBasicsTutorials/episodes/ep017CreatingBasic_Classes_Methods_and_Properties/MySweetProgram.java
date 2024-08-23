package ep017CreatingBasic_Classes_Methods_and_Properties;

public class MySweetProgram {

	public static void main(String[] args) { 
		User user = new User();
		user.firstName = "Josiah"; //setting a property
		user.lastName = "Wathen";
		
		User user2 = new User();
		user2.firstName = "John";
		user2.lastName = "Doe";
		
		System.out.println(user.getFullName());
		System.out.println(user2.getFullName());
	}

}
