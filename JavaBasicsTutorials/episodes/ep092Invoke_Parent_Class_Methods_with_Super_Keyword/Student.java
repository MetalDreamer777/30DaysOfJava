package ep092Invoke_Parent_Class_Methods_with_Super_Keyword;

public class Student extends User { // <--User is the parent class (aka super class) because Student is an extension of it
	public boolean verified = true;
	public String major;
	
	public Student() { 
		System.out.println("Creating a Student"); 
	}                                    
	
	public Student(String fn, String ln) { 
		firstName = fn; lastName = ln;     
	}

	public void sayHelloUser() {
		//super.sayHello(); //we can use the 'super' keyword anywhere in a derived class to get access to the methods from the parent class aka super class
	}
	
	@Override
	public void sayHello() {
		super.sayHello();
		System.out.println("Hi, my name is " + firstName + " " + lastName + ". My major is " + major + ".");
	}
}