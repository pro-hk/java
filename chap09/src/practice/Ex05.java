package practice;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex05 extends JFrame {
	public Ex05() {
		
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new GridLayout(4,4));
		JButton btns[] = new JButton[16];
		for(int i=0;i<btns.length;i++) {
			btns[i] = new JButton(""+i);
			btns[i].setOpaque(true);
			btns[i].setBackground(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
			btns[i].setForeground(Color.white);
			btns[i].setBorderPainted(false); // 테두리 삭제
			contentPane.add(btns[i]);
		}
		setSize(500, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex05();
	}
}
