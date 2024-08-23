package ep058Adding_Fields_to_Class;

public class MySweetProgram {

	public static void main(String[] args) {
		User/*Declaring the type*/ user/*storing the object in this variable*/ = new/*making a new instance(object) of*/ User()/*this class*/;
		user.firstName = "Sub";  //user is now a local variable of this method 'main' as an instance of User.
		user.lastName = "Scriber";
		
		System.out.println(user.firstName + user.lastName);
	}         

}
