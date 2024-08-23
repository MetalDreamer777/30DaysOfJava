package ep064Create_a_Setter;

public class User {
	private String firstName;
	private String lastName;
	
	public String output() {
		return "Hi! My name is " + firstName + " " + lastName + ".";
	}
	
	public String getFirstName() { //getter
		return firstName.toUpperCase();
	}
	
	public void setFirstName(String fn) { //setter
		firstName = fn;
	}
	
	public String getLastName() {
		return lastName.toUpperCase();
	}
	
	public void setLastName(String ln) {
		lastName = ln;
	}
}
