import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/**
 * A controller listens to events of the application
 * and takes proper action
 * @author CSC 143
 *
 */
public class PolygonController extends ComponentAdapter implements ActionListener {
	// the model that contains the polygon data
	private PolygonModel model;
	
	public PolygonController(PolygonModel model) {
		this.model = model;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		model.createPolygon();
	}


	@Override
	public void componentResized(ComponentEvent e) {
		// Change the drawing area of the model
		model.setArea(e.getComponent().getWidth(), e.getComponent().getHeight());
		// create a new polygon
		model.createPolygon();
	}

	@Override
	public void componentShown(ComponentEvent e) {
		model.createPolygon();
	}

}





