package practice;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class BallonPanel extends JPanel {
	public BallonPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(500,500));
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
//				System.out.println("a");
				int speedX = (int)(Math.random()*10-5);
				int speedY = (int)(Math.random()*3 + 1);
				BalloonThread bt = new BalloonThread(e.getX()-32,e.getY()-32,e.getX()-32);
				bt.start();
			}
		});
	}
	
	class BalloonThread extends Thread {
		private JLabel balloon;
		private int speedX;
		private int speedY;
		private double t = 0;
		private int radius = 10;
		private int loadX;
		
		public BalloonThread(int x, int y, int loadX) {
			ImageIcon imgBalloon = new ImageIcon("images/chicken.png");
			balloon = new JLabel(imgBalloon);
			balloon.setSize(imgBalloon.getIconWidth(),imgBalloon.getIconHeight());
			balloon.setLocation(x, y);
			speedX = (int)(Math.random()*10-5);
			speedY = (int)(Math.random()*3+1);
			radius = (int)(Math.random()*20+10);
			this.loadX = loadX;
			add(balloon);
			repaint();
		}
		
		public void run() {
			while(true) {
				try {
					sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int currentX = (int)(Math.sin(t)*radius)+loadX;
				int currentY = balloon.getY()- speedY;
				balloon.setLocation(currentX, currentY);
				t += 0.1;
				if(currentY<-40) {
					remove(balloon);
					repaint();
					return;
				}
				repaint();
			}
		}
	}
}

public class Ex06 extends JFrame {
	public Ex06() {
		setTitle("버블게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new BallonPanel());
		
		setSize(500,500);
		setResizable(false);
		pack();
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex06();
	}
}
