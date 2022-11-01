import javax.swing.*;
import java.awt.*;
public class Ex14 extends JFrame {
	public Ex14() {
		setTitle("Ten color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(1,10));

		Color [] color = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN,
				Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY };
		
		JButton [] btn = new JButton[10];
		for(int i = 0; i < 10; i++) {
			btn[i] = new JButton(Integer.toString(i));
			btn[i].setOpaque(true);
			btn[i].setBackground(color[i]);
			contentPane.add(btn[i]);
		}
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex14();
	}
}