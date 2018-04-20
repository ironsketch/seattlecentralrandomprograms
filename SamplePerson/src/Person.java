/**
 * A simple model of a person
 * @author CSC 142
 *
 */
public class Person {
	// a person is defined by a name and an age
	// declare two instance fields to store a name and an age
	// template to declare an instance field
	// access modifier + type of the field + name of the field
	// access modifier: public/private (private is preferred for
	// an instance field)
	// type: can be given by another class or built in the Java
	// language
	// name: follow the camel casing style
	// instance fields can be used anywhere within the class
	// (and may even be accessed outside of the class if they
	// are marked public, which is not the case here)
	private String name; 
	private int age;
	
	/**
	 * Constructs a person given a name and an age
	 * @param n the name of the person
	 * @param a the age of the person
	 */
	public Person(String n, int a) {
		// n and a are parameters
		// they get their values from the call of the constructor
		// they are local to the constructor ->
		// they can't be used outside of the constructor
		name = n;
		age = a;
	}
	
	/**
	 * Creates a person with a set name and age
	 */
	public Person() {
		// the constructor that doesn't take any parameters is
		// called the default constructor
		name = "Jane";
		age = 30;
	}
	
	/**
	 * Prints the name and the age of the person
	 */
	public void speak() {
		// ln in println means print a new line at the end
		System.out.println("My name is " + name + 
				           ". My age is " + age + ".");
	}
}













