package practice;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

class CirclePanel extends JPanel implements Runnable{
	private int x = 100;
	private int y = 100;
	private Thread th;
	
	public CirclePanel() {
		th = new Thread(this);
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				th.start();
			}
		});
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(300);
				x = (int)(Math.random()*getWidth());
				y = (int)(Math.random()*getHeight());
				repaint();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.magenta);
		g.drawOval(x, y, 100, 100);
	}
}

public class Ex02 extends JFrame  {
	public Ex02() {
		setTitle("원을 0.5초 간격으로 ..");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new CirclePanel());
		

		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
}
