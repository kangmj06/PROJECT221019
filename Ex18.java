import javax.swing.*;
import java.awt.*;
public class Ex18 extends JFrame {
	public Ex18() {
		setTitle("여러 개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JPanel NorthPanel = new JPanel();
		JPanel CenterPanel = new JPanel();
		JPanel SouthPanel = new JPanel();
		c.add(NorthPanel, BorderLayout.NORTH);
		c.add(CenterPanel, BorderLayout.CENTER);
		c.add(SouthPanel, BorderLayout.SOUTH);
		
		NorthPanel.setBackground(Color.LIGHT_GRAY);
		NorthPanel.setLayout(new FlowLayout());
		NorthPanel.add(new JButton("열기"));
		NorthPanel.add(new JButton("닫기"));
		NorthPanel.add(new JButton("나가기"));
		
		CenterPanel.setLayout(null);
		JLabel [] label = new JLabel[10];
		int randNum1 = 0;
		int randNum2 = 0;
		for(int i = 0; i < 10; i++) {
			label[i] = new JLabel("*");
			randNum1 = (int)(Math.random()*200)+50;
			randNum2 = (int)(Math.random()*150)+50;
			label[i].setBounds(randNum1, randNum2, 20, 20);
			label[i].setForeground(Color.RED);
			c.add(label[i]);
		}
		SouthPanel.setBackground(Color.YELLOW);
		SouthPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		SouthPanel.add(new JButton("Word Input"));
		SouthPanel.add(new JTextField(15));
		
		setSize(300, 300);
		setVisible(true);
		}
	public static void main(String[] args) {
		new Ex18();
	}
}