package SnapShop;
/**
 * Filter that changes the image to it's negative self  255 - RGB
 */
public class GaussianBlurFilter implements Filter {
	public void filter(PixelImage pi) {
		Pixel[][] data = pi.getData();
		
		for (int row = 1; row < pi.getHeight() - 2; row++) {
			for (int col = 1; col < pi.getWidth() - 2; col++) {
				int RED = 0;
				int REDWeight = 0;
				int GREEN = 0;
				int GREENWeight = 0;
				int BLUE = 0;
				int BLUEWeight = 0;
				for (int row3x3 = 0; row3x3 < 3; row3x3++){
					for (int col3x3 = 0; col3x3 < 3; col3x3++){
						//RED
						RED += data[row - 1 + row3x3][col - 1 + col3x3].red * data[row + row3x3][col + col3x3].red;
						REDWeight += data[row + row3x3][col + col3x3].red;
						GREEN += data[row - 1 + row3x3][col - 1 + col3x3].green * data[row + row3x3][col + col3x3].green;
						GREENWeight += data[row + row3x3][col + col3x3].green;
						BLUE += data[row - 1 + row3x3][col - 1 + col3x3].blue * data[row + row3x3][col + col3x3].blue;
						BLUEWeight += data[row + row3x3][col + col3x3].blue;
						
					}
				}
				data[row][col].red = RED / (REDWeight + 1);
				data[row][col].blue = BLUE / (BLUEWeight + 1);
				data[row][col].green = GREEN / (GREENWeight + 1);
			}
		}

		pi.setData(data);
	}
}