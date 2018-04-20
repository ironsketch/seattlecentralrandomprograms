
public class Car implements Cloneable {
	private String make;
	private double weight;
	
	public Car(String make, double weight){
		this.make = make;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "make = " + make + ", weight = " + weight;
	}
	
	@Override
	public boolean equals(Object obj) {
		//if (obj instanceof Car){ -> not good if car is inherited
		if (obj != null && obj.getClass() == this.getClass()){
			Car c = (Car) obj;
			return this.make.equals(c.make) && this.weight == c.weight;
		}
		return false;
	}
	
	//returns a shallow copy
	public Car shallowCopy(){
		return new Car(this.make, this.weight);
	}
	
	//returns a DEEP copy
	public Car deepCopy(){
		double weight = this.weight;
		// create a copy of the string -> not needed since 
		//string class is immutable
		String make = new String(this.make);
		return new Car(make,weight);
	}
	
	//can also make copies by overiding clone from Object
	public Object clone(){
		try{
			return super.clone();
		} catch (CloneNotSupportedException e){
			//never get here
			// but compiler cant tell
			return null;Fath
			
		}
	}
}
