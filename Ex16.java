import javax.swing.*;
import java.awt.*;
public class Ex16 extends JFrame {
	public Ex16() {
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		JLabel [] label = new JLabel[20];
		for(int i = 0; i < 20; i++) {
			label[i] = new JLabel(Integer.toString(i));
			int x = (int)(Math.random()*200)+50;
			int y = (int)(Math.random()*200)+50;
			label[i].setLocation(x,y);
			label[i].setBackground(Color.BLUE);
			label[i].setSize(10,10);
			label[i].setOpaque(true);
			contentPane.add(label[i]);
		}
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex16();
	}
}