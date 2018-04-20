package SnapShop;

/**
 * Filter that changes the image to it's negative self  255 - RGB
 */
public class MatrixFilter implements Filter {
	public void filter(PixelImage pi) {
		Pixel[][] data = pi.getData();
		
		for (int row = 1; row < pi.getHeight() - 2; row++) {
			for (int col = 1; col < pi.getWidth() - 2; col++) {
				int centerPixelRED = data[row][col].red * 8;
				int centerPixelBLUE = data[row][col].blue * 8;
				int centerPixelGREEN = data[row][col].green * 8;
				for (int row3x3 = 0; row3x3 < 3; row3x3++){
					for (int col3x3 = 0; col3x3 < 3; col3x3++){
							centerPixelRED = data[row - 1 + row3x3][col - 1 + col3x3].red - centerPixelRED;
							centerPixelRED = Math.max(0, centerPixelRED);
							centerPixelRED = Math.min(255, centerPixelRED);
							data[row - 1 + row3x3][col - 1 + col3x3].red = centerPixelRED;
						
							centerPixelBLUE = data[row - 1 + row3x3][col - 1 + col3x3].blue - centerPixelBLUE;
							centerPixelBLUE = Math.max(0, centerPixelBLUE);
							centerPixelBLUE = Math.min(255, centerPixelBLUE);
							data[row - 1 + row3x3][col - 1 + col3x3].blue = centerPixelRED;
						
							centerPixelGREEN = data[row - 1 + row3x3][col - 1 + col3x3].green - centerPixelGREEN;
							centerPixelGREEN = Math.max(0, centerPixelGREEN);
							centerPixelGREEN = Math.min(255, centerPixelGREEN);
							data[row - 1 + row3x3][col - 1 + col3x3].green = centerPixelGREEN;
						
					}
				}

			}
		}
		

		pi.setData(data);
	}
}