import java.awt.*;
import javax.swing.*;

class NorthPanel extends JPanel {
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout());
		add(new JButton("Open")); 
		add(new JButton("Read")); 
		add(new JButton("Close")); 
	}
}

class CenterPanel extends JPanel {
	public CenterPanel() {
		setLayout(null); 
		
		JLabel a = new JLabel("Hello"); 
		a.setSize(100,20);
		a.setLocation(100, 10); 
		add(a);
		
		JLabel b = new JLabel("Love"); 
		b.setSize(100,20);
		b.setLocation(200, 50); 
		add(b);
		
		JLabel c = new JLabel("Java"); 
		c.setSize(100,20);
		c.setLocation(10, 70); 
		add(c);
	}		
}

public class Exopen extends JFrame {
	public Exopen() {
		setTitle("Open Challenge 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new NorthPanel(), BorderLayout.NORTH); 
		add(new CenterPanel(), BorderLayout.CENTER); 
		setSize(300,300);
		setVisible(true);
	}
		
	static public void main(String[] arg) {
		new Exopen();
	}
}