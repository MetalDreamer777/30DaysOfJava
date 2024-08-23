package ep084Creating_a_Method_in_User_Class_and_Overriding_in_a_Derived_Class;

public class User {
	public String firstName;
	public String lastName;
	public boolean verified = false;
	
	public void sayHello() {
		System.out.println("Hello, I'm a User. My name is " + firstName + " " + lastName);
	}

}
