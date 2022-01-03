package practice;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex04 extends JFrame {
	public Ex04() {
		
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new GridLayout(1,10));
		JButton btns[] = new JButton[10]; 
		Color colors[] = {Color.red,
						  Color.orange,
						  Color.yellow,
						  Color.green,
						  Color.cyan,
						  Color.blue,
						  Color.magenta,
						  Color.gray,
						  Color.pink,
						  Color.lightGray};
		int total = btns.length;
		for(int i=0;i<total;i++) {
			btns[i] = new JButton(Integer.toString(i));
//			btns[i] = new JButton(""+i);
			btns[i].setOpaque(true);  // 불투명도
//			btns[i].setBackground(colors[i]);
			btns[i].setBackground(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
			btns[i].setForeground(Color.white);  // 글자색
			contentPane.add(btns[i]);
		}
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex04();
	}
}
