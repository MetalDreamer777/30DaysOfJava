package ep099enum_in_switch;

public class MySweetProgram {

	public static void main(String[] args) {
		
		Student s = new Student("Josiah", "Wathen");
		
		s.status = s.status.probation;
		
		System.out.println(s.status);
		

		
	}
}