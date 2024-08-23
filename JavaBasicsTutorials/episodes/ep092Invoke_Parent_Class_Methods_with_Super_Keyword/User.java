package ep092Invoke_Parent_Class_Methods_with_Super_Keyword;

public abstract class User { //btw, User is considered a super class because it has other classes inheriting from it
	public String firstName;
	public String lastName;
	public boolean verified = false;
	
	public void sayHello() { //we can still access methods in an abstract class from within an inherited class
		System.out.println("User version"); // as long as the method isn't abstract
	}
}
