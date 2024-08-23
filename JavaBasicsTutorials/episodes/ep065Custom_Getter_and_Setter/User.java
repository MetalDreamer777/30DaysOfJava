package ep065Custom_Getter_and_Setter;

public class User {
	private String firstName;
	private String lastName;
	
	public String output() {
		return "Hi! My name is " + firstName + " " + lastName + ".";
	}
	
	public String getFullName() { // new getter
		return getFirstName() + " " + getLastName();
	}
			
	public String getFullNameActual() { // new getter
		return firstName + " " + lastName;
	}

	public String getFirstName() {
		return firstName.toUpperCase();
	}
	
	public String getLastName() {
		return lastName.toUpperCase();
	}
		
	public void setFirstName(String fn) {
		firstName = fn.strip();
	}

	public void setLastName(String ln) {
		lastName = ln.strip();
	}
	
}
