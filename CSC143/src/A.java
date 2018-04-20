import java.awt.Color;
import java.util.Random;

public class A {
	private int i;
	private Color c;
	
	private static Random rand = new Random();
	
	public A(){
		i = rand.nextInt(1000);
		c = new Color(rand.nextInt());
	}
	
	@Override
	public String toString(){
		return "i = " + i + ", c =" + c;
	}
	
	public A copy(){
		A copy = new A();
		copy.i = this.i;
		copy.c = this.c;
		return copy;
	}
	
	//a setter for the field i
	public void setI(int i){
		this.i = i;
	}
	
	//a setter for the Color c
	public void setC(Color c){
		this.c = c;
	}
}
