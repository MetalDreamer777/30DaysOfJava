package ep066ArrayList_of_Custom_Type;

import java.util.ArrayList;
import java.util.List;

public class MySweetProgram {

	public static void main(String[] args) {
		User him = new User();
		him.setFirstName("Caleb");
		him.setLastName("Curry");
		
		User me = new User();
		me.setFirstName("Sub");
		me.setLastName("Scriber");
		
		List<User> peeps = new ArrayList<User>();
		peeps.add(him);
		peeps.add(me);
		
		System.out.println(peeps.get(0).getFirstName());
		
		System.out.print("[");
		for(int i = 0; i < peeps.size(); i++) {
			if(i < (peeps.size() - 1)) System.out.print(peeps.get(i).getFullNameActual() + ", ");
			if(i == (peeps.size() - 1)) System.out.println(peeps.get(i).getFullNameActual() + "]");
		}
	}         
}