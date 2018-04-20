package SnapShop;
/**
 * Filter that changes the image to it's negative self  255 - RGB
 */
public class UnsharpMaskFilter implements Filter {
	public void filter(PixelImage pi) {
		Pixel[][] data = pi.getData();
		Pixel[][] tempImage = pi.getData();
		
		for (int row = 1; row < pi.getHeight() - 2; row++) {
			for (int col = 1; col < pi.getWidth() - 2; col++) {
				
				int centerPixelRED = data[row][col].red * 28;
				int addRED = 0;
				int centerPixelBLUE = data[row][col].blue * 28;
				int addBLUE = 0;
				int centerPixelGREEN = data[row][col].green * 28;
				int addGREEN = 0;
				
				for (int row3x3 = 0; row3x3 < 3; row3x3++){
					for (int col3x3 = 0; col3x3 < 3; col3x3++){
						if (row3x3 != 1 || col3x3 != 1){
							if (row3x3 + col3x3 % 2 == 0){
								addRED -= tempImage[row - 1 + row3x3][col - 1 + col3x3].red;	
								addBLUE -= tempImage[row - 1 + row3x3][col - 1 + col3x3].blue;
								addGREEN -= tempImage[row - 1 + row3x3][col - 1 + col3x3].green;
								
							}
							else{
								addRED -= 2 * tempImage[row - 1 + row3x3][col - 1 + col3x3].red;	
								addBLUE -= 2 * tempImage[row - 1 + row3x3][col - 1 + col3x3].blue;
								addGREEN -= 2 * tempImage[row - 1 + row3x3][col - 1 + col3x3].green;
							}
							
							
						}
					}
				}
				
				
				centerPixelRED = (addRED + centerPixelRED);
				centerPixelRED /= 16;
				centerPixelRED = Math.max(0, centerPixelRED);
				centerPixelRED = Math.min(255, centerPixelRED);
				
				data[row][col].red = centerPixelRED;
				
				
				centerPixelBLUE = (addBLUE + centerPixelBLUE);
				centerPixelBLUE /= 16;
				centerPixelBLUE = Math.max(0, centerPixelBLUE);
				centerPixelBLUE = Math.min(255, centerPixelBLUE);
				
				data[row][col].blue = centerPixelBLUE;
				
				
				centerPixelGREEN = (addGREEN + centerPixelGREEN);
				centerPixelGREEN /= 16;
				centerPixelGREEN = Math.max(0, centerPixelGREEN);
				centerPixelGREEN = Math.min(255, centerPixelGREEN);
				
				data[row][col].green = centerPixelGREEN;

			}
		}
		pi.setData(data);
	}
}