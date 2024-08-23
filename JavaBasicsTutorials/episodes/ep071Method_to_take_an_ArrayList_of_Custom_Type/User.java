package ep071Method_to_take_an_ArrayList_of_Custom_Type;

import java.util.List;

public class User {
	private String firstName;
	private String lastName;
	
	public String output() {
		return "Hi! My name is " + firstName + " " + lastName + ".";
	}
	
	public String getFullName() {
		return getFirstName() + " " + getLastName();
	}
			
	public String getFullNameActual() {
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
	
	public static void printUsers(List<User> users) { 
		for (User u : users) System.out.println("User" + users.indexOf(u) + ": " + u.getFullNameActual());
	}
	
}
