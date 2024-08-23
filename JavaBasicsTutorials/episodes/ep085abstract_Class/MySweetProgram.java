package ep085abstract_Class;

public class MySweetProgram {

	public static void main(String[] args) {
		Student s = new Student();
		s.firstName = "Quandale";
		s.lastName = "Dingle";
		s.major = "Mustach Design";
		
		User y = new Student(); //you can do this
		//User z = new User();  //but you can't do this
		
		s.sayHello();
		
	}
}
