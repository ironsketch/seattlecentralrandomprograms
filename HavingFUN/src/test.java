
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String finalString = "";
		int num = 9;
		int commaCounter = 0;
		int decimalCounter1 = 0;
		int decimalCounter2 = 3;
		
		do {
			if (decimalCounter1 == 2){
				finalString = "." + finalString;
				decimalCounter1 = 4;
			}
			finalString = num % 10 + finalString;
			num /= 10;
			decimalCounter1++;
			decimalCounter2--;}while(decimalCounter2!=0);
		commaCounter++;
		if (num!=0){
			do{
				if(commaCounter == 3){
					finalString = "," + finalString;
					commaCounter = 0;
				}
				finalString = num % 10 + finalString;
				num /= 10;
				commaCounter ++;}while(num!=0);
			}
		System.out.println("$"+finalString);
		}
	

	}


