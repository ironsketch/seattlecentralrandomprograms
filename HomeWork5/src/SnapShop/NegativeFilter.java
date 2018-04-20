package SnapShop;
/**
 * Filter that changes the image to it's negative self  255 - RGB
 */
public class NegativeFilter implements Filter {
	public void filter(PixelImage pi) {
		Pixel[][] data = pi.getData();

		for (int row = 0; row < pi.getHeight(); row++) {
			for (int col = 0; col < pi.getWidth(); col++) {
				data[row][col].red = Math.abs(255 - data[row][col].red);
				data[row][col].blue = Math.abs(255 - data[row][col].blue);
				data[row][col].green = Math.abs(255 - data[row][col].green);
			}
		}

		pi.setData(data);
	}
}