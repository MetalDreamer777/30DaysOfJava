package ep099Intro_to_enum;

public abstract class User implements Talk {
	public enum status {active, innactive, probation, suspended}; // <--An enumeration allows you to create a type that 
													   // has a list of possible values for a variable
	public status status; //here we are creating a variable from our status enum and naming it status
	
	public String firstName;
	public String lastName;
	public boolean verified = false;
	
	public final void sayHello() { // <-- 'final' keyword prevents the method from being overwritten
		
	}
}
