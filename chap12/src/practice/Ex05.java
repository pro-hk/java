package practice;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex05 extends JFrame {
	private ImgPanel imgPanel = new ImgPanel();
	
	public Ex05() {
		setTitle("그래픽 이미지 확대 축소 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(imgPanel);

		setSize(500, 500);
		setVisible(true);
	}

	class ImgPanel extends JPanel {
		private ImageIcon imgIcon = new ImageIcon("images/apple.png");
		private Image img = imgIcon.getImage();
		private int w;
		private int h;
//		double width = imgIcon.getIconWidth();
//		double height = imgIcon.getIconHeight();

		public ImgPanel() {
			w = img.getWidth(this);
			h = img.getHeight(this);
			setFocusable(true);
			requestFocus();
			
			addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					System.out.println(e.getKeyCode());
					if(e.getKeyChar()=='+') {
						w = (int)(w * 1.1);
						h = (int)(h * 1.1);
						repaint();
					} else if(e.getKeyCode()==KeyEvent.VK_SUBTRACT) {
						w = (int)(w * 0.9);
						h = (int)(h * 0.9);
						repaint();
					}
				}
			});
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 10, 10, w, h, this);
		}
	}

	public static void main(String[] args) {
		new Ex05();
	}
}
