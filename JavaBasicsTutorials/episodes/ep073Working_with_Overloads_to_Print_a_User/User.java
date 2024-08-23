package ep073Working_with_Overloads_to_Print_a_User;

import java.util.List;

public class User {
	private String firstName;
	private String lastName;
	
	public String output() {
		return "Hi! My name is " + getFullName() + ".";
	}
	
	public String output(boolean nice) {
		if (nice == true) return "You are a beautiful person. - " + getFullNameActual();
		return "You are a FREAK!!! - " + getFullNameActual();
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
