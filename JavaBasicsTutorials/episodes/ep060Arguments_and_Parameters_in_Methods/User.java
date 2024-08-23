package ep060Arguments_and_Parameters_in_Methods;

public class User {
	public String firstName;
	public String lastName;
	
	public void output(int times) { /* We can set parameters that take arguments for the method to use as variable values when invoked.
									 * here, we made an int parameter called 'times' */
		for (int i = 0; i < times; i++) System.out.println(firstName + lastName);
	}
}
