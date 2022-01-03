package lecture;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame {
	public BorderLayoutTest() {
		this.setSize(500, 500);
		this.setVisible(true);
		this.setTitle("BORDER LAYOUT TEST");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout(10,20));   // 여백 만들기
		
		contentPane.add(new JButton("add"),BorderLayout.NORTH);
		contentPane.add(new JButton("subtract"),BorderLayout.SOUTH);
		contentPane.add(new JButton("multiply"),BorderLayout.EAST);
		contentPane.add(new JButton("divide"),BorderLayout.WEST);
		contentPane.add(new JButton("calc"),BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		new BorderLayoutTest();
	}
}
