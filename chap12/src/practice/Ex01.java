package practice;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex01 extends JFrame {
	private ImgPanel imgPanel = new ImgPanel();

	public Ex01() {
		setTitle("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(imgPanel);

		setSize(500, 500);
		setVisible(true);
	}

	class ImgPanel extends JPanel {
		private boolean isShow = false;
		private ImageIcon imageIcon = new ImageIcon("images/abc.png");
		private Image img = imageIcon.getImage();
		private JButton btn = new JButton("Hide/Show");

		public ImgPanel() {
			add(btn);
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Aaa");
					isShow = !isShow;  // toggle
					repaint();
				}
			});
		}

		public void paintComponent(Graphics g) {
			if(isShow) g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}
}
