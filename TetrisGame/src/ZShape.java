	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.Point;

	/**
	 * An Z-Shape piece in the Tetris Game.
	 * 
	 * This piece is made up of 4 squares in the following configuration:
	 * 
	 * <br>
	 * Sq Sq <br>
	 *    Sq Sq <br>
	 * 
	 * The game piece "floats above" the Grid. The (row, col) coordinates are the
	 * location of the middle Square on the side within the Grid
	 * 
	 * @author CSC 143
	 */

	public class ZShape extends AbstractPiece{
			public ZShape(int r, int c, Grid g){
				super(g);
				Color ZColor = new Color(198,69,99);

				// Create the squares
				square[0] = new Square(g, r, c - 1, ZColor, true);
				square[1] = new Square(g, r, c, ZColor, true);
				square[2] = new Square(g, r + 1, c, ZColor, true);
				square[3] = new Square(g, r + 1, c + 1, ZColor, true);

			}
		}



