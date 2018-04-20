import uwcse.graphics.*; // access the graphics utilities in the uw library
import java.awt.Color; // access the Color class

//A mountain scene with snowpeople, mountains, cablecars, trees, ornaments, and snow!
//@author Michelle Bergin

public class CableCar {
	
	// Setting up instances
	private GWindow window;
	private int x;
	private int y;
	private double scale;
	private Rectangle front;
	private Polygon carBody;
	private Polygon carWin1;
	private Polygon carWin2;
	private boolean cableMove = true;
	
	public CableCar(int x, int y, double scale, GWindow window){
	    
		// creates the instance fields
		this.window = window;
	    this.scale = scale;
	    this.x = x;
	    this.y = y;
	    
	    // The details of the drawing are in a private method
	    this.draw();
	    }
	
	// Drawing the cable car
	private void draw(){
		
		// Wires (will always fall off on either end of page to ensure completeness)
	    Line cable = new Line(this.x-(int)(100*this.scale),this.y-(int)(60*this.scale),this.x+window.getWindowWidth(),
			    this.y+350,Color.black);
	  
	    // Car
	    this.front = new Rectangle(this.x,this.y,
	    		(int)(20*this.scale),(int)(20*this.scale),Color.black,true);
	  
	    // Car Body Polygons were used to show perspective
	    this.carBody = new Polygon(Color.black,true);
	    carBody.addPoint(this.x+(int)(20*this.scale),this.y);
	    carBody.addPoint(this.x+(int)(30*this.scale),this.y+(int)(10*this.scale));
	    carBody.addPoint(this.x+(int)(30*this.scale), this.y+(int)(25*this.scale));
	    carBody.addPoint(this.x+(int)(15*this.scale), this.y+(int)(25*this.scale));
	    carBody.addPoint(this.x,this.y+(int)(20*this.scale));
	  
	    // Car Windows (Polygons)
	    this.carWin1 = new Polygon(Color.white,true);
	    carWin1.addPoint(this.x+(int)(21*this.scale),this.y+(int)(5*this.scale));
	    carWin1.addPoint(this.x+(int)(23*this.scale),this.y+(int)(7*this.scale));
	    carWin1.addPoint(this.x+(int)(23*this.scale), this.y+(int)(17*this.scale));
	    carWin1.addPoint(this.x+(int)(21*this.scale), this.y+(int)(15*this.scale));
	  
	    this.carWin2 = new Polygon(Color.white,true);
	    carWin2.addPoint(this.x+(int)(25*this.scale),this.y+(int)(9*this.scale));
	    carWin2.addPoint(this.x+(int)(28*this.scale),this.y+(int)(12*this.scale));
	    carWin2.addPoint(this.x+(int)(28*this.scale), this.y+(int)(21*this.scale));
	    carWin2.addPoint(this.x+(int)(25*this.scale), this.y+(int)(18*this.scale));
	  
	    // All together ..... .... ..... now
	    this.window.add(cable);
	    this.window.add(front);
	    this.window.add(carBody);
	    this.window.add(carWin1);
	    this.window.add(carWin2);
	    }
	public void move(int dx, int dy, int ws) {
		int tooFar = front.getX();
		if (cableMove == true){
			this.front.moveBy(dx, dy);
			this.carBody.moveBy(dx, dy);
			this.carWin1.moveBy(dx, dy);
			this.carWin2.moveBy(dx, dy);
			if (tooFar >= 550){
				cableMove = false;
		}
		}
		else{
			this.front.moveBy(-dx, -dy);
			this.carBody.moveBy(-dx, -dy);
			this.carWin1.moveBy(-dx, -dy);
			this.carWin2.moveBy(-dx, -dy);
			if (tooFar <= -100){
				cableMove = true;
			}
		}

		// Update the position of the face (not needed to move the face, but
		// let's be complete)
		this.x += dx;
		this.y += dy;
	}
}
