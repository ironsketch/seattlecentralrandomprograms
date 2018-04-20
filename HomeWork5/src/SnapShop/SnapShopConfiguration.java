package SnapShop;

// MICHELLE BERGIN REPORT!
/*
 * 
 * I created many extra filters by just making mistakes. When I code, I love just hacking at it and playing with code.
 * I like destroying it and recreating it. And when I am frustrated beyond belief I ask for help! In this process I created 
 * my favorite design, Lift me higher. It creates a prism of specific points and double cascades them down! I love the colors
 * and designs. 
 * 
 * I found most difficult figuring out what I was ACTUALLY AFFECTING. Which pixel square do I update? divide? modify!? I figured
 * it out after many headaches but that is definitly what was most difficult!
 * 
 * */

/**
 * A class to configure the SnapShop application
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class SnapShopConfiguration {
	/**
	 * Method to configure the SnapShop. Call methods like addFilter and
	 * setDefaultFilename here.
	 * 
	 * @param theShop
	 *            A pointer to the application
	 */
	public static void configure(SnapShop theShop) {

		theShop.setDefaultFilename("/Users/Spekter/Documents/School/JavaClass/billg.jpg");
		theShop.addFilter(new FlipHorizontalFilter(), "Flip Horizontal");
		theShop.addFilter(new FlipVerticalFilter(), "Flip Vertically");
		theShop.addFilter(new NegativeFilter(), "Negatize me Captain!");
		theShop.addFilter(new GaussianBlurFilter(), "Gaussuan BLUR");
		theShop.addFilter(new LaplacianFilter(), "Laplacian");
		theShop.addFilter(new UnsharpMaskFilter(), "Unsharp Mask");
		theShop.addFilter(new EdgyFilter(), "Edgy");
		theShop.addFilter(new LiftMeHigherFilter(), "Lift Me Higher");
		theShop.addFilter(new BrightEyesFilter(), "BrightEyed");
		theShop.addFilter(new MatrixFilter(), "Matrixy me!");
		theShop.addFilter(new PrismShiftFilter(), "Prism Shift");
		// add your other filters below
	}
}