import javax.swing.*;
import java.awt.*;
public class Ex15 extends JFrame {
	public Ex15() {
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(4,4));

		Color [] color = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN,
				Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY, Color.WHITE,
				Color.DARK_GRAY, Color.BLACK, Color.DARK_GRAY, Color.GRAY, Color.PINK };
		
		JLabel [] label = new JLabel[16];
		for(int i = 0; i < 16; i++) {
			label[i] = new JLabel(Integer.toString(i+1));
			label[i].setOpaque(true);
			label[i].setBackground(color[i]);
			contentPane.add(label[i]);
		}
		
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex15();
	}
}