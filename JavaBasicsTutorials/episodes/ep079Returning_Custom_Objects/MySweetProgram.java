package ep079Returning_Custom_Objects;

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
		
		User search = new User();
		search.setFirstName("Not");
		search.setLastName("Me");		
		
		User found = User.findUser(nerds, you);
		
		System.out.println(you);
		
		found.setFirstName("Sally");
		System.out.println(you);
		
		System.out.println(you.toString());
	}
}
