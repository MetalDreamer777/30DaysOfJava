package ep096Final_Methods;

public class Student extends User implements Talk {
	public boolean verified = true;
	public String major;
	
	public Student() { 
		System.out.println("Creating a Student"); 
	}                                    
	
	public Student(String fn, String ln) { 
		firstName = fn; lastName = ln;     
	}

	public void sayHelloUser() {
		
	}
	
	@Override
	public void sayHello() {
		System.out.println("Hi, my name is " + firstName + " " + lastName + ". My major is " + major + ".");
	}
}