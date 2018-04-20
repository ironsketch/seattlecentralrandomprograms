
public class FancyCar extends Car{
	private double topSpeed;
	
	public FancyCar(String make, double weight, double topSpeed){
		super (make, weight);
		this.topSpeed = topSpeed;
	}
	
	@Override
	public String toString(){
		return super.toString() + " topSpeed = " + topSpeed;
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof FancyCar){
			FancyCar fc = (FancyCar) obj;
			return super.equals(obj) && fc.topSpeed == this.topSpeed;
		}
		else{
			return false;
		}
	}

}
