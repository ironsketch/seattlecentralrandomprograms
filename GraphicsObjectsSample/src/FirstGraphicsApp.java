import java.awt.Color;

import uwcse.graphics.GWindow;
import uwcse.graphics.Line;
import uwcse.graphics.Oval;
import uwcse.graphics.Polygon;
import uwcse.graphics.Rectangle;

/**
 * A first view of graphics with the UW library
 * 
 * @author CSC 142
 * 
 */
public class FirstGraphicsApp {

	/**
	 * Creates a graphics window and adds shapes to it
	 */
	public static void main(String[] args) {
		GWindow w = new GWindow();
		Rectangle r = new Rectangle(100, 50, 150, 75, 
				Color.BLUE, true);
		w.add(r);
		Oval o = new Oval(250, 300, 50, 100, Color.RED, false);
		w.add(o);
		Line l = new Line(0, 0, w.getWindowWidth(), 
				          w.getWindowHeight(), Color.GREEN);
		w.add(l);
		Polygon p = new Polygon(Color.YELLOW, true);
		p.addPoint(300, 50);
		p.addPoint(400, 150);
		p.addPoint(300, 150);
		p.addPoint(400, 50);
		w.add(p);
	}

}








