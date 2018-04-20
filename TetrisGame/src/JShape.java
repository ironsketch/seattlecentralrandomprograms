import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * An J-Shape piece in the Tetris Game.
 * 
 * This piece is made up of 4 squares in the following configuration:
 * 
 *    Sq <br>
 *    Sq <br>
 * Sq Sq <br>
 * 
 * The game piece "floats above" the Grid. The (row, col) coordinates are the
 * location of the middle Square on the side within the Grid
 * 
 * @author CSC 143
 */

public class JShape extends AbstractPiece{
		public JShape(int r, int c, Grid g){
			
			super(g);
			Color JColor = new Color(59,70,218);
			

			// Create the squares
			square[0] = new Square(g, r - 1, c, JColor, true);
			square[1] = new Square(g, r, c, JColor, true);
			square[2] = new Square(g, r + 1, c, JColor, true);
			square[3] = new Square(g, r + 1, c - 1, JColor, true);

		}
	}


