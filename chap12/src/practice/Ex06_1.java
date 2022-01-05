package practice;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex06_1 extends JFrame {
	private MyPanel myPanel = new MyPanel();
	
	public Ex06_1() {
		setTitle("격자 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(myPanel);
		
		setSize(300,300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		int w;
		int h;
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			w = this.getWidth();
			h = this.getHeight();
			System.out.println(w);
			for(int i=0;i<10;i++) {
				g.drawLine(w/10*i,0,w/10*i,h);
			}
			for(int i=1;i<10;i++) {
				g.drawLine(0,h/10*i,w,h/10*i);
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex06_1();
	}
}
