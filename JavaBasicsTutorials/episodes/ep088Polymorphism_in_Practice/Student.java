package ep088Polymorphism_in_Practice;

public class Student extends User { 
	public boolean verified = true;
	public String major;
	
	
	@Override
	public void sayHello() {
		System.out.println("Hi, my name is " + firstName + " " + lastName + ". My major is " + major + ".");
	}
}