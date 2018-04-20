import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * An S-Shape piece in the Tetris Game.
 * 
 * This piece is made up of 4 squares in the following configuration:
 * 
 *     <br>
 *    Sq Sq <br>
 * Sq Sq    <br>
 * 
 * The game piece "floats above" the Grid. The (row, col) coordinates are the
 * location of the middle Square on the side within the Grid
 * 
 * @author CSC 143
 */

public class SShape extends AbstractPiece{
		public SShape(int r, int c, Grid g){
			super(g);
			Color SColor = new Color(111,210,121);

			// Create the squares
			square[0] = new Square(g, r, c + 1, SColor, true);
			square[1] = new Square(g, r, c, SColor, true);
			square[2] = new Square(g, r + 1, c, SColor, true);
			square[3] = new Square(g, r + 1, c - 1, SColor, true);

		}
		
		
	}

 

