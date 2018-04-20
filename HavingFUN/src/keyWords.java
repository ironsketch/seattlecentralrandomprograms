import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class keyWords {
	/* Write a method, keywordCount, that takes an ArrayList of Strings, listOfStrings, 
	 * and a String, keyword, and that returns the number of times the String keyword 
	 * appears in all of the Strings of listOfStrings.
	 * For instance if listOfStrings contains ["The classification of cats", "staccato", 
	 * "catamaran", "the caterpillar and the bobcat"] and if keyword is "cat", then the call 
	 * keywordCount(listOfStrings, keyword) would return 6 since the string "cat" appears 6 
	 * times in all of the strings listed in listOfStrings. You may use any method from the 
	 * String class in your solution (a good one for this problem is indexOf).*/
	
	public keyWords(){
		ArrayList<String> x = new ArrayList<String>(Arrays.asList("The classification of cats", "staccato", "catamaran", "the caterpillar and the bobcat"));
		System.out.println(keywordCount(x,"cat"));
	}
	
	public int keywordCount(ArrayList<String> listOfStrings, String keyword){
		int counter = 0;
		for (int i = 0; i < listOfStrings.size(); i++){
			if (listOfStrings.get(i).length() >= keyword.length()){
				for (int j = 0; j <= (listOfStrings.get(i).length() - keyword.length()); j++){
					if (keyword.equals(listOfStrings.get(i).substring(j, keyword.length() + j))){
						counter++;
					}
				}
			}
		}
		return counter;
	}
	
	public static void main(String[] args) {
		new keyWords();
	}

}
