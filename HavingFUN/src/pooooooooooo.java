import java.util.Random;

public class pooooooooooo {
	
	public pooooooooooo(){
		poop(999);
		poop(123456789);
		poop(99);
		poop(0);
		poop(9339);
	}

	public static void main(String[] args) {
		new pooooooooooo();
		
		
	}
	public void poop(int num){
		int cunt = 0;
		String finalString = "";
		do{
			if (cunt == 3){
				finalString = "," + finalString;
				cunt = 0;
			}
			finalString = num % 10 + finalString;
			num /=10;
			
			cunt++;
			
		} while(num > 0);
		System.out.println(finalString);
	}

}
