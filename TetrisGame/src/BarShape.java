import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * An Bar-Shape piece in the Tetris Game.
 * 
 * This piece is made up of 4 squares in the following configuration:
 * 
 *     <br>
 * Sq Sq Sq Sq <br>
 *    <br>
 * 
 * The game piece "floats above" the Grid. The (row, col) coordinates are the
 * location of the middle Square on the side within the Grid
 * 
 * @author CSC 143
 */

public class BarShape extends AbstractPiece{
		public BarShape(int r, int c, Grid g){
			super(g);
			Color barColor = new Color(182,239,237);

			// Create the squares
			square[0] = new Square(g, r, c - 1, barColor, true);
			square[1] = new Square(g, r, c, barColor, true);
			square[2] = new Square(g, r, c + 1, barColor, true);
			square[3] = new Square(g, r, c + 2, barColor, true);

		}
	}


