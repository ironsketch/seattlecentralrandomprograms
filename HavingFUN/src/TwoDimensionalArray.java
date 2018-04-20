import java.text.DecimalFormat; // for formatting

/**
 * A class to illustrate the use of a 2D array.<br>
 * The methods of the class initialize a 2D array, namely
 * an array to store the daily rainfall amount over 3 months. The
 * monthly rainfall average is computed.
 */

public class TwoDimensionalArray{

    /**
     * Initialize a 2D array to store the daily rainfall over
     * a 3 months period (namely April, May and June). Do initialization
     * in a private method (assign to each element a random double between
     * 0 and 10).<br>
     * Then, compute and print the monthly rainfall average.
     */
	public TwoDimensionalArray(){
		processRainfall();
	}
    public void processRainfall(){
        // Store in an array the daily rainfall
        // over a period of 3 months (April, May, June)
        // rainfall should be an array of 3 1D arrays (each 1D array
        // is of size 30, 31 and 30).
        double[][] rainfall;
        System.out.println("meow");
        // Initialize the array
        rainfall = new double[3][];
        rainfall[0] = new double[30];
        rainfall[1] = new double[31];
        rainfall[2] = new double[30];
        // (call fillRandomly)
        
        fillRandomly(rainfall);

        // Compute and print the average rainfall for each month
        // (call computeAndPrintMonthlyAverage)
        computeAndPrintMonthlyAverage(rainfall);
    }

    /**
     * Initialize the elements of a 2D array with a random double between
     * 0 and 10.
     * @param rainfall the array to initialize
     */
    public double randomInt(){
    	double randNum = (double) (Math.random( )*10);
    	return randNum;
    }
    private void fillRandomly(double[][] rainfall)
    {
        // Fill randomly the array with a random value between 0 and 10
    	for (int i=0;i<rainfall.length;i++){
    		for (int j=0;j<rainfall[i].length;j++){
    			rainfall[i][j] = randomInt();
    		}
    	}
    	
    }

    /**
     * Compute and print the monthly rainfall average
     * @param rainfall the array to average
     */
    private void computeAndPrintMonthlyAverage(double[][] rainfall)
    {
    	double averageMonth = 0;
    	for (int i=0;i<rainfall.length;i++){
    		for (int j=0;j<rainfall[i].length;j++){
    			averageMonth += rainfall[i][j];
    		}
    		System.out.println(averageMonth / rainfall[i].length);
    		averageMonth = 0;
    	}
    }
    public static void main(String[] args) {
		new TwoDimensionalArray();
	}
}

