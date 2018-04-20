import uwcse.graphics.*; // access the graphics utilities in the uw library
import java.awt.Color; // access the Color class

/**
 * <p>
 * A FaceScene displays smiling faces in a graphics window
 * </p>
 * 
 * @author Your name here
 */

public class FaceScene {

	/**
	 * Creates a picture
	 */
	public FaceScene() {

		// The graphics window
		// The window is by default 500 wide and 400 high
		GWindow w = new GWindow();
		// Exit when closing the window
		w.setExitOnClose();
		// Background (e.g. cyan)
		Rectangle bgnd = new Rectangle(0, 0, w.getWindowWidth(), w.getWindowHeight(), Color.lightGray, true);
		w.add(bgnd);
		// Create the scene elements
		// e.g. a face in the lower area 1.5 times the normal size
		new SmilingFace(100,100,1,w);
		new SmilingFace(50,50,.5,w);
		new SmilingFace(200,200,2,w);
		
	}

	/**
	 * Starts the application
	 */
	public static void main(String[] args) {
		new FaceScene();
	}
}