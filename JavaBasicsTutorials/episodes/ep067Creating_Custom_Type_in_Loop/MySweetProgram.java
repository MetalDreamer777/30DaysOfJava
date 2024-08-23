package ep067Creating_Custom_Type_in_Loop;

import java.util.ArrayList;
import java.util.List;

public class MySweetProgram {

	public static void main(String[] args) {
		String[] firstName = {"Calab", "Josiah", "Jeremiah", "Bob", "Karen", "Bowser"};
		String[] lastName = {"Curry", "Wathen", "Wathen", "Wathen", "Wathen", "Jr."};
		List<User> peeps = new ArrayList<User>();
		
		for (int i = 0; i < firstName.length; i++) {
			User u = new User();
			u.setFirstName(firstName[i]);
			u.setLastName(lastName[i]);
			peeps.add(u);
		}
		
		for (User u : peeps) {
			System.out.println(u.getFullNameActual());
		}
	}         
}