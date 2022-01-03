package practice;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex06 extends JFrame {
	public Ex06(){
		setSize(250, 250);
		setVisible(true);
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(null);
		JLabel labels[] = new JLabel[10];
		for(int i=0;i<labels.length;i++) {
			labels[i] = new JLabel();
			// Math.random() * (max - min) + min;
			int x = (int)(Math.random()*150) + 50;
			int y = (int)(Math.random()*150) + 50;
			labels[i].setLocation(x, y);
			labels[i].setSize(10, 10);
			labels[i].setOpaque(true);
			labels[i].setBackground(Color.blue);
			contentPane.add(labels[i]);
		}
	}
	public static void main(String[] args) {
		new Ex06();
	}
}
