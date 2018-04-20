// A Poodle is a Critter that makes a noise of a Poodle

public class Poodle extends Critter implements Trainable, Sellable {
	// constructor
	public Poodle() {
		super("A poodle is a dog with a funny haircut.");
	}

	// We must override speak if we want Poodle to be instantiated
	@Override
	public void speak() {
		System.out.println("Woof, woof. Take me to the park!");
	}

	// Poodle must implement the abstract methods inherited from Trainable
	@Override
	public void rollOver() {
		System.out.println("roll over!");
	}

	@Override
	public void fetch() {
		System.out.println("I love to play fetch.");
	}

	@Override
	public double getPrice() {
		return 500;
	}
}