import java.util.Scanner;

/**
 * Homework 3 
 * Simulating a purchase in Canada paid in US dollars
 * 
 * @author Michelle J Bergin
 */
public class CanadianGiftShop {
	
	// Constants
	public final double RATE = 1.16; // Exchange rate 1 US dollar = RATE Canadian dollar
	
	private double[][] pricesAndQuantity ={{9000,5.95},{9000,7.65},{9000,16.35}}; // Prices and order quantity
	private String[] names = {"Jar of Maple Syrup","Photograph of the City","Beaver Hat\t"}; // names of items
	private double total = 0; // total for customer
	private double tax = 0; // tax for purchase
	
	public final double TAX_RATE = 0.093; // Tax rate
	
	// Formatting
	private String formatted = "%1$s %2$s %3$.2f\n"; // formatting
	private String CADTABFORMAT = "\t\tCAD "; //tabs and CAD (canadian dollars)
	
	public void takeAndProcessOrder() {
		// Display the items and their prices
		itemList();
		// Get the Customer's order
		input();
		totalCost();
		System.out.println("Please type in US currency your total payment");
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		double n = reader.nextDouble();
		changeinCAD(n, total);
		
	}
	
	private void itemList() {
		System.out.println("Available to purchase:");
		System.out.format(this.formatted, names[0],CADTABFORMAT, pricesAndQuantity[0][1]);
		System.out.format(this.formatted, names[1],CADTABFORMAT, pricesAndQuantity[1][1]);
		System.out.format(this.formatted, names[2],CADTABFORMAT, pricesAndQuantity[2][1]);
		System.out.println("\n\nHow many of each of the following would you like to purchase? (0 to 100)");
	}
	private void input() {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		for (int i=0;i<pricesAndQuantity.length;i++){
			if (pricesAndQuantity[i][0]==9000){
				System.out.format(this.formatted, names[i],CADTABFORMAT, pricesAndQuantity[i][1]);
				int n = reader.nextInt();
				updateQuantity((n>=0 && n<=100),(int)(pricesAndQuantity[i][0]),(int)(n),i);
			}
		}
	}
	
	private void updateQuantity(boolean valid,int jarN, int entered, int i){
		if (valid==true){
			pricesAndQuantity[i][0] = entered;
			input();
		}
		else{
			pricesAndQuantity[i][0] = 0;
			input();
		}
	}
	
	private void totalCost(){
		for(int i = 0;i<pricesAndQuantity.length;i++){
			this.total += pricesAndQuantity[i][0] * pricesAndQuantity[i][1];
		}
		this.tax = total * TAX_RATE;
		this.total += tax;
	}
	
	private void changeinCAD(double payUS, double costCA) {
		double payCAD = payUS * RATE;
		
		System.out.println(payCAD + " " + RATE + " " + payUS);
		if (payCAD >= costCA){
			System.out.println("\nCANADA IMPORTS INC");
			System.out.println("---------------------------------");
			System.out.println("You paid: "+ payUS+ " in US $.");
			for (int i=0;i<pricesAndQuantity.length;i++){
				double itemtotal = pricesAndQuantity[i][0] * pricesAndQuantity[i][1];
				System.out.format("%1$.0f %2$s %3$s\t %4$.2f\t %5$.2f\n",pricesAndQuantity[i][0], " x ",names[i],pricesAndQuantity[i][1],itemtotal);
			}
			System.out.format("%1$s %2$.2f\n","Applicable taxes: ",tax);
			System.out.format("%1$s %2$.2f %3$s %4$.2f\n","Total Cost: ",total," Total paid in CAD: ",payCAD);
			System.out.println("---------------------------------");
			changeLeftOver(payCAD - total);
		}
		else{
			System.out.println("Not enough money. DO NOT ROB ME!");
			System.exit(0);
		}
	}
	// calculates and displays all change left over and given to customer
	private void changeLeftOver(double leftOver){
		System.out.format("%1$s %2$.2f\n","Your change: ",leftOver);
		int TWENTIES = (int)(leftOver/20);
		leftOver %= 20;
		int TEN = (int)(leftOver/10);
		leftOver %= 10;
		int FIVE = (int)(leftOver/5);
		leftOver %= 5;
		int ONES = (int)(leftOver/1);
		leftOver %= 1;
		leftOver*=100;
		int CENTS25 = (int)(leftOver/25);
		leftOver %= 25;
		int CENTS10 = (int)(leftOver/10);
		leftOver %= 10;
		int CENTS05 = (int)(leftOver/5);
		leftOver %= 5;
		int CENTS01 = (int)(leftOver/1);

		System.out.println(TWENTIES+" twenty dollar bill"+billCoins(TWENTIES));
		System.out.println(TEN+" ten dollar bill");
		System.out.println(FIVE+" five dollar bill");
		System.out.println(ONES+" one dollar bill"+billCoins(ONES));
		System.out.println(CENTS25+" 25 cent coin"+billCoins(CENTS25));
		System.out.println(CENTS10+" 10 cent coin"+billCoins(CENTS10));
		System.out.println(CENTS05+" 5 cent coin");
		System.out.println(CENTS01+" 1 cent coin"+billCoins(CENTS01));
	}
	
	private char billCoins(int amount){
		if (amount/1>1){
			return 's';
		}
		return ' ';
	}
		
	public static void main(String[] args) {
		new CanadianGiftShop().takeAndProcessOrder();
	}
}
