package lecture;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class test extends JFrame {
	public test() {
		setTitle("독립적인 클래스로 존재하는 이벤트 리스너");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JButton btn01 = new JButton("CLICK");
		JButton btn02 = new JButton("CLOSE");
		JButton btn03 = new JButton("OPEN");
		
		btn01.addActionListener(new MyActionListener());
		btn02.addActionListener(new MyActionListener());
		btn03.addActionListener(new MyActionListener());
		
		contentPane.add(btn01);
		contentPane.add(btn02);
		contentPane.add(btn03);
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new test();
	}
}
