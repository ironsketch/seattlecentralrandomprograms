import java.util.StringTokenizer;

public class MOREFORLOOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String poop = "poop and caca, pee, waddle, arf. ....... meow";
		StringTokenizer st = new StringTokenizer(poop);
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}

}