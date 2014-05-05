import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class Begroeting extends JFrame implements ActionListener{ 
	private JTextField tekstveld; 
	private JLabel tekst, antwoord; 
	private JButton knop;
	
	public Begroeting() {
		setTitle("Welkom"); 
	} 
	
	public static void main (String[] args) { 
		Begroeting frame = new Begroeting(); 
		frame.createGUI(); 
		frame.pack(); 
		frame.setVisible(true); 
		} 
	
	private void createGUI() { 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setLayout(new FlowLayout() ); 
		tekst = new JLabel("Geef uw naam: "); 
		tekstveld = new JTextField(20); 
		knop = new JButton("Klik mij"); 
		antwoord = new JLabel(); 
		add(tekst); 
		add(tekstveld); 
		add(knop); 
		add(antwoord); 
		knop.addActionListener(this); 
		} 
	
	@Override public void actionPerformed(ActionEvent e) { 
		String t = " Welkom bij ons " + tekstveld.getText(); 
		antwoord.setText(t); 
		pack(); 
		} 
	}	
