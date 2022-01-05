package practice;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex11 extends JFrame {
	private MyPanel myPanel = new MyPanel();
	
	public Ex11() {
		setTitle("파이 차트 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(myPanel);
		
		setSize(500,500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red);
			g.fillArc(100, 100, 50, 50, 0, 360 * 26 / 100);
			g.setColor(Color.blue);
			g.fillArc(100, 100, 50, 50, 360 * (0+26) / 100, 360 * 17 / 100);
			g.setColor(Color.magenta);
			g.fillArc(100, 100, 50, 50, 360 * (0+26+17)/100, 360 * 21 / 100);
			g.setColor(Color.yellow);
			g.fillArc(100, 100, 50, 50, 360 * (0+26+17+21)/100, 360 * 36 / 100 );
			
		}
	}
	
	public static void main(String[] args) {
		new Ex11();
	}
}
