package ep084Creating_a_Method_in_User_Class_and_Overriding_in_a_Derived_Class;

public class Student extends User { // <--This is how you have a class inherit from another class. You Extend it from another class
	public boolean verified = true; // <--This is overriding the inherited verified field from User
	public String major;
	
	@Override
	public void sayHello() {
		System.out.println("Hi, my name is " + firstName + " " + lastName + ", my major is " + major + ".");
	}
}