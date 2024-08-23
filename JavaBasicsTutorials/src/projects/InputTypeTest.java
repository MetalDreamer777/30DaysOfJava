package projects;

public class InputTypeTest {
	public static void main(String[] args) {
		String str = "Hiens57";
		
		System.out.println(str.matches("[0-9]+") ? "true" : "false");
		System.out.println(isInteger(str));


	}
	public static boolean isInteger(String str) {
		return str != null && str.matches("[0-9]+");
	}
}
