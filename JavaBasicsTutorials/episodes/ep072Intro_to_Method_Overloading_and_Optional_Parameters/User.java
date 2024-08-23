package ep072Intro_to_Method_Overloading_and_Optional_Parameters;
// https://youtu.be/-WMo-lFW9Dc?si=UKkapRgKfGVOnbyN
import projects.ListRotator;

public class User {
	public static void main(String[] args) {
		User a = new User();
		a.test(6);
		a.test(6, 7);
		a.test("6");
		
		ListRotator.main(args);
	}
	
	public void test(int x) { // test(x)
	}
	
	public void test(int x, int y) { //test(x, y)
	}
	
	public void test(String x) { // test("x")
	}
	
	//public int test(int x) { //this isn't a valid overload, overloads of the same name have to have different parameters to work
	//}
}
// Signature determines if a method is unique
// return types don"t change the method signature enough
// having different parameters for methods of the same name changes the signature enough for it to overload