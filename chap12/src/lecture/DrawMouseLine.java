package lecture;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawMouseLine extends JFrame {
	private DrawPanel drawPanel = new DrawPanel();

	public DrawMouseLine() {
		setTitle("마우스로 그림그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setContentPane(drawPanel);

		setSize(500, 500);
		setVisible(true);
	}

	class DrawPanel extends JPanel {
		private Vector<Point> startVec = new Vector<>();
		private Vector<Point> endVec = new Vector<>();
		public DrawPanel() {
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					Point endPoint = e.getPoint();
					endVec.add(endPoint);
					repaint();
				}
				@Override
				public void mousePressed(MouseEvent e) {
					Point startPoint = e.getPoint();
					startVec.add(startPoint);
				}
				
			});
		}

		public void paintComponent(Graphics g) {
//			repaint();
			super.paintComponent(g);
			g.setColor(Color.red);
			g.drawLine(100, 100, 200, 200);
			for(int i=0;i<startVec.size();i++) {
				Point startPoint = startVec.elementAt(i);
				Point endPoint = endVec.elementAt(i);
//				System.out.println(startPoint.getX());
//				System.out.println(startPoint.getY());
				g.drawLine((int)startPoint.getX(), (int)startPoint.getY(), (int)endPoint.getX(), (int)endPoint.getY());
			}
		}
	}

	public static void main(String[] args) {
		new DrawMouseLine();
	}
}
