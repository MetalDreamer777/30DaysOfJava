package ep098Intro_to_enum;

public class MySweetProgram {

	public static void main(String[] args) {
		
		Student s = new Student("Josiah", "Wathen");
		
		s.status = s.status.probation;
		
		System.out.println(s.status);
		
		switch(s.status) {
		case active:
			System.out.println("Great!");
			break;
		case innactive:
			System.out.println("Come back!");
			break;
		case probation:
			System.out.println("Ouch");
			break;
		case suspended:
			System.out.println("R.I.P");
			break;
		}
 
		

		
	}
}