package ep085abstract_Class;

public abstract class User { // <--The abstract keyword prevents a class from being instantiated, that way it can only be used by inheritance
	public String firstName;
	public String lastName;
	public boolean verified = false;
	
	public void sayHello() {
		System.out.println("Hello, I'm a User. My name is " + firstName + " " + lastName);
	}

}
