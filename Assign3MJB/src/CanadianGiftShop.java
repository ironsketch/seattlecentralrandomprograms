import uwcse.io.Input; // use the Input class
import java.text.DecimalFormat; // to format the output
import java.util.Scanner;

/**
 * Homework 3 <br>
 * Simulating a purchase in Canada paid in US dollars
 * 
 * @author Michelle J Bergin
 */

public class CanadianGiftShop {

	// Constants
		/** Exchange rate 1 US dollar = RATE Canadian dollar */
	public final double RATE = 1.16;

		/** Price of a jar of maple syrup in Canadian dollars before taxes */
	public final double JAR_PRICE = 5.95;

		/**
		 * Price of photograph of the city of Victoria in Canadian dollars before
		 * taxes
		 */
	public final double PHOTO_PRICE = 7.65;

		/** Price of a beaver hat in Canadian dollars before taxes */
	public final double HAT_PRICE = 16.35;

		/** Maximum allowed number of purchased items for each item */
	public final int MAX_ITEM = 100;

		/** Tax rate */
	public final double TAX_RATE = 0.093;

	// Array of items purchased and amount
	private int[] = 
	private int jarNumber = 101;

	// number of purchased photographs of the city of Victoria
	private int photoNumber = 101;

	// number of purchased beaver hats
	private int hatNumber = 101;
	
	// Formatting
	private String formatted = "%1$s %2$.2f\n";
	private String mapleSyrupFORMAT = "Maple Syrup : \t\tCAD ";
	private String beaverHatFORMAT = "Beaver Hat : \t\tCAD ";
	private String photoFORMAT = "Photo of Victoria : \tCAD ";

	// 2 digits after the decimal point for doubles
	private DecimalFormat twoDigits = new DecimalFormat("0.00");
	

	/**
	 * Takes and processes the order from the customer
	 */
	public void takeAndProcessOrder() {
		// Here is a possible series of steps: call some other (private)
		// methods to do each step.
		
		// Display the items and their prices
		itemList();
		// Get the Customer's order
		input();
		// Get the user's USD payment

		// Give the change back in Canadian dollars
	}

	// Some ideas for some private methods
	// You don't have to use exactly these same methods.

	/**
	 * Displays the items for sale and their prices in Canadian dollars
	 */
	private void itemList() {
		System.out.println("Available to purchase:");
		System.out.format(this.formatted, this.mapleSyrupFORMAT, this.JAR_PRICE);
		System.out.format(this.formatted, this.beaverHatFORMAT, this.HAT_PRICE);
		System.out.format(this.formatted, this.photoFORMAT, this.PHOTO_PRICE);
		
	}

	/**
	 * Gets the customer's order Precondition: none Postcondition: jarNumber,
	 * photoNumber and hatNumber are initialized to a value between 0 and
	 * MAX_ITEM
	 */
	private void input() {
		System.out.println("How many of each of the following would you like to purchase? (0 to 100)");
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		if (this.jarNumber==101){
			System.out.format(this.formatted, this.mapleSyrupFORMAT, this.JAR_PRICE);
			int n = reader.nextInt();
			updateQuantity((n>=0 && n<=100),this.jarNumber,(int)(n));
			System.out.println(this.jarNumber);
		}
	}
	
	private void updateQuantity(boolean range,int jarN, int entered){
		if (range==true){
			jarN = entered;
			System.out.println(jarN + " " + this.jarNumber);
			input();
		}
		else{
			input();
		}
	}

	/**
	 * Given a purchase in canadian dollars and a payment in US dollars,
	 * displays the change amount in canadian dollars and cents
	 * 
	 * @param payUS
	 *            payment in US dollars
	 * @param costCA
	 *            purchase amount in Canadia dollars
	 */
	private void changeinCAD(double payUS, double costCA) {
		
	}

	/**
	 * Entry point of the program
	 */
	public static void main(String[] args) {
		new CanadianGiftShop().takeAndProcessOrder();
	}

}
