package practice;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02 extends JFrame {
	private ImgPanel imgPanel = new ImgPanel();

	public Ex02() {
		setTitle("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(imgPanel);

		setSize(500, 500);
		setVisible(true);
	}

	class ImgPanel extends JPanel {
		private ImageIcon imageIcon = new ImageIcon("images/abc.png");
		private Image img = imageIcon.getImage();
		private int x,y;
		
		public ImgPanel() {
			addMouseMotionListener(new MouseAdapter() {
				@Override
				public void mouseDragged(MouseEvent e) {
					repaint();
					x = e.getX()-10;
					y = e.getY()-10;
				}
			});
		}

		public void paintComponent(Graphics g) {
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			g.setColor(Color.green);
			g.fillOval(x, y, 20, 20);
		}
	}

	public static void main(String[] args) {
		new Ex02();
	}
}
