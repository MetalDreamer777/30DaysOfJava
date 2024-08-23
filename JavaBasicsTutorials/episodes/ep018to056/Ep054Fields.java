package ep018to056;
// https://youtu.be/7SXxpCvHQew?si=SkkfzkdOnYf-RJ4_
public class Ep054Fields {
	// when we create a method inside of a class but not inside of a method, we call that a field.
	public int test = 5; // this is an example of a field. this variable is accessible everywhere inside this class.
	// if we made an instance of this class (an object), then this field would be available to us where we made the object, and it's
	// default value would be 5.
	public static void main(String[] args) {
		int x = 5; //just a normal variable inside a method.
		
		Ep054Fields example = new Ep054Fields();  //we can created an object like this
		example.test = 6; //now we can access the field and assign it a value
		// another example:
		// Person me = new Person();
		// me.name = "Caleb";
	}
}
