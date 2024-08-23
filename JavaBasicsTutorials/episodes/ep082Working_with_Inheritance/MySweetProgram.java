package ep082Working_with_Inheritance;

public class MySweetProgram {

	public static void main(String[] args) {
		Student a = new Student();
		a.firstName = "Quandale";
		a.lastName = "Dingle";
		a.major = "Mustach Design";
		
		System.out.println(a.major);
		
		System.out.println(a.portfolio());
		
		
		//just me trying to experiment with polyMorphism before I even knew what polyMorphism was
		User b = new User();
		b.firstName = "Johny";
		b.lastName = "Bravo";
		System.out.println(b.portfolio());
		
		User c = new Student();
		c.firstName = "Boing";
		c.lastName = "747";
		System.out.println(c.portfolio());
	}
}
