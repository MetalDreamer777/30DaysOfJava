package ep095Creating_an_Interface_for_Functionality;

public class Principal extends User { // <-- Even though Principal does not state that it implements the Talk class, it still does
									  // because it inherits the implementation from User, so we have to implement Talk's methods.
}
