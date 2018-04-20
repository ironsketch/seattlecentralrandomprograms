import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MainClass {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				createGUI();
			}
		}
		);
	}
	
	public static void createGUI(){
		// the model
		PolygonModel model = new PolygonModel();
		// a view
		PolygonPanel panel = new PolygonPanel();
		// a frame fr the view
		JFrame frame = new JFrame("Poop Bucket");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.add(panel);
		
		//create button
		JButton button = new JButton("Draw polygon");
		JPanel southPanel = new JPanel();
		southPanel.add(button);
		frame.add(southPanel,BorderLayout.SOUTH);
		
		// the controller
		PolygonController controller = new PolygonController(model);
		button.addActionListener(controller);
		panel.addComponentListener(controller);
		
		// make frame visible 
		frame.setVisible(true);
		
		model.setArea(panel.getWidth(), panel.getHeight());
		model.createPolygon();
		model.addView(panel);
	}
	

}
