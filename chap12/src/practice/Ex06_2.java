package practice;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex06_2 extends JFrame {
	private MyPanel myPanel = new MyPanel();
	
	public Ex06_2() {
		setTitle("그래픽 다각형 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(myPanel);
		
//		setResizable(false); -- 사이즈 변경 불가
		setSize(300,300);
//		setLocationRelativeTo(null); -- 화면 중앙에 위치
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		int w;
		int h;

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			w = getWidth();
			h = getHeight();
//			int posX[] = {w/2,0,w/2,w,w/2,10,w/2,w-10};
//			int posY[] = {0,h/2,h,h/2,10,h/2,h-10,h/2};
			int posX[] = new int[4];
			int posY[] = new int[4];
			
			posX[0] = w/2;
			posX[1] = 0;
			posX[2] = w/2;
			posX[3] = w;
			posY[0] = 0;
			posY[1] = h/2;
			posY[2] = h;
			posY[3] = h/2;
			for(int i=0;i<10;i++) {
				g.drawPolygon(posX, posY, 4);				
				posX[1] += 10;
				posX[3] -= 10;
				posY[0] += 10;
				posY[2] -= 10;
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex06_2();
	}
}
