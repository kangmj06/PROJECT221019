import javax.swing.*;
import java.awt.*;
public class Ex12 extends JFrame {
	public Ex12() {
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout(7, 5));
		c.add(new JButton("Center"), BorderLayout.CENTER);
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("West"), BorderLayout.WEST);
		setSize(400, 200); 
		setVisible(true); 
	}
	public static void main(String[] args) {
		new Ex12();
	}
}
