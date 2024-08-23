package ep082Working_with_Inheritance;

public class User {
	public String firstName;
	public String lastName;
	public boolean verified = false;

	public String portfolio() {
		return "Name: " + firstName + " " + lastName + "\n"
			 + "Verified Student: " + (verified ? "Verified" : "Unverified");
	}

}
