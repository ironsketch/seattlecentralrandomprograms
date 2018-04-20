import java.awt.Color;
import uwcse.graphics.*; // access the graphics utilities in the uw library

// A mountain scene with snowpeople, mountains, cablecars, trees, ornaments, and snow!
// @author Michelle Bergin

public class MountainScene extends GWindowEventAdapter{ // MountainScene is now a GWindowEventAdapter
	private GWindow window; // Graphics window that displays my scene
	
	// Snow particles (There are many to create a 
	// sense of LOTS of snow and movement. Slow
	// and fast speeds (See below)
	private SnowPoop snow;
	private SnowPoop snow1;
	private SnowPoop snow3;
	private SnowPoop snow2;
	private SnowPoop snow4;
	private SnowPoop snow5;
	private SnowPoop snow6;
	private SnowPoop snow7;
	private SnowPoop snow8;
	
	// SnowPeople
	private SnowMan snowMan1;
	private SnowMan snowMan2;
	private SnowMan snowMan3;
	private SnowMan snowMan4;
	
	// Trees
	private Tree tree1;
	private Tree tree2;
	private Tree tree3;
	private Tree tree4;
	
	// Cable Cars
	private CableCar cableCar1;
	private CableCar cableCar2;
	
	// Setting up speed instances (Not creating them yet)
	private int rateOfFallslow;
	private int rateOfFall;
	
	// Setting up counter for the animation
	private int snowAnimationCounter;
	
	// Mountain Scene
	public MountainScene() {
		
		// Colors for the scene
		Color lightGrayz = new Color (235,235,235);
		Color lightGraythird = new Color (226,226,226);
		Color sky = new Color (232,249,255);
		
		// The graphics window
		// The window is by default 700 wide and 500 high
		this.window = new GWindow("Mountain scene...",700,500);
		
		// so that a click on the close box of the
		// window terminates the application
		this.window.setExitOnClose();
		
		// Sky Color/Background
		Rectangle skyBlock = new Rectangle(0, 0, window.getWindowWidth(), 
				window.getWindowHeight()-100, sky, true);
		this.window.add(skyBlock);
		
		// Mountains instances
		new Mountain(300,350,8,this.window);
		new Mountain(100,350,10,this.window);
		new Mountain(-100,350,13,this.window);
		
		
		
		// Third hill to set up for mountains in farthest distance
		Triangle thirdGround = new Triangle(0,350,700,200,700,500,lightGraythird,true);
		this.window.add(thirdGround);
		
		// The three objects in the farthest distance
		this.snowMan1 = new SnowMan(400,240,.5, this.window);
		this.tree1 = new Tree(380, 250, .5, this.window);
		this.snowMan2 = new SnowMan(300,250,1.2, this.window);
		
		// Middle scene. This Triangle is a hill (Helps in the aid of perspective)
		Triangle secondGround = new Triangle(0,250,700,400,0,500,lightGrayz,true);
		this.window.add(secondGround);
		
		// Objects in middle scene
		this.tree2 = new Tree(180, 200, 1.7, this.window);
		this.snowMan3 = new SnowMan(100,200,2, this.window);
		this.tree3 = new Tree(20, 250, 2.5, this.window);
		
		// Cable car instances in the middle (Better for perspective)
		this.cableCar1 = new CableCar(9, 50, 2, window);
		this.cableCar2 = new CableCar(9, -100, 4, window);
		
		// Closest objects. Again we have a hill to help aid in perspective.
		Triangle frontGround = new Triangle(100,500,700,300,700,500,Color.white,true);
		this.window.add(frontGround);
		
		// Closest objects :D
		this.tree4 = new Tree(window.getWindowWidth()-75, 
				window.getWindowHeight()-300,8, this.window);
		this.snowMan4 = new SnowMan(window.getWindowWidth()-300, 
				window.getWindowHeight()-300,10, this.window);
		
		// Setting up LOTS of snow using the class SnowPoop #NotAshamedOfClassName
		this.snow = new SnowPoop(50, 50, this.window);
		this.snow1 = new SnowPoop(0,0, this.window);
		this.snow2 = new SnowPoop(300, 20, this.window);
		this.snow3 = new SnowPoop(0, -100, this.window);
		this.snow4 = new SnowPoop(23, -100, this.window);
		this.snow5 = new SnowPoop(80, -300, this.window);
		this.snow6 = new SnowPoop(160, -300, this.window);
		this.snow7 = new SnowPoop(23, -500, this.window);
		this.snow8 = new SnowPoop(150, -500, this.window);
		
		
		// Changing starting position of snow uniformly
		this.snow.moveBy(0, -600);
		this.snow1.moveBy(0, -600);
		this.snow2.moveBy(0, -600);
		this.snow3.moveBy(0, -600);
		this.snow4.moveBy(0, -600);
		this.snow5.moveBy(0, -600);
		this.snow6.moveBy(0, -600);
		this.snow7.moveBy(0, -600);
		this.snow8.moveBy(0, -600);
		
		// Code to do the animation 
		this.window.addEventHandler(this); // This scene
		this.window.startTimerEvents(150); // redraw every 150 ms
	}
	// Doing the animation
	public void timerExpired(GWindowEvent event) {
		
		// Instances to make sure things don't fall off the plain of exsistance.
		int widthOfScreen = window.getWindowWidth();
		
		
		// How fast the snow falls.
		this.rateOfFall = 8; // Faster
		this.rateOfFallslow = 4; // Slower
		
		this.window.suspendRepaints(); // So that you don't see each step the snow makes (Frame rate)
		
		// Ornament flashing
		this.tree1.flashOrnaments();
		this.tree2.flashOrnaments();
		this.tree3.flashOrnaments();
		this.tree4.flashOrnaments();
		
		if (snowAnimationCounter <= 300) { 
			
			// Snow falling
			this.snow.moveBy(0, rateOfFall);
			this.snow1.moveBy(0, rateOfFallslow);
			this.snow2.moveBy(0, rateOfFall);
			this.snow3.moveBy(0, rateOfFallslow);
			this.snow4.moveBy(0, rateOfFall);
			this.snow5.moveBy(0, rateOfFallslow);
			this.snow6.moveBy(0, rateOfFall);
			this.snow7.moveBy(0, rateOfFallslow);
			this.snow8.moveBy(0, rateOfFall);
			this.snowAnimationCounter++;
		} 
		else{ 
			
			// Reseting snow a bit
			this.snow.moveBy(0, -1000);
			this.snow1.moveBy(0, -1000);
			this.snow2.moveBy(0, -1000);
			this.snow3.moveBy(0, -1000);
			this.snow4.moveBy(0, -1000);
			this.snow5.moveBy(0, -1000);
			this.snow6.moveBy(0, -1000);
			this.snow7.moveBy(0, -1000);
			this.snow8.moveBy(0, -1000);
			snowAnimationCounter = 1;
		}
		// Snow Person arm movement
		//this.snowMan1.moveArmsAndHat();
		
		// Cable Car
		this.cableCar1.move(2, 1, widthOfScreen);
		this.cableCar2.move(4, 2, widthOfScreen);
		
		// Hat up and down
		this.snowMan1.moveHat();
		this.snowMan2.moveHat();
		this.snowMan3.moveHat();
		this.snowMan4.moveHat();
		this.snowMan1.moveArmsAndHat();
		this.snowMan2.moveArmsAndHat();
		this.snowMan3.moveArmsAndHat();
		this.snowMan4.moveArmsAndHat();
		
		this.window.resumeRepaints(); // Will then show the shape/instance/image/object again (Frame rate)

		//	this.window.stopTimerEvents(); I don't want the animation to stop
	}
	// Start of program
	public static void main(String[] args) {
		new MountainScene();
	}
}
