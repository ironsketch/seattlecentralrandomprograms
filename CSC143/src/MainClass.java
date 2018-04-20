
public class MainClass {

	public static void main(String[] args) {
		{
		A original = new A();
		A copy = original.copy();
		System.out.println("origina =" + original);
		System.out.println("copy = " +copy);
		copy.setI(20);
		System.out.println("original =" + original);
		System.out.println("copy = " + copy);
		}
		
		// with type B
		{
		B b = new B();
		B copy = b.copy();
		}
		
	}

}
