/**
 * A simple test of the Person class
 * 
 * @author CSC 142
 * 
 */
public class PersonUser {
	/**
	 * Entry point of the program tests the Person class
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {
		// as usual,
		// arguments (here "Sara" and 29) must match the
		// parameters in the constructor definition
		// in type, order and number
		Person p = new Person("Sara", 29);
		p.speak();
		p = new Person("Huyn", 25);
		p.speak();
		p = new Person();
		p.speak();
	}
}
