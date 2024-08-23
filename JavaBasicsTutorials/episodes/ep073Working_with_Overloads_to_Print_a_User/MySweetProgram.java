package ep073Working_with_Overloads_to_Print_a_User;

import java.util.ArrayList;
import java.util.List;

public class MySweetProgram {

	public static void main(String[] args) {

		User me = new User();
		me.setFirstName("Josiah");
		me.setLastName("Wathen");
		
		User you = new User();
		you.setFirstName("Butthead");
		you.setLastName("Null");
		
		List<User> nerds = new ArrayList<User>();  //btw you can just do ArrayList<>() instead of having to put ArrayList<User>()
		nerds.add(me);                             //also, you can hit ctrl space while typing user to finish it for you including
		nerds.add(you);							   //having the type written in
		
		System.out.println(me.output());
		
		System.out.println(me.output(true));
		
		System.out.println(me.output(false));
		
	}
}
