package ep071Method_to_take_an_ArrayList_of_Custom_Type;

import java.util.ArrayList;
import java.util.List;

public class MySweetProgram {

	public static void main(String[] args) {

		User me = new User();
		me.setFirstName("Josiah");
		me.setLastName("Wathen");
		
		User you = new User();
		you.setFirstName("Bevis");
		you.setLastName("null");
		
		List<User> nerds = new ArrayList<User>();  //btw you can just do ArrayList<>() instead of having to put ArrayList<User>()
		nerds.add(me);                             //also, you can hit ctrl space while typing user to finish it for you including
		nerds.add(you);							   //having the type written in
		
		User.printUsers(nerds);
		
	}
}
