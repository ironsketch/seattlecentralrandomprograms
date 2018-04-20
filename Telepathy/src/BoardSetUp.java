
public class BoardSetUp {
	private int defaultBoardWidth;
	private int defaultBoardHeight;
	private Cell[][] board = { // ROWS Keywords used:
							   // COLORS: blue, pink, green, white, yellow, purple, red, orange, silver
							   // SHAPES: sun, star, eye, moon, circle, bolt, diamond, hand, heart
			{new Cell("blue","lightening"),new Cell("pink","circle"),new Cell("green","diamond"),new Cell("white","hand"),new Cell("yellow","moon"),new Cell("purple","eye"),new Cell("red","star"),new Cell("orange","heart"),new Cell("silver","sun"),new Cell("green","eye"),new Cell("silver","star"),new Cell("white","circle"),new Cell("red","moon"),new Cell("purple","sun"),new Cell("yellow","lightening"),new Cell("orange","diamond"),new Cell("blue","hand"),new Cell("pink","heart")},	
			{new Cell("pink","hand"),new Cell("green","heart"),new Cell("silver","eye"),new Cell("orange","circle"),new Cell("white","lightening"),new Cell("red","sun"),new Cell("blue","moon"),new Cell("purple","diamond"),new Cell("yellow","star"),new Cell("purple","hand"),new Cell("red","heart"),new Cell("pink","star"),new Cell("yellow","diamond"),new Cell("silver","circle"),new Cell("blue","eye"),new Cell("green","lightening"),new Cell("white","sun"),new Cell("orange","moon")}
	};
	
	private BoardSetUp(int widthOfBoard, int heightOfBoard){
		this.defaultBoardWidth = 3;
		this.defaultBoardHeight = 3;

	}
	private BoardSetUp(){
		this.defaultBoardWidth = 3;
		this.defaultBoardHeight = 3;
		
	}
}
