package ep018to056;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ep044ListInterfaceAndArrayListImplementation {
	public static void main(String[] args) {
		List<Integer> grades1 = new ArrayList<Integer>();
		List<Integer> grades2 = new LinkedList<Integer>();
//   List is an ex of an Interface   ArrayList and LinkedList are ex of an Implementation
	}
}
// go to
// https://docs.oracle.com/javase/8/docs/api/
// or
// https://download.java.net/java/early_access/panama/docs/api/java.base/java/util/ArrayList.html
// and notice under the heading "All Implemented Interfaces". See that "List" is in the list of Implementations. That means that ArrayList
// meets all the requirements to be considered a List