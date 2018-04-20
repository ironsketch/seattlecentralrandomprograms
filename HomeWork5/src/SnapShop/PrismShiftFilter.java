package SnapShop;
/**
 * Filter that changes the image to it's negative self  255 - RGB
 */
public class PrismShiftFilter implements Filter {
	public void filter(PixelImage pi) {
		Pixel[][] data = pi.getData();
		
		for (int row = 1; row < pi.getHeight() - 2; row++) {
			for (int col = 1; col < pi.getWidth() - 2; col++) {
				for (int row3x3 = 0; row3x3 < 3; row3x3++){
					for (int col3x3 = 0; col3x3 < 3; col3x3++){
						//RED
						data[row - 1 + row3x3][col - 1 + col3x3].red = data[row + row3x3][col + col3x3].red;
					
						//
						
					}
				}
			}
		}

		pi.setData(data);
	}
}