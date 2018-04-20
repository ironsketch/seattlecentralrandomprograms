package SnapShop;
/**
 * Filter that changes the image to it's negative self  255 - RGB
 */
public class BrightEyesFilter implements Filter {
	public void filter(PixelImage pi) {
		Pixel[][] data = pi.getData();
		Pixel[][] tempImage = pi.getData();
		
		for (int row = 1; row < pi.getHeight() - 2; row++) {
			for (int col = 1; col < pi.getWidth() - 2; col++) {
				
				int centerPixelRED = data[row][col].red * 8;
				
				int centerPixelBLUE = data[row][col].blue * 8;
				
				int centerPixelGREEN = data[row][col].green * 8;
				
				for (int row3x3 = 0; row3x3 < 3; row3x3++){
					for (int col3x3 = 0; col3x3 < 3; col3x3++){
						if (row3x3 != 1 && col3x3 != 1){
							tempImage[row - 1 + row3x3][col - 1 + col3x3].red = centerPixelRED - data[row - 1 + row3x3][col - 1 + col3x3].red;
							tempImage[row - 1 + row3x3][col - 1 + col3x3].red = Math.max(0, tempImage[row - 1 + row3x3][col - 1 + col3x3].red);
							tempImage[row - 1 + row3x3][col - 1 + col3x3].red = Math.min(255, tempImage[row - 1 + row3x3][col - 1 + col3x3].red);
						
							tempImage[row - 1 + row3x3][col - 1 + col3x3].blue = centerPixelBLUE - data[row - 1 + row3x3][col - 1 + col3x3].blue;
							tempImage[row - 1 + row3x3][col - 1 + col3x3].blue = Math.max(0, tempImage[row - 1 + row3x3][col - 1 + col3x3].blue);
							tempImage[row - 1 + row3x3][col - 1 + col3x3].blue = Math.min(255, tempImage[row - 1 + row3x3][col - 1 + col3x3].blue);
						
							tempImage[row - 1 + row3x3][col - 1 + col3x3].green = centerPixelGREEN - data[row - 1 + row3x3][col - 1 + col3x3].green;
							tempImage[row - 1 + row3x3][col - 1 + col3x3].green = Math.max(0, tempImage[row - 1 + row3x3][col - 1 + col3x3].green);
							tempImage[row - 1 + row3x3][col - 1 + col3x3].green = Math.min(255, tempImage[row - 1 + row3x3][col - 1 + col3x3].green);
							
						}
					}
				}

			}
		}
		data = tempImage;
		pi.setData(data);
	}
}