
public class countCharshit {
	public countCharshit(){
		int theCounter = countChar("aa123abdae6",'a');
		System.out.println(theCounter);
	}
	
	public static void main(String[] args) {
		new countCharshit();
	}
	
	public int countChar(String origString, char singleChar){
		int counter = 0;
		for (int i = 0; i < origString.length(); i++){
			if (origString.charAt(i) == singleChar){
				counter++;
			}
		}
		return counter;
	}

}
