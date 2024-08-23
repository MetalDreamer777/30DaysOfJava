package ep078Overload_the_Search_to_Take_in_a_User_Object;

import java.util.ArrayList;
import java.util.List;

public class MySweetProgram {

	public static void main(String[] args) {

		User me = new User();
		me.setFirstName("Josiah");
		me.setLastName("Wathen");
		
		User you = new User();
		you.setFirstName("Bevis");
		you.setLastName("Butthead");
		
		User nobody = new User();
		nobody.setFirstName("ings");
		nobody.setLastName("end");
		
		List<User> nerds = new ArrayList<User>();
		nerds.add(me);
		nerds.add(you);
		
		System.out.println(User.searchList(nerds, nobody));
	}
}
