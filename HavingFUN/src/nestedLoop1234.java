
public class nestedLoop1234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Write a nested loop code segment that produces this output:
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 * 1 2 3
		 * 1 2
		 * 1 
		 * inner x }{ outer y
		 * */
		
		for (int i = 6; i>= 0;i--){
			for (int j = 1; j <= (4 - Math.abs(3-i)); j++){
				System.out.print(j + " ");
			}
			System.out.println("");
		}

	}

}
