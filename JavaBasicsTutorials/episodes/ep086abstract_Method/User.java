package ep086abstract_Method;

public abstract class User { // <--The abstract keyword in a class prevents a class from being instantiated,
	public String firstName; //    that way it can only be used by inheritance
	public String lastName;
	public boolean verified = false;
	
	public abstract void sayHello(); // <--The abstract keyword in a method prevents a method from being able to have a body,
									 // that way it has to be overridden to be used and any inherited class must implement it.
									 // you can view it as creating a template for what to put in children classes
}
