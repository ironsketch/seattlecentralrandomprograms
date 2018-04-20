import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * An T-Shape piece in the Tetris Game.
 * 
 * This piece is made up of 4 squares in the following configuration:
 * 
 *     <br>
 * Sq Sq Sq <br>
 *    Sq    <br>
 * 
 * The game piece "floats above" the Grid. The (row, col) coordinates are the
 * location of the middle Square on the side within the Grid
 * 
 * @author CSC 143
 */

public class TShape extends AbstractPiece{
		public TShape(int r, int c, Grid g){
			super(g);
			

			// Create the squares
			square[0] = new Square(g, r, c - 1, Color.YELLOW, true);
			square[1] = new Square(g, r, c, Color.YELLOW, true);
			square[2] = new Square(g, r, c + 1, Color.YELLOW, true);
			square[3] = new Square(g, r + 1, c, Color.YELLOW, true);

		}
	}


