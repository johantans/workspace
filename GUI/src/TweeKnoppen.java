import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class TweeKnoppen extends JFrame implements ActionListener { 
		private JButton cmdEen, cmdTwee; 
		private JTextField txtResultaat; 
		public TweeKnoppen() { 
			setTitle("Test met twee knoppen"); 
			} 
		
		public static void main (String[] args) { 
			TweeKnoppen frame = new TweeKnoppen(); 
			frame.createGUI(); 
			frame.pack(); 
			frame.setVisible(true); 
			} 
		
		private void createGUI() { 
			setDefaultCloseOperation(EXIT_ON_CLOSE); 
			setLayout(new FlowLayout() ); 
			cmdEen = new JButton("Een"); 
			cmdTwee = new JButton("Twee"); 
			add(cmdEen); 
			add(cmdTwee); 
			txtResultaat = new JTextField(30); 
			add(txtResultaat); 
			cmdEen.addActionListener(this); 
			cmdTwee.addActionListener(this); 
			} 
		
		@Override 
		public void actionPerformed(ActionEvent e) { 
			if (e.getSource() == cmdEen) 
				txtResultaat.setText("Er is op knop Een geklikt"); 
			else txtResultaat.setText("Er is op knop Twee geklikt"); 
			pack(); 
			} 
		}