
public class iteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		while (i<101){
			sum += i;
			i++;
			System.out.format("%1$d ",sum);
			if (i%20==0){
				System.out.println("\n");
			}
		}
	}

}
