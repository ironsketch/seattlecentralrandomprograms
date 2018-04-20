import java.awt.Color;
import uwcse.graphics.*;

public class SnowPoop {
	private GWindow window;
	private int x, y;
	private Oval snow;
	private Oval snow1;
	private Oval snow2;
	private Oval snow3;
	private Oval snow4;
	private Oval snow5;
	private Oval snow6;
	private Oval snow7;
	private Oval snow8;
	private Oval snow9;
	private Oval snow10;
	private Oval snow11;
	private Oval snow12;
	private Oval snow13;
	private Oval snow14;

	public SnowPoop(int x, int y, GWindow window) {
		this.x = x;
		this.y = y;
		this.window = window;
		
		this.allSnow();
	}
	
	private void allSnow() {
		drawSnow(this.x,this.y);

		this.window.doRepaint();
	}
	private void drawSnow(int x, int y) {
		snow = new Oval(50 + this.x,300 + this.y,10,10,Color.white,true);
		snow1 = new Oval(150 + this.x,400 + this.y,5,5,Color.white,true);
		snow2 = new Oval(250 + this.x,500 + this.y,10,10,Color.white,true);
		snow3 = new Oval(350 + this.x,600 + this.y,7,7,Color.white,true);
		snow4 = new Oval(450 + this.x,650 + this.y,5,5,Color.white,true);
		snow5 = new Oval(550 + this.x,550 + this.y,10,10,Color.white,true);
		snow6 = new Oval(650 + this.x,450 + this.y,4,4,Color.white,true);
		snow7 = new Oval(600 + this.x,350 + this.y,10,10,Color.white,true);
		snow8 = new Oval(500 + this.x,2150 + this.y,5,5,Color.white,true);
		snow9 = new Oval(300 + this.x,50 + this.y,10,10,Color.white,true);
		snow10 = new Oval(70 + this.x,70 + this.y,4,4,Color.white,true);
		snow11 = new Oval(130 + this.x,300 + this.y,10,10,Color.white,true);
		snow12 = new Oval(240 + this.x,360 + this.y,5,5,Color.white,true);
		snow13 = new Oval(290 + this.x,490 + this.y,10,10,Color.white,true);
		snow14 = new Oval(290 + this.x,590 + this.y,7,7,Color.white,true);
		
		this.window.add(snow);
		this.window.add(snow1);
		this.window.add(snow2);
		this.window.add(snow3);
		this.window.add(snow4);
		this.window.add(snow5);
		this.window.add(snow6);
		this.window.add(snow7);
		this.window.add(snow8);
		this.window.add(snow9);
		this.window.add(snow10);
		this.window.add(snow11);
		this.window.add(snow12);
		this.window.add(snow13);
		this.window.add(snow14);
	}
	
	//public void moveTo(int x, int y) {
		// Use the moveBy method below
		// Displacement
		//int dx = x - this.x;
		//int dy = y - this.y;
		//this.moveBy(dx, dy);
	//}
	
	public void moveBy(int dx, int dy) {
		this.snow.moveBy(dx, dy);
		this.snow1.moveBy(dx, dy);
		this.snow2.moveBy(dx, dy);
		this.snow3.moveBy(dx, dy);
		this.snow4.moveBy(dx, dy);
		this.snow5.moveBy(dx, dy);
		this.snow6.moveBy(dx, dy);
		this.snow7.moveBy(dx, dy);
		this.snow8.moveBy(dx, dy);
		this.snow9.moveBy(dx, dy);
		this.snow10.moveBy(dx, dy);
		this.snow11.moveBy(dx, dy);
		this.snow12.moveBy(dx, dy);
		this.snow13.moveBy(dx, dy);
		this.snow14.moveBy(dx, dy);
		

		// Update the position of the face (not needed to move the face, but
		// let's be complete)
		this.x += dx;
		this.y += dy;
	}
}
