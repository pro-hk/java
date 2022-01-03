package lecture;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullLayoutTest extends JFrame {
	public NullLayoutTest() {
		setSize(600, 500);
		setVisible(true);
		setTitle("Null Layout Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(null);  // default ∞° BorderLayout ¿Ã¥Ÿ.
		
		JLabel label = new JLabel("Hello");
		contentPane.add(label);
		label.setLocation(0, 0);
		label.setSize(600, 50);
		label.setOpaque(true);
		label.setBackground(Color.orange);
		for(int i=0;i<12;i++) {
			JButton btn = new JButton("button"+i);
			contentPane.add(btn);
			btn.setSize(200, 50);
			btn.setLocation(200*(i%3),60+50*(i/3));
		}
//		JButton btn01 = new JButton("button01");
//		contentPane.add(btn01);
//		btn01.setSize(200, 50);
//		btn01.setLocation(0,60);
//		JButton btn02 = new JButton("button02");
//		contentPane.add(btn02);
//		btn02.setSize(200, 50);
//		btn02.setLocation(200,60);
//		JButton btn03 = new JButton("button03");
//		contentPane.add(btn03);
//		btn03.setSize(200, 50);
//		btn03.setLocation(400,60);
	}
	public static void main(String[] args) {
		new NullLayoutTest();
	}
}
