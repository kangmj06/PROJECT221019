import javax.swing.*;
import java.awt.*;
public class Ex17 extends JFrame {
	public Ex17() {
		setTitle("계산기 프레임");
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
		NorthPanel.add(new JLabel("수식입력"));
		NorthPanel.add(new JTextField(20));
		
		CenterPanel.setLayout(new GridLayout(4,4,4,4));
		for(int i = 0; i < 16; i++) {
			JButton btn = new JButton();
			String[] str = {"CE", "계산", "+", "-", "x", "/"};
			if(i<10) 
				btn.setText(Integer.toString(i));
			else 
				btn.setText(str[i-10]);
			if(i>11) {
				btn.setBackground(Color.CYAN);
			}
			CenterPanel.add(btn);
		}	
		
		SouthPanel.setBackground(Color.YELLOW);
		SouthPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		SouthPanel.add(new JLabel("계산 결과"));
		SouthPanel.add(new JTextField(15));
		
		setSize(300, 300);
		setVisible(true);
		}
	public static void main(String[] args) {
		new Ex17();
	}
}