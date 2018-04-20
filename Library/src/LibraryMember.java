/**
 * A simple model of the member of a library
 * 
 * @author CSC 142
 * 
 */
public class LibraryMember {
	// the social security number of the member
	private int ssn;
	// the book checked out by the member (null if none)
	private Book book;

	/**
	 * Creates a LibraryMember given his/her ssn. Initially, the member doesn't
	 * have a book.
	 * 
	 * @param ssn
	 *            the ssn of the member
	 */
	public LibraryMember(int ssn) {
		this.ssn = ssn;
		this.book = null; // not needed since done anyway
		// null is the default value for any instance field
		// with a reference type (= type defined by a class)
	}

	/**
	 * Checks out a book given its title
	 * 
	 * @param title
	 *            the title of the book to borrow
	 * @return true if the book could be checked out and false if not.
	 */
	public boolean borrowBook(String title) {
		if (book == null) { // the book can be checked out
			book = new Book(title);
			// Use \" to print a "
			System.out.println("You have checked out \"" + title + ".\"");
			return true;
		} else {// the book can't be checked out since
			// the member already has one
			// \n prints a new line
			System.out
					.println("You can't check out a book.\nYou already have one.");
			return false;
		}
	}

	/**
	 * Returns the book of the library member (if there is a book
	 * to return)
	 * @return true if successful and false if not
	 */
	public boolean returnBook() {
		if (book != null) {
			System.out
					.println("You have returned \"" + 
			                  book.getTitle() + ".\"");
			book = null;
			return true;
		} else {
			System.out.println("You don't have any book to return.");
			return false;
		}
	}
}
