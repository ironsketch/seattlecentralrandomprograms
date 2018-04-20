import java.awt.Graphics;

import javax.swing.JPanel;

// where we get polygon data
public class PolygonPanel extends JPanel implements View{
	private PolygonModel model;
	@Override
	public void update(PolygonModel model) {
		this.model = model;
		repaint();
		
	}
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if (model != null){ // could be that model has not been built yet
			// display the polygon
			g.setColor(model.getColor());
			g.fillPolygon(model.getPolygon());
		}
		
	}
}
