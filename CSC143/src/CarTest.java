
public class CarTest {
	public static void main(String[] args){
		Car c1 = new Car("Ford", 2000);
		System.out.println(c1);
		//Same as -> System.out.println(c.toString());
		// if using toString from Object, get something like Car@1540e19d
		
		// Equals
		Car c2 = new Car("Ford", 2000);
		System.out.println("c1.equals(null) is " + c1.equals(null));
		System.out.println("c1.equals(c1) is " + c1.equals(c1));
		System.out.println("c1.equals(c2) is " + c1.equals(c2));
		System.out.println();
		
		FancyCar fc1 = new FancyCar("Ford", 2000, 180);
		FancyCar fc2 = new FancyCar("Ford", 2000, 180);
		System.out.println("fc1.equals(fc1) is " + fc1.equals(fc1));
		System.out.println("fc1.equals(fc2) is " + fc1.equals(fc2));
		System.out.println();
		
		System.out.println("fc1.equals(c1) is " + fc1.equals(c1));
		System.out.println("c1.equals(fc1) is " + c1.equals(fc1));

		// The String class is immutable
		// Once a string is created it cannot be changed
		String s = "ABC";
		s.toLowerCase();
		System.out.println(s);
	}

}
