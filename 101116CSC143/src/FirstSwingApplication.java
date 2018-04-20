import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FirstSwingApplication {

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
		// JFrame: a top level window
		JFrame frame = new JFrame("POOOOOOOOOP");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setVisible(true);
		//panel.getContentPane().setBackground(Color.BLACK);
		
		
		
		// a label
		JLabel label = new JLabel("Poop bucket");
		label.setFont(new Font("Courier", Font.BOLD, 25));
		label.setForeground(Color.DARK_GRAY);
		JPanel northPanel = new JPanel();
		northPanel.add(label);
		frame.add(northPanel, BorderLayout.NORTH);
		
		
		// a Button
		JButton button = new JButton("Draw a poopagon");
		JPanel southPanel = new JPanel();
		button.setBorderPainted(false);
		button.setFocusPainted(false);
		button.setBackground(Color.DARK_GRAY);
		button.setForeground(Color.WHITE);
		button.setOpaque(true);
		southPanel.add(button);
		frame.add(southPanel, BorderLayout.SOUTH);
		
		//a drawing panel
		JPanel panel = new JPanel(){
			private Random rand = new Random();
			@Override
			protected void paintComponent(Graphics g) {
				// Not needed but GOOD PRACTICE TO HAVE THIS
				super.paintComponent(g);
				//draw a random polypoop
				int n = rand.nextInt(10) + 5; // number of vertices 5 - 14
				int[] x = new int[n];
				int[] y = new int[n];
				
				for (int i = 0; i < n; i ++){
					x[i] = rand.nextInt(getWidth());
					y[i] = rand.nextInt(getHeight());
				}
				Polygon p = new Polygon(x,y,n);
				g.setColor(new Color (rand.nextInt()));
				g.fillPolygon(p);
				
			}
		};
		panel.setBackground(Color.BLACK);
		frame.add(panel);
		
		//add listener to butt
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				panel.repaint();
			}
			
		});
		
		frame.setVisible(true);
	}

}
