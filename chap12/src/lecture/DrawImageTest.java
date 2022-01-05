package lecture;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawImageTest extends JFrame {
	private ImgPanel imgPanel = new ImgPanel();
	
	public DrawImageTest() {
		setTitle("그림 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(imgPanel);
		
		setSize(800,800);
		setVisible(true);
		
	}
	
	class ImgPanel extends JPanel{
		private ImageIcon imgIcon = new ImageIcon("images/abc.png");
		private Image img = imgIcon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);  // repaint();  동일함
			g.setClip(50, 50, 300, 300);  // 사진을 (50,50) to (300,300) 구간만 짜르겠다
			g.drawImage(img, 0, 0, this.getWidth(),this.getHeight(), this);  // this.getWidth(), this.getHeight : 화면에 꽉 참(크기 지정 가능)
//			g.drawImage(img, 0, 0, 300, 300, 100,100,300,300, this);  // (0,0) to (300,300) 그리겠다. 사진의 (100,100) to (300,300) 내용
			g.setFont(new Font("Arial",Font.BOLD,48));
			g.setColor(Color.red);
			g.drawString("IU", 100, 100);
		}
	}
	
	public static void main(String[] args) {
		new DrawImageTest();
	}
}
