import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics2D;

public class Main {
	
	private Frame mainFrame;
	private Label headerLabel;
	private Panel controlPanel;
	private Label statusLabel;
	
	public Main(){
		
		prepareGUI();
		
	}
	
	public static void main(String[] args){
		
		Main mainWindow = new Main();
		mainWindow.showFrameDemo();
		mainWindow.showCanvasDemo();
		
	}
	
	private void prepareGUI(){
		
		mainFrame = new Frame("Telepathy!");
		mainFrame.setSize(900,800);
		mainFrame.setLayout(new GridLayout(3,1));
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}
		});
		headerLabel = new Label();
		headerLabel.setAlignment(Label.CENTER);
		
		statusLabel = new Label();
		statusLabel.setAlignment(Label.CENTER);
		statusLabel.setSize(350,100);
		
		controlPanel = new Panel();
		controlPanel.setLayout(new FlowLayout());
		
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		
	}
	
	private void showFrameDemo(){
		headerLabel.setText("Container in action: Frame");
		
		final Frame frame = new Frame();
		frame.setSize(300, 300);
		frame.setLayout(new FlowLayout());
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
				frame.dispose();
			}
		});
		
		Button okButton = new Button("Open a Frame");
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				statusLabel.setText("A Frame shown to the user.");
				frame.setVisible(true);
				
			}
		});
		
		controlPanel.add(okButton);
		
		mainFrame.setVisible(true);
		
	}
	private void showCanvasDemo(){
	      headerLabel.setText("Control in action: Canvas"); 

	      controlPanel.add(new MyCanvas());
	      mainFrame.setVisible(true);  
	   } 
	class MyCanvas extends Canvas {

	      public MyCanvas () {
	         setBackground (Color.GRAY);
	         setSize(300, 300);
	         Rectangle poop = new Rectangle(100,100);
	    	 
	      }

	      public void paint (Graphics g) {
	    	 
	         Graphics2D g2;
	         g2 = (Graphics2D) g;
	         g2.drawString ("It is a custom canvas area", 70, 70);
	         
	      }
	   }
	
}
