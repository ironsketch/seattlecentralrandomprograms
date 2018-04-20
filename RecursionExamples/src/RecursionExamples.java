
public class RecursionExamples {

	public static void main(String[] args) {
		
		towersOfHanoi(4,3,2,1);
		
//		System.out.println(isPalendromeWithRecursion("radar"));
//		System.out.println(isPalendromeWithRecursion("wasitacatisaw"));
//		System.out.println(isPalendromeWithRecursion("abc"));
//		System.out.println(isPalendromeWithRecursion("a"));
//		System.out.println(isPalendromeWithRecursion(""));
//		System.out.println("-------------------------");
//		System.out.println(isPalendromeWithLoop("radar"));
//		System.out.println(isPalendromeWithLoop("wasitacatisaw"));
//		System.out.println(isPalendromeWithLoop("abc"));
//		System.out.println(isPalendromeWithLoop("a"));
//		System.out.println(isPalendromeWithLoop(""));
	}
		// Returns true if s is a palindrome
		public static boolean isPalendromeWithRecursion(String s){
			// base case: s has no or 1 char
			if(s.length() <= 1){
				return true;
			}
			else{
				char c1 = s.charAt(0); // first char
				char c2 = s.charAt(s.length() - 1); // last char
				return c1 == c2 && isPalendromeWithRecursion(s.substring(1, s.length() - 1));
//				if (c1 != c2){
//					return false;
//				}
//				else{
//					String inner = s.substring(1, s.length() - 1);
//					return isPalendrome(inner);
//				}
				}
		}
		public static boolean isPalendromeWithLoop(String s){
			int i = 0;
			int j = s.length() - 1;
			while(i < j){
				if (s.charAt(i) != s.charAt(j)){
					return false;
				}
				i++;
				j++;
			}
			return true;
		}
		
		//Towers of Hanoi : Move n disks from left to right peg
		public static void towersOfHanoi(int n, int pLeft, int pMid, int pRight){
			// base case: n = 1
			if(n == 1){
				System.out.println("Move top disk from " + pLeft + " to " + pRight);
			} else{
				towersOfHanoi(n-1, pLeft, pRight, pMid);
				towersOfHanoi(1,pLeft,pMid,pRight);
				towersOfHanoi(n-1, pMid, pLeft, pRight);
			}
			
		}
}
