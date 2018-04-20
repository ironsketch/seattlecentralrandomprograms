import uwcse.graphics.*; // access the graphics utilities in the uw library
import java.awt.Color; // access the Color class

//A mountain scene with snowpeople, mountains, cablecars, trees, ornaments, and snow!
//@author Michelle Bergin

public class Mountain {

  // Setting up instances
	private GWindow window;
	private int x;
	private int y;
	private double scale;
	
	public Mountain(int x, int y, double scale, GWindow window){
		// creates the instance fields
		this.window = window;
		this.scale = scale;
		this.x = x;
		this.y = y;
		
		// Put the details of the drawing in a private method
		this.draw();
		}
	
	// Mountain
	private void draw(){
		// Mountain color
		Color mountainColor = new Color (210,227,235);
	  
	    // Main mountain body
	    Triangle mountain = new Triangle(this.x-(int)(10*this.scale),this.y+(int)(10*this.scale), 
			  this.x+(int)(20*this.scale),this.y-(int)(30*this.scale), 
			  this.x+(int)(50*this.scale),this.y+(int)(10*this.scale),
			  mountainColor,true);
	  
	    // A side of the mountain
	    Triangle top = new Triangle(this.x-(int)(20*this.scale),this.y+(int)(-10*this.scale), 
			  this.x+(int)(20*this.scale),this.y-(int)(30*this.scale), 
			  this.x+(int)(25*this.scale),this.y+(int)(5*this.scale),
			  Color.white,true);
	  
	    // A jagged edge of the mountain
	    Triangle jagged = new Triangle(this.x-(int)(-25*this.scale),this.y-(int)(20*this.scale), 
			  this.x+(int)(15*this.scale),this.y-(int)(10*this.scale), 
			  this.x+(int)(50*this.scale),this.y+(int)(10*this.scale),
			  mountainColor,true);
	  
	    // All together
	    this.window.add(mountain);
	    this.window.add(top);
	    this.window.add(jagged);
	}
}
