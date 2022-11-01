import javax.swing.*;
import java.awt.*;
public class Ex13 extends JFrame {
	public Ex13() {
		setTitle("Ten color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(1,10));
		contentPane.add(new JButton("0"));
		contentPane.add(new JButton("1"));
		contentPane.add(new JButton("2"));
		contentPane.add(new JButton("3"));
		contentPane.add(new JButton("4"));
		contentPane.add(new JButton("5"));
		contentPane.add(new JButton("6"));
		contentPane.add(new JButton("7"));
		contentPane.add(new JButton("8"));
		contentPane.add(new JButton("9"));
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex13();
	}
}