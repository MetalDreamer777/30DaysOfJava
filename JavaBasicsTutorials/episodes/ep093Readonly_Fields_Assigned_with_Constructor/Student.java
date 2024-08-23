package ep093Readonly_Fields_Assigned_with_Constructor;

public class Student extends User { // <--User is the parent class (aka super class) because Student is an extension of it
	public boolean verified = true;
	public String major;
	
	public Student(String fn, String ln) { 
		super(fn, ln);
	}                                    
}