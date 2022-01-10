package practice;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class SnowPanel extends JPanel{
	private ImageIcon bg = new ImageIcon("images/winter.jpg");
	private Image img = bg.getImage();
	private Vector<Point> snowVec = new Vector<>();
	private final int SNOW_AMOUNT = 50;   // 상수는 대문자가 관례
	private final int SNOW_RADIUS = 20;
	
	public SnowPanel() {
		setPreferredSize(new Dimension(1280,920));
		SnowThread snowTh = new SnowThread();
		addSnow();
		snowTh.start();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0, getWidth(), getHeight(),this);
		g.setColor(Color.white);
		for(int i=0;i<snowVec.size();i++) {
			Point point = snowVec.get(i);
//			int radius = (int)(Math.random()*10+10);
			g.fillOval(point.x, point.y, SNOW_RADIUS, SNOW_RADIUS);
		}
	}
	
	private void addSnow() {
		for(int i=0; i<SNOW_AMOUNT; i++) {
			int loadX = (int)(Math.random()*1280);
			int loadY = (int)(Math.random()*920);
			Point point = new Point(loadX,loadY);
			snowVec.add(point);
		}
	}
	
	class SnowThread extends Thread {
		public void run() {
			while(true) {
				try {
					sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for(int i=0; i<snowVec.size();i++) {
					int speedX = (int)(Math.random()*6-3);
					Point point = snowVec.get(i);
					point.y += (int)(Math.random()*3);
					point.x += speedX;
					if(point.y>940) {
						point.x = (int)(Math.random()*1280);
						point.y = -20;
					}
				}
				repaint();
			}
		}
	}
}

public class Ex08 extends JFrame {
	public Ex08() {
		setTitle("눈 내리는 샤갈의 마을");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new SnowPanel());
		
		setSize(500,500);
		setResizable(false);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex08();
	}
}
