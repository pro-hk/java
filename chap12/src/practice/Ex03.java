package practice;

import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex03 extends JFrame {
	public Ex03() {
		setTitle("이미지 레이블 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = this.getContentPane();
		contentPane.setLayout(null);

		ImageIcon imgIcon = new ImageIcon("images/apple.png");
		JLabel imgLabel = new JLabel(imgIcon);
		imgLabel.setSize(imgIcon.getIconWidth(), imgIcon.getIconHeight());
		imgLabel.setLocation(100, 100);

		MyMouseListner listener = new MyMouseListner();
		imgLabel.addMouseListener(listener);
		imgLabel.addMouseMotionListener(listener);

		contentPane.add(imgLabel);

		setSize(300, 300);
		setVisible(true);
	}
	
	class MyMouseListner extends MouseAdapter {
		Point pressedPoint;

		public void mousePressed(MouseEvent e) {
			JLabel label = (JLabel) e.getSource();
			pressedPoint = e.getPoint();
		}

		public void mouseReleased(MouseEvent e) {
			JLabel label = (JLabel) e.getSource();
			Point mousePoint = e.getPoint();
			Point labelPoint = label.getLocation();

			int posX = labelPoint.x + mousePoint.x;
			int posY = labelPoint.y + mousePoint.y;
			label.setLocation(posX - pressedPoint.x, posY - pressedPoint.y);
			label.getParent().repaint();
		}

		public void mouseDragged(MouseEvent e) {
			JLabel label = (JLabel) e.getSource();
			Point mousePoint = e.getPoint();
			Point labelPoint = label.getLocation();
			int posX = labelPoint.x + mousePoint.x;
			int posY = labelPoint.y + mousePoint.y;
			label.setLocation(posX - pressedPoint.x, posY - pressedPoint.y);
			label.getParent().repaint();
		}
	}

	class ImgPanel extends JPanel {

	}

	public static void main(String[] args) {
		new Ex03();
	}
}
