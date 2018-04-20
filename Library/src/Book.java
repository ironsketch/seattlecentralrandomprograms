/**
 * A simple model of a book
 * 
 * @author CSC 142
 * 
 */
public class Book {
	// a book is defined by its title
	private String title;

	/**
	 * Creates a book given its title
	 * 
	 * @param title
	 *            the title of the book
	 */
	public Book(String title) {
		this.title = title;
	}

	/**
	 * Returns the title of this book
	 */
	public String getTitle() {
		return title;
	}
}
