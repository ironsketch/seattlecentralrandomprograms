import uwcse.graphics.*; // access the graphics utilities in the uw library
import java.awt.Color; // access the Color class

//A mountain scene with snowpeople, mountains, cablecars, trees, ornaments, and snow!
//@author Michelle Bergin 

public class SnowMan {
	
	// Your instance fields go here
	private GWindow window;
	private int x;
	private int y;
	private double scale;
	private Polygon hat;
	private Rectangle arm1;
	private Rectangle thumb1;
	private Rectangle arm2;
	private Rectangle thumb2;
	private boolean whereHat = true;
	private int counter = 0;
	private boolean upDown = true;
	
	public SnowMan(int x, int y, double scale, GWindow window){
		// initialize the instance fields
	    this.window = window;
	    this.scale = scale;
	    this.x = x;
	    this.y = y;
	  
	    // Put the details of the drawing in a private method
	    this.draw();
	    }
	// SNOW MAN
    private void draw(){
    	
    	// Colors used for snow man parts
	    Color lg1 = new Color (218,218,218);
	    Color lg2 = new Color (203,203,203);
	    Color noseColor = new Color (245,173,7);
	    Color arms = new Color (155,116,25);
	  
	    // HAT O.o HUGE polygon of ridiculousness I wanted it to be a tilted hat
	    this.hat = new Polygon(Color.black, true);
	    hat.addPoint(this.x+(int)(3*this.scale), this.y+(int)(8*this.scale));
	    hat.addPoint(this.x+(int)(4*this.scale), this.y+(int)(5*this.scale));
	    hat.addPoint(this.x+(int)(10*this.scale), this.y+(int)(4*this.scale));
	    hat.addPoint(this.x+(int)(10*this.scale), this.y+(int)(-5*this.scale));
	    hat.addPoint(this.x+(int)(26*this.scale), this.y+(int)(-7*this.scale));
	    hat.addPoint(this.x+(int)(26*this.scale), this.y+(int)(2*this.scale));
	    hat.addPoint(this.x+(int)(31*this.scale), this.y+(int)(1*this.scale));
	    hat.addPoint(this.x+(int)(30*this.scale), this.y+(int)(4*this.scale));
	  
	    // EYES
	    Oval eye1 = new Oval(this.x+(int)(22*this.scale),this.y+(int)(8*this.scale),
	    		(int)(4*this.scale),(int)(4*this.scale),Color.black,true);
	    Oval eye2 = new Oval(this.x+(int)(10*this.scale),this.y+(int)(8*this.scale),
			    (int)(4*this.scale),(int)(4*this.scale),Color.black,true);
	  
	    // NOSE
	    Triangle nose = new Triangle(this.x+(int)(16*this.scale),this.y+(int)(10*this.scale),
				 this.x+(int)(21*this.scale),this.y+(int)(10*this.scale),
				 this.x+(int)(18*this.scale),this.y+(int)(16*this.scale),
				 noseColor,true);
	    
	    // MOUTH
	    Oval mouth1 = new Oval(this.x+(int)(16*this.scale),this.y+(int)(15*this.scale),
			    (int)(4*this.scale),(int)(4*this.scale),Color.black,true);
	    Rectangle mouth2 = new Rectangle(this.x+(int)(16*this.scale),this.y+(int)(12*this.scale),
			    (int)(4*this.scale),(int)(4*this.scale),Color.white,true);
	  
	    // BUTTONS
	    Oval butt1 = new Oval(this.x+(int)(16*this.scale),this.y+(int)(27*this.scale),
			    (int)(4*this.scale),(int)(4*this.scale),Color.black,true);
	    Oval butt2 = new Oval(this.x+(int)(16*this.scale),this.y+(int)(38*this.scale),
			    (int)(4*this.scale),(int)(4*this.scale),Color.black,true);
	    Oval butt3 = new Oval(this.x+(int)(16*this.scale),this.y+(int)(47*this.scale),
			    (int)(4*this.scale),(int)(4*this.scale),Color.black,true);
	  
	    // BODY
	    Oval head = new Oval(this.x+(int)(8*this.scale),this.y,
			    (int)(20*this.scale),(int)(20*this.scale),Color.white,true);
	    Oval midBody = new Oval(this.x+(int)(4*this.scale),this.y+(int)(13*this.scale),
				  (int)(30*this.scale),(int)(30*this.scale),lg1,true);
	    Oval bottomBody = new Oval(this.x,this.y+(int)(34*this.scale),
				  (int)(40*this.scale),(int)(40*this.scale),lg2,true);
	  
	    // ARMS
	    this.arm1 = new Rectangle(this.x-(int)(20*this.scale),this.y+(int)(23*this.scale),
			      (int)(25*this.scale),(int)(2*this.scale),arms,true);
	    this.thumb1 = new Rectangle(this.x-(int)(17*this.scale),this.y+(int)(20*this.scale),
			      (int)(2*this.scale),(int)(3*this.scale),arms,true);
	  
	    this.arm2 = new Rectangle(this.x+(int)(32*this.scale),this.y+(int)(23*this.scale),
			      (int)(25*this.scale),(int)(2*this.scale),arms,true);
	    this.thumb2 = new Rectangle(this.x+(int)(52*this.scale),this.y+(int)(20*this.scale),
			      (int)(2*this.scale),(int)(3*this.scale),arms,true);
	  
	    // Putting it together
	    this.window.add(bottomBody);
	    this.window.add(midBody);
	    this.window.add(head);
	    this.window.add(mouth1);
	    this.window.add(mouth2);
	    this.window.add(eye1);
	    this.window.add(eye2);
	    this.window.add(nose);
	    this.window.add(butt1);
	    this.window.add(butt2);
	    this.window.add(butt3);
	    this.window.add(hat);
	    this.window.add(arm1);
	    this.window.add(thumb1);
	    this.window.add(arm2);
	    this.window.add(thumb2);
	    }
    
    // moveHat has the hat move up three times then change direction etc.
    public void moveHat(){
    	if (this.whereHat == true){
    		this.hat.moveBy(0,-1*(int)(2*this.scale));
    		this.counter++;
    		if (this.counter == 3){
    		this.whereHat = false;
    		this.counter = 0;
    		}
    	}
    	else if(whereHat == false){
    		this.hat.moveBy(0,(int)(2*this.scale));
    		this.counter++;
    		if (this.counter == 3){
        		this.whereHat = true;
        		this.counter = 0;
        		}
    	}
    }
    
    // This moves the SnowPersons arms
    public void moveArmsAndHat(){
 
    	if (this.upDown == true){
    		this.arm1.moveBy(0,(int)(2*this.scale));
    		this.thumb1.moveBy(0,(int)(2*this.scale));
    		this.arm2.moveBy(0,(int)(2*this.scale));
    		this.thumb2.moveBy(0,(int)(2*this.scale));
    		this.upDown = false;
    	}
    	else if(this.upDown == false){
    		this.arm1.moveBy(0,(int)(-2*this.scale));
    		this.thumb1.moveBy(0,(int)(-2*this.scale));
    		this.arm2.moveBy(0,(int)(-2*this.scale));
    		this.thumb2.moveBy(0,(int)(-2*this.scale));
    		this.upDown = true;
    	}
    }
    	//this.thumb1.rotateAround(arm1.getCenterX(),arm1.getCenterY(),20);
    	//this.arm2.rotateAround(arm1.getCenterX(),arm1.getCenterY(),20);
    	//this.thumb2.rotateAround(arm1.getCenterX(),arm1.getCenterY(),20);
    	
}

