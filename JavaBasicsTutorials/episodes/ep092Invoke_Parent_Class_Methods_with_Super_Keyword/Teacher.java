package ep092Invoke_Parent_Class_Methods_with_Super_Keyword;

public class Teacher extends User {
	
	public String prefix;
	public String subject;
	
	@Override
	public void sayHello() {
		System.out.println("Hello, my name is " + prefix + " " + lastName + ". I am a teacher and I teach " + subject + ".");
	}

}
