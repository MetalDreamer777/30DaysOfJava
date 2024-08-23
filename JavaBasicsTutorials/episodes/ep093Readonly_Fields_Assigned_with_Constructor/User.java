package ep093Readonly_Fields_Assigned_with_Constructor;

public abstract class User { //btw, User is considered a super class because it has other classes inheriting from it
	private String firstName;
	private String lastName;
	public boolean verified = false;
	
	public User(String fn, String ln) {
		firstName = fn; lastName = ln;
	}

	public void sayHello() { //we can still access methods in an abstract class from within an inherited class
		System.out.println(firstName + " " + lastName); // as long as the method isn't abstract
	}
}
