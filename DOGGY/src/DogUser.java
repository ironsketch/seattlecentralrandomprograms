/**
 * Test of the Dog class
 * 
 * @author CSC 142
 * 
 */
public class DogUser {

	/**
	 * tests the Dog class
	 */
	public static void main(String[] args) {
		Dog d = new Dog("Mr. Poops A Lot", 4,5);
		d.rollOver(); // too hungry to play
		d.fetch(); // too hungry to play
		d.bark();
		boolean b;
		b = d.eat("Poop"); // the dog should eat
		System.out.println("b = " + b + " (should be true).");
		b = d.eat("CHICKEN"); // the dog is not hungry and doesn't eat
		System.out.println("b = " + b + " (should be false).");
		d.bark();
		// the dog can play 5 times
		d.fetch();
		d.rollOver();
		d.fetch();
		d.fetch();
		d.rollOver();
		d.fetch(); // the dog is too hungry
		b = d.eat("CHICKEN"); // the dog doesn't eat
		System.out.println("b = " + b + " (should be false).");
		b = d.eat("Beef"); // the dog eats
		System.out.println("b = " + b + " (should be true).");
		d.contemplateExpansion();
		d.fetch();
		d.fetch();
		d.contemplateExpansion();
		d.yellAt("bad");
		d.yellAt("bad");
		d.yellAt("bad");
		d.yellAt("bad");
		d.yellAt("bad");

		d.yellAt("bad");
		d.rollOver();
		d.yellAt("good");
		d.timewee();
	}

}
