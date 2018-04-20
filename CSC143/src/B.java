
public class B {
	private A[] a;
	
	public B(){
		a = new A[1];
		a[0] = new A();
	}
	
	public B copy(){
		// shallow copy
		B copy = new B();
		copy.a = new A[this.a.length];
		for (int i = 0; i < copy.a.length;i++){
			copy.a[i] = this.a[i].copy();
		}
		return copy;
	}
}
