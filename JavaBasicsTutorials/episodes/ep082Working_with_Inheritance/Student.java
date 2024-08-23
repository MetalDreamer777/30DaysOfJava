package ep082Working_with_Inheritance;

public class Student extends User { // <--This is how you have a class inherit from another class. You Extend it from another class
	public boolean verified = true; // <--This is overriding the inherited verified field from User
	public String major;
	
	public String portfolio() {;
		return "Name: " + firstName + " " + lastName + "\n"
			 + "Major: " + major + "\n"
			 + "Verified Student: " + (verified ? "Verified" : "Unverified");
	}
}