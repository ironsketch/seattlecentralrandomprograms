import uwcse.graphics.*; // uw graphics library

public class WindowWithCircle {
		// Instance fields
		private GWindow window; //graphics window
		private Oval circle; // circle in the window
		private Oval eye;
		private Oval eye2;
		private Polygon ear;
		private Polygon ear2;
		private Oval mouth1;
		private Rectangle mouth2;
		
		public WindowWithCircle(){
				// Construct the window
				window = new GWindow();
				// make the circle
				circle = new Oval();
				eye = new Oval();
				eye2 = new Oval();
				ear = new Polygon();
				ear2 = new Polygon();
				mouth1 = new Oval();
				mouth2 = new Rectangle();
				// put circle in window
				window.add(circle);
				window.add(eye);
				window.add(eye2);
				window.add(ear);
				window.add(ear2);
				window.add(mouth1);
				window.add(mouth2);
				// exit the app when closing
				window.setExitOnClose();
		}
		public void modifyCircle() {
			circle.moveTo(50, 50);
			eye.moveTo(70, 200);
			eye2.moveTo(270, 200);
			mouth1.moveTo(170, 270);
			mouth2.moveTo(170, 240);
			
			circle.setColor(java.awt.Color.black);
			mouth1.setColor(java.awt.Color.white);
			mouth2.setColor(java.awt.Color.black);
			eye.setColor(java.awt.Color.white);
			eye2.setColor(java.awt.Color.white);
			ear.setColor(java.awt.Color.black);
			ear2.setColor(java.awt.Color.black);
			circle.resize(300, 300);
			mouth2.resize(50, 50);
			window.doRepaint();
		}
		public void modifyCircle2() {
			//ear1
			ear.addPoint(70, 2);
			ear.addPoint(200, 100);
			ear.addPoint(60, 200);
			//next ear
			ear2.addPoint(350, 2);
			ear2.addPoint(340, 200);
			ear2.addPoint(100, 200);
			// ear space

			window.doRepaint();
		}
		public static void main(String[] args) {
				WindowWithCircle w = new WindowWithCircle();
				w.modifyCircle();
				w.modifyCircle2();
		}
}
