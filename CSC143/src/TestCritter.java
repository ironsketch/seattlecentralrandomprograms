public class TestCritter {
	// Write description of and sound produced by Critter c.
	public static void writeInfo(Critter c) {
		c.describe();
		c.speak();
		// toString() returns a String description of the object
		System.out.println(c); // same as System.out.println(c.toString());
		// getClass() returns a description of the dynamic type of the variable
		System.out.println("Dynamic type = " + c.getClass());
		// instanceof checks if there is an is_a relationship between the
		// dynamic
		// type of c and Trainable
		if (c instanceof Trainable) {
			Trainable t = (Trainable) c;
			t.fetch();
			t.rollOver();
		}
		if (c instanceof Sellable) {
			Sellable s = (Sellable) c;
			System.out.println("Selling price = $" + s.getPrice());
		}
	}

	// Test critter classes
	public static void main(String[] args) {
		// Create a poodle, a buffalo, a cow and a bird
		Critter[] a = { new Poodle(), new Cow(), new Buffalo() };
		// Call writeInfo for each critter
		// to iterate over an array
		// use an index
		// for (int i = 0; i < a.length; i ++) {
		// Critter c = a[i];
		// }
		// for-each loop: same as above but doesn't use an index -> less likely
		// to
		// make an error
		for (Critter c : a) {
			writeInfo(c);
			System.out.println();
		}
	}
}