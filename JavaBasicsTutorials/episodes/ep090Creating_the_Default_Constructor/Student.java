package ep090Creating_the_Default_Constructor;

public class Student extends User { 
	public boolean verified = true;
	public String major;
	
	// the default constructor is used without needing to type it out. but here it is in case we need it later on
	public Student() { //this is what the set up for the default constructor would look like if we wrote it out
		System.out.println("Creating a Student"); //you can also set up a constructor to run code on creation of an object
	}                                    // it is basically a kind of method
	
	@Override
	public void sayHello() {
		System.out.println("Hi, my name is " + firstName + " " + lastName + ". My major is " + major + ".");
	}
}