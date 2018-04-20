
public class FinalTest {
	
	public FinalTest(){
		int[] intArray = {2,5,6,-3,10,18,13,16,18,20,32,44,16,18,3,5,11,-7};
		poop(intArray,8);
	}
	public void poop(int[] a, int n){
		int[] result = new int[n];
		int x;
		for (int i = 0; i < a.length; i++){
			System.out.println(i/n + " " + i/n % 2 + " f " + 0%8);
			if (i/n % 2 == 0){
				 x = n - (i % n) - 1;
				 System.out.println(x + " n - (i % n) - 1 " + i%n);
			}
			else{ x = i; System.out.println(x);}
			result[x%n] += a[i];
			System.out.println(x%n + " x % n");
		}
		for (int i = 0; i < a.length; i++){
			System.out.println(result[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FinalTest();
		
	}

}
