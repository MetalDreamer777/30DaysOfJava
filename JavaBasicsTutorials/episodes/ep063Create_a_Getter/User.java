package ep063Create_a_Getter;

public class User {
	private String firstName;
	public String lastName;
	
	public String output() {
		return "Hi! My name is " + firstName + " " + lastName + ".";
	}
	
	public String getFirstName() { //getter
		return firstName.toUpperCase(); //putting it to upperCase to make it less accessible
	}
}
