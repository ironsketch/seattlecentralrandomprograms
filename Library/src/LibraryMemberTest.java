/**
 * A test of the LibraryMember and Book classes
 * 
 * @author CSC 142
 * 
 */
public class LibraryMemberTest {

	/**
	 * tests the LibraryMember and Book classes
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {
		// create a library member
		LibraryMember m = new LibraryMember(123456789);
		// have the member return a book -> should fail
		boolean b = m.returnBook();
		System.out.println("b = " + b + " (should be false)");
		// have the member borrow a book -> should work
		b = m.borrowBook("Harry Potter");
		System.out.println("b = " + b + " (should be true)");
		// have the member borrow a book -> should fail
		b = m.borrowBook("The chamber of secrets");
		System.out.println("b = " + b + " (should be false)");
		// have the member return a book -> should work
		b = m.returnBook();
		System.out.println("b = " + b + " (should be true)");
	}

}






