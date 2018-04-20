/**
 * A simple model of a dog
 * 
 * @author CSC 142
 * 
 */
public class Dog {
	
	// A dog has a name and may be hungry
	private String name;
	private boolean isHungry;
	private int moral;
	private int playCount;
	private int yellLimits;
	private int foodLimits;
	private int timerr;
	
	// the food last eaten
	private String prevFood;
	
	// counter for the number of times the dog plays fetch
	private int count;

	/**
	 * Creates a dog given its name. The dog is initially hungry.
	 * 
	 * @param name
	 *            the name of the dog
	 */
	public Dog(String name, int flimit, int ylimit) {
		this.name = name;
		this.foodLimits = flimit;
		this.yellLimits = ylimit;
		this.isHungry = true;
		this.timerr = 6789;
		
	}
	public void timewee(){
		int days = timerr / 86400;
		this.timerr = timerr % 86400;
		int hours = timerr / 3600;
		this.timerr = timerr % 3600;
		int minutes = timerr / 60;
		this.timerr = timerr % 60;
		int seconds = timerr;
		System.out.println(days + " days " + hours + " hours " + minutes + " minutes " + seconds + " seconds");
	}
	

	/**
	 * Prints WOOF if the dog is hungry and woof if not
	 */
	public void bark() {
		if (isHungry) { // better style than isHungry == true
			System.out.println("WOOF FEED ME");
			moral--;
		} else {
			System.out.println("woof");
		}
	}
	public void yellAt(String word) {
		if(playCount < this.yellLimits){
			if(moral > 0){
				if (word == "bad") { 
					System.out.println("Dog looks sad");
					System.out.println();
					moral--;
					playCount++;
				}
				else{
					System.out.println("Dog wags tail");
					moral++;
					playCount++;
				}
				
			} else {
				System.out.println("My moral is too low... play with me to continue");
			}
		}
		else{
			System.out.println("You can't yell at me anymore!");
		}
	}

	/**
	 * The dog eats if it is hungry and the food given to the dog is not the
	 * same as what was given for its previous meal.
	 * 
	 * @param food
	 *            the food given to the dog
	 * @return true if the dog eats and false if not
	 */
	public boolean eat(String food) {
		if (isHungry) {
			if (food.equals("Poop")){
				System.out.println("FUCK YOU I AM NOT EATING SHIT");
				moral--;
				return false;
			}
			else{
				if (!food.equals(prevFood)) {
					// don't use food != prevFood which compares addresses
					System.out.println("Yummy!");
					prevFood = food;
					isHungry = false;
					moral++;
					count = 0;
					playCount = 0;
					return true;
				} else {
					System.out.println("FUCK YOU I am not eating the same thing again!");
					return false;
				}
			}
		} else {
			System.out.println("Thank you. But I am not hungry.");
			return false;
		}
	}

	/**
	 * The dog plays fetch if it is not hungry. After fetching or rolling over 5
	 * times, the dog gets hungry.
	 */
	public void fetch() {
		if (isHungry) {
			System.out.println("FUCK YOU I'm hungry.");
			moral--;
		} else {
			System.out.println("I love to play fetch.");
			moral++;
			count++;
			if (count == this.foodLimits) {
				isHungry = true;
			}
		}
	}

	/**
	 * The dog rolls over if it is not hungry. After rolling over or fetching 5
	 * times, the dog gets hungry.
	 */
	public void rollOver() {
		if (isHungry) {
			System.out.println("FUCK YOU I'm hungry.");
			moral--;
		} else {
			System.out.println("I love to roll over.");
			count++;
			moral++;
			if (count == this.foodLimits) {
				isHungry = true;
			}
		}
	}
	public void contemplateExpansion() {
		System.out.println(count);
		if (isHungry) {
			System.out.println("I seriously need chips");
		} else if(count == 3){
			System.out.println("I smoked some weed man and I am HIGH as a kite.");
			moral++;
			count++;
			if (count == this.foodLimits) {
				isHungry = true;
			}
		}
		else{
			System.out.println("So like, if 1 = 1 and 2 = 2........");
			count++;
			if (count == this.foodLimits) {
				isHungry = true;
			}
		}
	}
}
