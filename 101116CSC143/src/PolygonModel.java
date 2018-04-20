import java.awt.Color;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * The keeper of the data -> vertices and color of the polygon
 * 
 * @author open
 *
 */
public class PolygonModel {
	private Color color;
	private int[] x, y;
	private List<View> views = new ArrayList<View>();

	// Dimensions of the area where the polygon is drawn
	private int height, width;

	// random number generator
	private static Random rand = new Random();

	/**
	 * Adds a view to the model
	 */
	public void addView(View view) {
		views.add(view);
		view.update(this);
	}

	/**
	 * Updates all of the views
	 */
	public void updateView() {
		for (View view : views) {
			view.update(this);
		}
	}

	/**
	 * Creates a new polygon
	 */
	public void createPolygon() {
		// number of points
		int n = 5 + rand.nextInt(11);
		// vertices of the polygon
		x = new int[n];
		y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = rand.nextInt(width);
			y[i] = rand.nextInt(height);
		}
		// color of the polygon
		color = new Color(rand.nextInt());
		
		// the data has changed -> notify the views
		updateView();
	}

	/**
	 * Sets the dimensions of the polygon area
	 */
	public void setArea(int width, int height) {
		if (width >= 0 && height >= 0) {
			this.width = width;
			this.height = height;
		}
	}
	
	/**
	 * Returns the current polygon 
	 */
	public Polygon getPolygon() {
		// x and y can't be modified when passed to the Polygon constructor
		// -> it is safe to use the Polygon class
		return new Polygon(x,y,x.length);
	}
	
	/**
	 * Returns the color of the polygon
	 */
	public Color getColor() {
		// return the original color is OK since Color is immutable
		return color;
	}
}












