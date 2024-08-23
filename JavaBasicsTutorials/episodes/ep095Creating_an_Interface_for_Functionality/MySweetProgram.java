package ep095Creating_an_Interface_for_Functionality;

import java.util.ArrayList;
import java.util.List;

public class MySweetProgram {

	public static void main(String[] args) {
		Student s = new Student("Josiah", "Wathen");
		s.sayHello();
		
		List<Talk> thingsThatTalk = new ArrayList<Talk>();
		thingsThatTalk.add(s);
		
	}
}
