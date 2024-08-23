package ep095Creating_an_Interface_for_Functionality;

public class Teacher extends User implements Talk { 
	
	public String prefix;
	public String subject;
	
	@Override
	public void sayHello() {				// <--The method from the interface is successfully implemented here
		System.out.println("Implemented");
	}

}
