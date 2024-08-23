package ep097Final_Class;

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
}