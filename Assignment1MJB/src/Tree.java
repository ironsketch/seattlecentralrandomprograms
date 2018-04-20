import uwcse.graphics.*; // access the graphics utilities in the uw library
import java.awt.Color; // access the Color class

//A mountain scene with snowpeople, mountains, cablecars, trees, ornaments, and snow!
//@author Michelle Bergin 

public class Tree {
	// Instance fields
    // The graphics window this tree belongs to
    private GWindow window;
  
    // The location of this tree
    // (precisely (as done in the draw method), (x,y) is
    // the upper left corner of the tree trunk)
    private int x;
    private int y;
    private Oval ornament1;
    private Oval ornament2;
    private Oval ornament3;
    private Oval ornament4;
    private Oval ornament5;
  
    // The scale used to draw this tree
    private double scale;

    public Tree(int x, int y, double scale, GWindow window){
    	// Initialize the instance fields 
    	this.window = window;
    	this.scale = scale;
        this.x = x;
        this.y = y;
        this.draw();
        }
    
    private Color randomOrnamentColor(){
    	// Random Colors
		int R = (int) (Math.random( )*256);
		int G = (int) (Math.random( )*256);
		int B = (int) (Math.random( )*256);
		return new Color(R, G, B);
		}
    
    // PINE TREE
    private void draw(){
    	//Colors!!!!!!!!!!
    	Color green4 = new Color (150,246,211);
    	Color green3 = new Color (16,255,148);
    	Color green2 = new Color (17,196,131);
    	Color green1 = new Color (18,168,113);
    	Color trunkColor = new Color (155,116,25);
    	
    	// Trunk
       Rectangle trunk = new Rectangle(this.x,this.y,(int)(20*this.scale),(int)(60*this.scale), trunkColor,true);
       
       // Foliage
       Triangle foliage = new Triangle(this.x-(int)(30*this.scale),this.y+(int)(30*this.scale),
    		   this.x+(int)(10*this.scale),this.y-(int)(10*this.scale),
    		   this.x+(int)(50*this.scale),this.y+(int)(30*this.scale),
    		   green1,true);
    
       // Second Foliage
      Triangle foliage2 = new Triangle(this.x-(int)(25*this.scale),this.y+(int)(15*this.scale),
			   this.x+(int)(10*this.scale),this.y-(int)(10*this.scale),
			   this.x+(int)(45*this.scale),this.y+(int)(15*this.scale),
			   green2,true);
    
      // Third Foliage
      Triangle foliage3 = new Triangle(this.x-(int)(20*this.scale),this.y+(int)(5*this.scale),
    		  this.x+(int)(10*this.scale),this.y-(int)(20*this.scale),
			  this.x+(int)(40*this.scale),this.y+(int)(5*this.scale),
			  green3,true);
    
      // Fourth Foliage
      Triangle foliage4 = new Triangle(this.x-(int)(15*this.scale),this.y+(int)(-5*this.scale),
			  this.x+(int)(10*this.scale),this.y-(int)(30*this.scale),
			  this.x+(int)(35*this.scale),this.y+(int)(-5*this.scale),
			  green4,true);
    
      // Ornaments
      ornament1 = new Oval(this.x+(int)(40*this.scale),this.y+(int)(20*this.scale),
			  (int)(6*this.scale),(int)(6*this.scale),randomOrnamentColor(),true);
      ornament2 = new Oval(this.x+(int)(10*this.scale),this.y+(int)(10*this.scale),
			  (int)(6*this.scale),(int)(6*this.scale),randomOrnamentColor(),true);
      ornament3 = new Oval(this.x+(int)(-10*this.scale),this.y+(int)(1*this.scale),
			  (int)(6*this.scale),(int)(6*this.scale),randomOrnamentColor(),true);
      ornament4 = new Oval(this.x+(int)(1*this.scale),this.y+(int)(-20*this.scale),
			  (int)(6*this.scale),(int)(6*this.scale),randomOrnamentColor(),true);
      ornament5 = new Oval(this.x+(int)(-5*this.scale),this.y+(int)(20*this.scale),
			  (int)(6*this.scale),(int)(6*this.scale),randomOrnamentColor(),true);
    
      // Putting it together
      this.window.add(trunk);
      this.window.add(foliage);
      this.window.add(foliage2);
      this.window.add(foliage3);
      this.window.add(foliage4);
      this.window.add(ornament1);
      this.window.add(ornament2);
      this.window.add(ornament3);
      this.window.add(ornament4);
      this.window.add(ornament5);
      }
    public void flashOrnaments(){
    	this.ornament1.setColor(randomOrnamentColor());
    	this.ornament2.setColor(randomOrnamentColor());
    	this.ornament3.setColor(randomOrnamentColor());
    	this.ornament4.setColor(randomOrnamentColor());
    	this.ornament5.setColor(randomOrnamentColor());
    }
}
