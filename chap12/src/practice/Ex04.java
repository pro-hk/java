package practice;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex04 extends JFrame {
	public Ex04() {
		setTitle("이미지 레이블 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(new ImgPanel());

		setSize(300, 300);
		setVisible(true);
	}

	class ImgPanel extends JPanel {
		private ImageIcon imgIcon = new ImageIcon("images/apple.png");
		private Image img = imgIcon.getImage();
		private int w;
		private int h;
		private int posX = 100;
		private int posY = 100;

		public ImgPanel() {
			w = img.getWidth(this);
			h = img.getHeight(this);
			MyMouseListner listener = new MyMouseListner();
			addMouseListener(listener);
			addMouseMotionListener(listener);
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, posX, posY, w, h, this);
		}

		class MyMouseListner extends MouseAdapter {
			private Point pressedPoint;
			private boolean isDrag = false;

			public void mousePressed(MouseEvent e) {
				JPanel panel = (JPanel) e.getSource();
				pressedPoint = e.getPoint();
				if(posX <= pressedPoint.x && posX+w >= pressedPoint.x &&
				   posY <= pressedPoint.y && posY+h >= pressedPoint.y) {
					isDrag = true;
				}
			}

			public void mouseReleased(MouseEvent e) {
				JPanel panel = (JPanel) e.getSource();
				Point mousePoint = e.getPoint();
				isDrag = false;
				repaint();
			}

			public void mouseDragged(MouseEvent e) {
				if(isDrag==false) return;
				Point mousePoint = e.getPoint();
				posX = posX + mousePoint.x - pressedPoint.x;
				posY = posY + mousePoint.y - pressedPoint.y;
				pressedPoint = mousePoint;
				repaint();
			}
		}
	}

	public static void main(String[] args) {
		new Ex04();
	}
}
