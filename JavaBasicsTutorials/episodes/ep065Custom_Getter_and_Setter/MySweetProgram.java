package ep065Custom_Getter_and_Setter;

public class MySweetProgram {

	public static void main(String[] args) {
		User user = new User();
		user.setFirstName("   Sub"); //using setter
		user.setLastName("Scriber   ");
		
		System.out.println(user.getFirstName() + " " + user.getLastName());
		
		System.out.println(user.getFullName());
		
		System.out.println(user.getFullNameActual());

//My own experiment aside from the lesson
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		User beans = user;
		
		System.out.println(user.equals(beans));
		
		System.out.println(beans.getFirstName() + " " + beans.getLastName()); //using setter
		
		System.out.println(beans.getFullName());
		
		System.out.println(beans.getFullNameActual());
	}         
}
