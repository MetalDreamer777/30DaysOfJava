package ep096Final_Methods;

public class Teacher extends User implements Talk {
	
	public String prefix;
	public String subject;
	
	@Override
	public void sayHello() { // <-- getting error because this method is final in User and thus can't be overwritten
		System.out.println("Hello, my name is " + prefix + " " + lastName + ". I am a teacher and I teach " + subject + ".");
	}

}
