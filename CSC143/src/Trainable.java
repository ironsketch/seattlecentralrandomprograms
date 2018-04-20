
public interface Trainable {
	// an interface only contains
	// public abstract methods
	// and constants (= public static final fields)
	
	// an interface defines a type
	// Trainable t; // OK
	// an interface CANNOT be instantiated
	// new Trainable(); // NO!
	
	// public abstract are implicitly implied
	void rollOver();
	void fetch();
}