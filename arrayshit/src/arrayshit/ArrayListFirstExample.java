package arrayshit;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * A first view of the ArrayList class
 * 
 * @author CSC 142
 * 
 */
public class ArrayListFirstExample {
	public static void main(String[] args) {
		// input names
		// find the shortest and the longest name
		ArrayList<String> states = new ArrayList<String>();

		Scanner scan = new Scanner(System.in);
		do {
			System.out
					.print("Enter the name of a state (or just press enter to end the input): ");
			String state = scan.nextLine();
			if (state.length() > 0) {
				states.add(format(state));
			} else {
				break;
			}
		} while (true);

		// release any resource not used anymore
		scan.close();

		// print the full ArrayList
		// as [Alaska, Washington, Oregon]
		print(states);
		// writing a print method is not needed since the 
		// functionality is already available
		System.out.println(states);
		// same as System.out.println(states.toString());

		// find the shortest and longest strings
		String longest = states.get(0);
		String shortest = states.get(0);
		for (int i = 1; i < states.size(); i++) {
			String state = states.get(i);
			if (state.length() > longest.length()) {
				longest = state;
			}
			if (state.length() < shortest.length()) {
				shortest = state;
			}
		}

		System.out.println("Longest string = " + longest);
		System.out.println("Shortest string = " + shortest);
	}

	/**
	 * Takes a string s and returns a string equal to s with the first letter
	 * capitalized and the rest lowercase (if s is ALAska, Alaska is returned)
	 */
	public static String format(String s) {
		// first remove the leading and trailing whitespaces
		s = s.trim();

		// don't format an empty string
		if (s.length() == 0) {
			return s;
		}
		// 1st way
		// look at every character in s and copy them in the new string
		// following the required format
		// use Character.toLowerLase and Character.toUpperCase
		String r = "" + Character.toUpperCase(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			r += Character.toLowerCase(s.charAt(i));
		}
		return r;

		// 2nd way
		// return Character.toUpperCase(s.charAt(0)) +
		// s.substring(1).toLowerCase();
	}

	/**
	 * prints the contents of the given ArrayList e.g. [Alaska, Washington,
	 * Oregon]
	 */
	public static void print(ArrayList<String> a) {
		System.out.print("[");
		// special case for the last element (no ", " after it)
		// -> fencepost problem
		for (int i = 0; i <= a.size() - 2; i++) {
			System.out.print(a.get(i) + ", ");
		}
		if (a.size() > 0) { // would crash if a was empty
			System.out.print(a.get(a.size() - 1));
		}
		System.out.println("]");
	}
}
