package ep095Creating_an_Interface_for_Functionality;

public class Student extends User implements Talk { // <--We get an error, because the methods from the talk interface are missing
	public boolean verified = true;					// from this class
	public String major;                                  
	
	public Student(String fn, String ln) { 
		firstName = fn; lastName = ln;     
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		
	}
	
}