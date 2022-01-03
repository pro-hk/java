package lecture;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest extends JFrame {
	public FlowLayoutTest() {
		this.setSize(500, 300);
		this.setVisible(true);
		this.setTitle("FLOW LAYOUT ¿¬½À");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("subtract"));
		contentPane.add(new JButton("multiply"));
		contentPane.add(new JButton("divide"));
	}
	public static void main(String[] args) {
		FlowLayoutTest flowlayout = new FlowLayoutTest();
	}
}
