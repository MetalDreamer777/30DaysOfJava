package ep018to056;
// https://youtu.be/1ZYGnFL1Z44?si=ld1Zt78_Wy41_lze
public class Ep056Methods {        //we create a class, lets pretend it's actually called 'Person':  Public class Person {
	public String name;           // here we create a field for a persons name
	public String talk() {           //then we create a method that makes the person talk
		return "Hi, I'm " + name;    //in this case, out talk method returns an output using the field we made
	}
	
	public static void main(String[] args) {    //then we can use those in any method anywhere
		Ep056Methods me = new Ep056Methods();   //we make instantiate the class, creating an object:  Person me = new Person();
		me.name = "Josiah";                     //assign the object 'me' a value for the field 'name'
		System.out.println(me.talk());          //then we use the talk method for 'me'
	}
}
