/**
 * A student is a person with a gpa
 * 
 * @author CSC 143
 *
 */
public class Student extends Person{
	// the gpa of the student
	private double gpa;
	/**
	 * Creates a student given the name, age and gpa
	 */
	public Student(String name,int age, double gpa) {
		// creates the person part of the student
		// the super call MUST be the first line of code in the Student
		// constructor
		super(name, age);
		this.gpa = gpa;
	}
	
	@Override
	public void speak() {
		// call the speak version of Person
		super.speak();
		// print the gpa
		System.out.println("gpa = " + gpa);
	}
}