package practice;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex08 extends JFrame {
	private MyPanel myPanel = new MyPanel();

	public Ex08() {
		setTitle("마우스로 원 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(myPanel);

		setSize(600, 600);
		setVisible(true);
	}

	class Circle {
		public int x;
		public int y;
		public int radius;

		public Circle() {

		}

		public Circle(int x, int y, int radius) {
			this.x = x;
			this.y = y;
			this.radius = radius;
		}
		public Point getCenterPoint() {
			return new Point(x-radius,y-radius);
		}
		public int getDiameter() {
			return this.radius*2;
		}
	}

	class MyPanel extends JPanel {
		private Vector<Circle> circleVec = new Vector<>();
		private Circle currentCircle;

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.blue);
			for(int i=0;i<circleVec.size();i++) {
				Circle circle = circleVec.get(i);
				g.drawOval(circle.x-circle.radius, 
						   circle.y-circle.radius, 
						   circle.radius*2, circle.radius*2);
			}
			g.drawOval(currentCircle.getCenterPoint().x, 
					   currentCircle.getCenterPoint().y, 
					   currentCircle.getDiameter(), currentCircle.getDiameter());
		}

		public MyPanel() {
			MyMouseListener listener = new MyMouseListener();
			addMouseListener(listener);
			addMouseMotionListener(listener);
		}

		class MyMouseListener extends MouseAdapter {
			private Point pressedPoint;
			private Point releasedPoint;
			
			public void mousePressed(MouseEvent e) {
				pressedPoint = e.getPoint();
			}

			public void mouseReleased(MouseEvent e) {
				releasedPoint = e.getPoint();
				int w = releasedPoint.x - pressedPoint.x;
				int h = releasedPoint.y - pressedPoint.y;
				int dist = w*w + h*h;
				int radius = (int)Math.sqrt(dist);
				Circle circle = new Circle(pressedPoint.x,pressedPoint.y,radius);
				circleVec.add(circle);
				repaint();
			}

			public void mouseDragged(MouseEvent e) {
				releasedPoint = e.getPoint();
				int w = releasedPoint.x - pressedPoint.x;
				int h = releasedPoint.y - pressedPoint.y;
				int dist = w*w + h*h;
				int radius = (int)Math.sqrt(dist);
				currentCircle = new Circle(pressedPoint.x,pressedPoint.y,radius);
				repaint();
			}
		}
	}

	public static void main(String[] args) {
		new Ex08();
	}
}
