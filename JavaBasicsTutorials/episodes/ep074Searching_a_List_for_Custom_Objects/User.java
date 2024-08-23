package ep074Searching_a_List_for_Custom_Objects;

import java.util.List;

public class User {
	private String firstName;
	private String lastName;
	
	public String output() {
		return "Hi! My name is " + getFullName() + ".";
	}
	
	public String output(boolean nice) {
		if (nice == true) return "You are a beautiful person. - " + getFullName();
		return "You are a FREAK!!! - " + getFullName();
	}
	
	public String getFullName() {
		return getFirstName() + " " + getLastName();
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
		
	public void setFirstName(String fn) {
		firstName = fn.strip();
	}

	public void setLastName(String ln) {
		lastName = ln.strip();
	}
	
	public static void printUsers(List<User> users) { 
		for (User u : users) System.out.println("User" + users.indexOf(u) + ": " + u.getFullName());
	}
	
	public static int searchList(List<User> users, String fn, String ln) {
		return searchList(users, (fn + " " + ln));
	}
	
	public static int searchList(List<User> users, String fullName) {
		for(int i = 0; i < users.size(); i++) {
			if (users.get(i).getFullName().equals(fullName)) {
				return i;
			}
		}
		return -1;
	}
}
