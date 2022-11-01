import java.awt.*;
import javax.swing.*;

public class Ex1 extends JFrame {
	public Ex1() {
		this.setTitle("Let's study Java");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 200);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		Ex1 frame = new Ex1();
	}
}