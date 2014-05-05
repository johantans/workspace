
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUITest extends JFrame { 
	
	private JLabel label; 
	public static void main(String[] args) { 
		GUITest frame = new GUITest(); 
		frame.createGUI(); 
		frame.pack(); 
		frame.setVisible(true); 
		} 
	
	private void createGUI() { 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setLayout(new FlowLayout()); 
		label = new JLabel("Hello World! "); 
		add(label); 
		} 
	}
