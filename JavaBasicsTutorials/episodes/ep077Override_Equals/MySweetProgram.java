package ep077Override_Equals;

import java.util.ArrayList;
import java.util.List;

public class MySweetProgram {

	public static void main(String[] args) {

		User me = new User();
		me.setFirstName("Josiah");
		me.setLastName("Wathen");
		
		User you = new User();
		you.setFirstName("Bevis");
		you.setLastName("Null");
		
		List<User> nerds = new ArrayList<User>();
		nerds.add(me);
		nerds.add(you);
		
		System.out.println(me.equals(you));
		
		System.out.println(me.hashCode());
		System.out.println(you.hashCode());
		
		you = me;
		System.out.println(me.equals(you));
		
		System.out.println(me.hashCode() == you.hashCode());
		System.out.println(me.hashCode());
		System.out.println(you.hashCode());
	}
}
