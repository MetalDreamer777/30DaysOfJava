package ep086abstract_Method;

public class Student extends User { // <--This is how you have a class inherit from another class. You Extend it from another class
	public boolean verified = true; // <--This is overriding the inherited verified field from User
	public String major;
	
	
	@Override
	public void sayHello() { // Because this method is abstract in User, this class must implement it.
		System.out.println("Hi, my name is " + firstName + " " + lastName + ", my major is " + major + ".");
	}
}