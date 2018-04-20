
public class sumOfThings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*If we list all the positive integers less than 10 that are multiples of 3 or 5, 
		 * we get 3, 5, 6 and 9. The sum of these multiples is 23. Write a loop that finds 
		 * the sum of all the positive integers less than 1000 that are multiples of 3 or 5. 
		 * Run the code in Eclipse and give the answer that you find.
		 */
		int counter = 0;
		for (int i = 0; i< 1000;i++){
			if ((i%3 == 0)||(i%5 == 0)){
				counter += i;
			}
		}
		System.out.println(counter);
	}

}
