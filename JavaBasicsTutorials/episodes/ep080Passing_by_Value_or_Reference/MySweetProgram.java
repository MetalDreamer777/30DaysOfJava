package ep080Passing_by_Value_or_Reference;

import java.util.ArrayList;
import java.util.List;

public class MySweetProgram {

	public static void main(String[] args) {

		User me = new User();
		me.setFirstName("Josiah");
		me.setLastName("Wathen");
		
		User you = new User();
		you.setFirstName("Not");
		you.setLastName("Me");
		
		List<User> nerds = new ArrayList<User>();
		nerds.add(me);
		nerds.add(you);
		
		int x = 4;
		User.changeCrapInt(x);
		System.out.println(x);
		
		User.changeCrapUser(you);
		System.out.println(you);
		
	}
}
