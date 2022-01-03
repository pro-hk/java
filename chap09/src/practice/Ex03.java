package practice;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex03 extends JFrame {
	public Ex03() {
		
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new GridLayout(1,10));
		JButton btns[] = new JButton[10]; 
		int total = btns.length;
		for(int i=0;i<total;i++) {
			btns[i] = new JButton(Integer.toString(i));
//			btns[i] = new JButton(""+i);
			contentPane.add(btns[i]);
		}
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex03();
	}
}
