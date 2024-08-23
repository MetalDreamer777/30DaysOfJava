package ep078Overload_the_Search_to_Take_in_a_User_Object;

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
	
	public static int searchList(List<User> users, User u) {
		//*
		for (int i = 0 ; i < users.size(); i++) {
			if(users.get(i).equals(u)) {
				return i;
			}
		}
		return -1;
		//*/
		// searchList(users, u.getFullName());
	}
	
	public static int searchList(List<User> users, String fn, String ln) {
		return searchList(users, (fn + " " + ln));
	}
	
	public static int searchList(List<User> users, String fullName) {
		for(int i = 0; i < (users.size()); i++) {
			if (users.get(i).getFullName().equals(fullName)) {
				return i;
			}
		}
		return -1;
	}
	
	@Override
	public String toString() {
		return "User [getFullName()=" + getFullName() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	
	
}
