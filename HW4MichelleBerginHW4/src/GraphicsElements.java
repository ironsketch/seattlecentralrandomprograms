import java.awt.Color;
import java.util.*;
import uwcse.io.*;
import uwcse.graphics.*;
import javax.swing.*;

/**
 * A class to create and manipulate graphics elements stored in an ArrayList
 */

public class GraphicsElements {

	/** Maximum number of disks in a pile of disks */
	public static final int MAXIMUM_NUMBER_OF_DISKS = 100;

	/** Maximum number of rows (or columns) in a square checkered board */
	public static final int MAXIMUM_NUMBER_OF_ROWS = 50;

	/** Maximum number of points in a Sierpinski triangle */
	public static final int MAXIMUM_NUMBER_OF_POINTS = 10000;

	/** Width of the window (from ViewWindow) */
	public static final int WIDTH = ViewWindow.WINDOW_WIDTH;

	/** Height of the window (from ViewWindow) */
	public static final int HEIGHT = ViewWindow.WINDOW_HEIGHT;
	
	// Put your other instance fields here (if you need any)
	
	private void errorMessage(int MAX){
		JOptionPane.showMessageDialog(null, "It has to be a number from 1 - " + MAX +" ONLY. ಠ_ಠ");
	}
	
	private Color randomColor(){
    	// Random Colors
		int R = (int) (Math.random( )*256);
		int G = (int) (Math.random( )*256);
		int B = (int) (Math.random( )*256);
		return new Color(R, G, B);
		}
	
	private Color alternateColor(int i){
    	// Random Colors
		if (i%2==0){
			return new Color(96, 143, 175);
		}
		return new Color(157, 96, 175);
		}

	/**
	 * Create a top view of a pile of disks of decreasing diameters (from bottom
	 * to top). Use filled circles. The color of each disk is random. The pile
	 * should fill the window. <br>
	 * Store the circles in an ArrayList and return that ArrayList (the disk at
	 * the bottom should be the first element of the ArrayList)<br>
	 * The number of disks is given by the user (use a dialog box). If that
	 * number is less than or equal to 0 or greater than
	 * MAXIMUM_NUMBER_OF_DISKS, display an error message (use
	 * JOptionPane.showMessageDialog)and ask for it again.
	 */
	public ArrayList createAPileOfDisks() {
		/** Array of Disks**/
		ArrayList diskArray = new ArrayList();
		
		Input diskInput = new Input();
		int diskNumber = diskInput.readIntDialog("Type a number from 1 - " + MAXIMUM_NUMBER_OF_DISKS);
		int spacing = this.HEIGHT / diskNumber;
		if (diskNumber >= 1 && diskNumber <= MAXIMUM_NUMBER_OF_DISKS){
			for (int i=0;i<diskNumber;i++){
				int diskWidth = spacing * (diskNumber - i);
				Oval disk = new Oval ((WIDTH/2) - (diskWidth/2), HEIGHT/2 - (diskWidth/2), diskWidth, diskWidth, randomColor(),true);
				diskArray.add(disk);
			}
		return diskArray;
		}
		errorMessage(MAXIMUM_NUMBER_OF_DISKS);
		return createAPileOfDisks();
	}

	/**
	 * Create a square checkered board. Create a Rectangle for each square on
	 * the board. Store the Rectangles in an ArrayList and return that
	 * ArrayList. Use two colors only to paint the squares.<br>
	 * The board should cover most of the window. The number of rows (=number of
	 * columns) is given by the user (use a dialog box). If that number is less
	 * than or equal to 0 or greater than MAXIMUM_NUMBER_OF_ROWS, display an
	 * error message (use JOptionPane.showMessageDialog)and ask for it again.
	 */
	public ArrayList createACheckeredBoard() {
		/** Array of Squares**/
		ArrayList squareArray = new ArrayList();

		int leftStart= Math.abs((this.WIDTH - this.HEIGHT)/2);
		int x = leftStart;
		int y = 0;
		Input checkInput = new Input();
		int checkWidth = checkInput.readIntDialog("Type a number from 1 - " + MAXIMUM_NUMBER_OF_ROWS);
		int spacing = Math.round(this.HEIGHT / (float)(checkWidth));
		if (checkWidth >= 1 && checkWidth <= MAXIMUM_NUMBER_OF_ROWS){
			for (int i=0;i<checkWidth;i++){
				for (int j=0;j<checkWidth;j++){
					Rectangle square = new Rectangle (x, y, spacing, spacing, alternateColor(i+j),true);
					squareArray.add(square);
					x += spacing;
				}
				x = leftStart;
				y += spacing;
			}
		return squareArray;
		}
		errorMessage(MAXIMUM_NUMBER_OF_ROWS);
		return createACheckeredBoard();
	}

	/**
	 * Create a Sierpinski triangle. Create a filled Oval (circle of radius 1)
	 * for each point of the triangle. Store the Ovals in an ArrayList and
	 * return that ArrayList. Use one color only to paint the Ovals.<br>
	 * The triangle should cover most of the window.<br>
	 * The number of points is given by the user (use a dialog box). If that
	 * number is less than or equal to 0 or greater than
	 * MAXIMUM_NUMBER_OF_POINTS, display an error message (use
	 * JOptionPane.showMessageDialog)and ask for it again.
	 */
	
	public int randInt(int max) {
		Random randNum = new Random();
		int randomInt = randNum.nextInt(max);
	    return randomInt + 1;
	}
	public ArrayList createASierpinskiTriangle() {
		int P1Y = 0;
		int P1X = this.WIDTH / 2;
		int P2Y = this.HEIGHT;
		int P2X = Math.abs((this.HEIGHT - this.WIDTH)/2);
		int P3Y = this.HEIGHT;
		int P3X = (this.WIDTH + ((this.HEIGHT - this.WIDTH)/2));
		int PY = P1Y;
		int PX = P1X;
		ArrayList pointArray = new ArrayList();
		Input checkInput = new Input();
		int checkPoints = checkInput.readIntDialog("Type a number from 1 - " + MAXIMUM_NUMBER_OF_POINTS);
		if (checkPoints >= 1 && checkPoints <= MAXIMUM_NUMBER_OF_POINTS){
			for(int i=0;i<=checkPoints;i++){
					int randPoint = randInt(3);
					if (randPoint == 1){
						int QX = Math.abs((PX + P1X) /2);
						int QY = Math.abs((PY + P1Y) /2);
						Oval sPoint = new Oval (QX, QY, 1, 1, Color.red,true);
						pointArray.add(sPoint);
						PX = QX;
						PY = QY;
					}
					else if(randPoint == 2){
						int QX = Math.abs((PX + P2X)/2);
						int QY = Math.abs((PY + P2Y)/2);
						Oval sPoint = new Oval (QX, QY, 1, 1, Color.red,true);
						pointArray.add(sPoint);
						PX = QX;
						PY = QY;
					}
					else{
						int QX = Math.abs((PX + P3X)/2);
						int QY = Math.abs((PY + P3Y)/2);
						Oval sPoint = new Oval (QX, QY, 1, 1, Color.red,true);
						pointArray.add(sPoint);
						PX = QX;
						PY = QY;
					}
			}
			return pointArray;
		}
		errorMessage(MAXIMUM_NUMBER_OF_POINTS);
		return createASierpinskiTriangle();
	}

	/**
	 * Rotate the colors in the pile of disks. Set the color of each disk to the
	 * color of the disk just above it. For the top disk, set its color to the
	 * color of the bottom disk (e.g. with 3 disks, if the colors are from
	 * bottom to top, red, blue, yellow, the new colors of the disks are from
	 * bottom to top, blue, yellow, red).<br>
	 * Precondition: graphicsList describes a pile of disks
	 */
	public ArrayList rotateColorsInPileOfDisks(ArrayList graphicsList) {
		Color poop = ((Oval)graphicsList.get(0)).getColor();
		for (int i=0;i < graphicsList.size();i++){
			if (i!=graphicsList.size() - 1){
				((Oval)graphicsList.get(i)).setColor(((Oval)graphicsList.get(i+1)).getColor());
			}
			else{
				((Oval)graphicsList.get(i)).setColor(poop);
			}
		}
		return graphicsList;
	}

	/**
	 * Flip the 2 colors of the checkboard<br>
	 * Precondition: graphicsList describes a checkered board
	 */
	public ArrayList flipColorsInCheckeredBoard(ArrayList graphicsList) {
		
		Color color1 = ((Color)((Rectangle)graphicsList.get(0)).getColor());
		Color color2 = ((Color)((Rectangle)graphicsList.get(1)).getColor());
		for (int i = 0;i<graphicsList.size();i++){
			if (((Color)((Rectangle)graphicsList.get(i)).getColor()).equals(color1)){
				((Rectangle)graphicsList.get(i)).setColor(color2);
			}
			else{
				((Rectangle)graphicsList.get(i)).setColor(color1);
			}
			
		}
		return graphicsList;
	}

	/**
	 * Change the color of the Sierpinski triangle (all circles should change to
	 * the same color). Switch between 3 colors (e.g. blue->red->green, if the
	 * triangle was blue, make it red, if it was red, make it green, if it was
	 * green make it blue).<br>
	 * Precondition: graphicsList describes a Sierpinski triangle
	 */
	public ArrayList changeColorsInSierpinskiTriangle(ArrayList graphicsList) {
		for (int i = 0;i<graphicsList.size();i++){
			if (((Color)((Oval)graphicsList.get(i)).getColor()).equals(Color.red)){
				((Oval)graphicsList.get(i)).setColor(Color.blue);
			}
			else if (((Color)((Oval)graphicsList.get(i)).getColor()).equals(Color.blue)){
				((Oval)graphicsList.get(i)).setColor(Color.green);
			}
			else{
				((Oval)graphicsList.get(i)).setColor(Color.red);
			}
		}
		return graphicsList;
	}

	/**
	 * Return the color at location (x,y) in the pile of disks. If (x,y) is not
	 * part of the pile of disks, return null.<br>
	 * Precondition: graphicsList describes a pile of disks
	 */
	public Color getColorInPileOfDisks(int x, int y, ArrayList graphicsList) {
		for (int i = graphicsList.size()-1; i >= 0;i--){
			int arrayX = ((Oval)graphicsList.get(i)).getCenterX();
			int arrayY = ((Oval)graphicsList.get(i)).getCenterY();
			int arrayRadius = ((Oval)graphicsList.get(i)).getWidth() / 2;
			//(x - center_x)^2 + (y - center_y)^2 < radius^2
			if ((((x - arrayX)*(x - arrayX)) + ((y - arrayY)*(y - arrayY)) <= (arrayRadius * arrayRadius))){
				Color arrayColor = ((Oval)graphicsList.get(i)).getColor();
				return arrayColor;
			}
		}
		return null;
	}

	/**
	 * Return the color at location (x,y) in the checkered board. If (x,y) is
	 * not part of the board, return null.<br>
	 * Precondition: graphicsList describes a checkered board
	 */
	public Color getColorInCheckeredBoard(int x, int y, ArrayList graphicsList) {
		int leftStart= Math.abs((this.WIDTH - this.HEIGHT)/2);
		int testing = leftStart + this.HEIGHT;
		for (int i=0;i<graphicsList.size();i++){
			int arrayX = ((Rectangle)graphicsList.get(i)).getX();
			int arrayY = ((Rectangle)graphicsList.get(i)).getY();
			int arrayWidth = ((Rectangle)graphicsList.get(i)).getWidth();
			Color arrayColor = ((Rectangle)graphicsList.get(i)).getColor();
			if ((x >= leftStart) && (x <= (leftStart + this.HEIGHT))){
				if (((x >= arrayX) && (x <= arrayX + arrayWidth)) && ((y >= arrayY) && (y <= arrayY + arrayWidth))){
					return arrayColor;
				}
			}
		}
		return null;
	}

	/**
	 * Return the color at location (x,y) in the Sierpinski triangle. If (x,y)
	 * is not part of the pile of disks, return null.<br>
	 * Precondition: graphicsList describes a Sierpinski triangle
	 */
	public Color getColorInSierpinskiTriangle(int x, int y, ArrayList graphicsList) {
		for (int i=0;i<graphicsList.size();i++){
			int arrayPointX = ((Oval)graphicsList.get(i)).getX();
			int arrayPointY = ((Oval)graphicsList.get(i)).getY();
			if ((x == arrayPointX) && (y == arrayPointY)){
				Color arrayColor = ((Oval)graphicsList.get(i)).getColor();
				return arrayColor;
			}
		}
		return null;
	}
}