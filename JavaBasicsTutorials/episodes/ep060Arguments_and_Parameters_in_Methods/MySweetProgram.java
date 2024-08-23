package ep060Arguments_and_Parameters_in_Methods;

public class MySweetProgram {

	public static void main(String[] args) {
		User user = new User();
		user.firstName = "Sub";
		user.lastName = "Scriber";
		
		user.output(6); //here we input the argument '6' into the int parameter
	}         

}
