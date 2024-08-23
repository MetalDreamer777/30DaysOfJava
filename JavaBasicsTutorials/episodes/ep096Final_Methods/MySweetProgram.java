package ep096Final_Methods;

import java.util.ArrayList;
import java.util.List;

import ep095Creating_an_Interface_for_Functionality.Student;
import ep095Creating_an_Interface_for_Functionality.Talk;

public class MySweetProgram {

	public static void main(String[] args) {
		
		Student s = new Student("Josiah", "Wathen");
		s.sayHello();
		
		List<Talk> thingsThatTalk = new ArrayList<Talk>();
		thingsThatTalk.add(s);
		
	}
}
