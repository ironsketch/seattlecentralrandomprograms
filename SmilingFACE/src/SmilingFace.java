import uwcse.graphics.*;
import java.awt.Color;

/**
 * A smiling face in a graphics window
 */

public class SmilingFace {

	// The graphics window
	private GWindow window;

	// Location of the face
	private int x, y;

	// Scale used to draw the face
	private double scale;

	/**
	 * Draw a smiling face in a graphics window
	 * 
	 * @param x
	 *            the x coordinate of the center of the face
	 * @param y
	 *            the y coordinate of the center of the face
	 * @param scale
	 *            the multiplication factor for all default sizes
	 * @param window
	 *            the graphics window where to draw
	 */
	public SmilingFace(int x, int y, double scale, GWindow window) {
		// Initialize the instance fields
		this.window = window;
		this.x = x;
		this.y = y;
		this.scale = scale;
		// Draw the face in the window
		drawFace();
	}

	/**
	 * Draw the face in the graphics window
	 */
	private void drawFace() {
		// The face (a circle: default radius = 50)
		Oval face = new Oval(x,y,x+(int)(50*this.scale),y+(int)(50*this.scale), Color.yellow, true);
		window.add(face);
		// The mouth (use drawMouth)
		drawMouth(x,y);
		// The eyes (use drawEye)
		// left
		drawEye(x,y,x);
		// right
		drawEye(x,y,x+(int)(70*this.scale));
		// The nose (use drawNose)
		drawNose(x,y);
		// text
		TextShape scary = new TextShape("I can hear them...",x+(int)(80*this.scale),
				y-(int)(10*this.scale));
		scary.addTo(window);
		
	}

	/**
	 * Draw an eye
	 * 
	 * @param eyex
	 *            the x coordinate of the center of the eye
	 * @param eyey
	 *            the y coordinate of the center of the eye
	 */
	private void drawEye(int eyex, int eyey, int left) {
		// A black circle in a white oval
		Oval eyeBack = new Oval(left+(int)(15*this.scale),eyey+(int)(26*this.scale),
				eyex-(int)(50*this.scale),eyey-(int)(50*this.scale), Color.black, true);
		eyeBack.addTo(window);
		Oval eye = new Oval(left+(int)(15*this.scale),eyey+(int)(22*this.scale),
				eyex-(int)(50*this.scale),eyey-(int)(50*this.scale), Color.white, true);
		eye.addTo(window);
		Oval pupil = new Oval(left+(int)(45*this.scale),eyey+(int)(30*this.scale),
				eyex-(int)(90*this.scale),eyey-(int)(90*this.scale), Color.black, true);
		pupil.addTo(window);
	}

	/**
	 * Draw a nose
	 * 
	 * @param nx
	 *            the x coordinate of the top point of the nose
	 * @param ny
	 *            the y coordinate of the top point of the nose
	 */
	private void drawNose(int nx, int ny) {
		// A nose is a triangle
		Triangle nose1 = new Triangle(nx+(int)(66*this.scale),ny+(int)(80*this.scale),
				 nx+(int)(72*this.scale),ny+(int)(76*this.scale),
				 nx+(int)(78*this.scale),ny+(int)(80*this.scale),
				 Color.black,true);
		nose1.addTo(window);
		Triangle nose2 = new Triangle(nx+(int)(80*this.scale),ny+(int)(80*this.scale),
				 nx+(int)(84*this.scale),ny+(int)(76*this.scale),
				 nx+(int)(92*this.scale),ny+(int)(80*this.scale),
				 Color.black,true);
		nose2.addTo(window);
		Oval booger = new Oval(nx+(int)(80*this.scale),ny+(int)(78*this.scale),
				nx-(int)(90*this.scale),ny-(int)(90*this.scale), Color.green, true);
		booger.addTo(window);
	}

	/**
	 * Draw a mouth
	 * 
	 * @param mouthx
	 *            the x coordinate of the middle bottom point of the mouth
	 * @param mouthy
	 *            the y coordinate of the middle bottom point of the mouth
	 */
	private void drawMouth(int mouthx, int mouthy) {
		// Draw two circles (one black and one yellow)
		// The yellow circle is on top of the black circle and slightly shifted
		// up
		Oval topMouth = new Oval(mouthx+(int)(17*this.scale),mouthy+(int)(17*this.scale),
				mouthx+(int)(15*this.scale),y+(int)(15*this.scale), Color.black, true);
		topMouth.addTo(window);
		Oval topMouth2 = new Oval(mouthx+(int)(17*this.scale),mouthy+(int)(14*this.scale),
				mouthx+(int)(15*this.scale),y+(int)(15*this.scale), Color.yellow, true);
		topMouth2.addTo(window);
	}
}