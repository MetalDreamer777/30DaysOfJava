package ep018to056;
// https://youtu.be/2gH1vUaH6GI?si=pImzqwnZBqz-55FQ
public class Ep055Public_vs_Private {
	public String name = ""; //this is public field, so it can be accessed both inside the class and outside the class
	private String codeName = ""; //this is a private field, it can only be accessed inside of this class. it is good for working
	//with and storing data inside the class that we don't want being messed up from the outside. 
	public static void main(String[] args) {
		Ep055Public_vs_Private you = new Ep055Public_vs_Private();
		Ep055Public_vs_Private me = new Ep055Public_vs_Private();
		//accessing public variables, you can do this in anywhere even outside this class
		you.name = "Nerd";
		me.name = "Josiah";
		//accessing private variables, this can only be done this way inside this class
		you.codeName = "Epik Beans";
		me.codeName = "Refined Beans";
		//you can create methods called getters and setters that gate access the these private fields.
		//A getter gets info from a field for us to access.
		//A setter passes information into a field to change it
		//you can customize the getters and setters behavior, so that they only do certain things under certain conditions.
		//like a getter might only get information in a certain way
		//or a setter might only be able to set a field to certain values
		
		//so to summarize, private fields can only be accessed from inside a class, or though hidden access from outside using getter 
		//and setter methods. public fields can be accessed anywhere freely both inside and outside the class.
	}
}
