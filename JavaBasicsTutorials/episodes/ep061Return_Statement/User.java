package ep061Return_Statement;

public class User {
	public String firstName;
	public String lastName;
	
	public void outputToConsol(int times, boolean spamLimit) { // void methods can't return a value, it can only do something with what is put into it.
			for (int i = 0; i < times; i++) {                  // void is basically a place holder for where you would put a type of value the method returns.
			if ((spamLimit == true) && (i > 10)) return;       // you can still use return in a void method, it will just exit the method without returning a value
			System.out.println(firstName + lastName);
		}
	} 
	
	public String output() {  // this is a String method, so it will return a String value
		return "Hi! My name is " + firstName + " " + lastName + ".";
	}
}
