package ep095Creating_an_Interface_for_Functionality;

public abstract class User implements Talk{ // <--User doesn't need to include the methods of talk, because it is abstract,
	                                        // however, this responsibility will be passed down to the children classes
	public String firstName;
	public String lastName;
	public boolean verified = false;

}
