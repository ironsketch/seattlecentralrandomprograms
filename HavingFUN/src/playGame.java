import java.util.Scanner;

public class playGame {
	public static void main(String[] args) {
		int userInput = 100;
		// TODO Auto-generated method stub
		int gameNumber = (int)(Math.random( )*20);
		do{
			Scanner reader = new Scanner(System.in);  // Reading from System.in
			System.out.println("Enter a number: ");
			int input = reader.nextInt();
			userInput = input;
		} while(userInput!=gameNumber);
		System.out.println("You finally won. It was " + gameNumber);
	}

}
