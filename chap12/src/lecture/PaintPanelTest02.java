package lecture;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintPanelTest02 extends JFrame {
	private MyPanel myPanel = new MyPanel();
	
	public PaintPanelTest02() {
		setTitle("PaintPanelTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(myPanel);  // 기존 JFrame이 갖고 있는 Container(Panel)을 내가 만든거로 바꿔치기
		
		setSize(300, 600);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			g.setColor(new Color(0xff0000));
			g.setFont(new Font("맑은 고딕",Font.BOLD,24));
			g.drawString("I Love Java", 50, 50);
			g.drawString("I Hate Java", 100, 100);
			super.paintComponent(g);
			for(int i=0;i<5;i++) {
				g.setFont(new Font("맑은 고딕",Font.BOLD,i*10+10));
				g.drawString("Hello"+i, 10, 50+50*i);
			}
			super.paintComponent(g);
			g.setColor(Color.red);
			g.drawLine(10, 10, 100, 100);  // (10,10) to (100,100)
			g.setColor(Color.blue);
			g.drawOval(50, 50, 10, 100);  // 시작점 (50,50), 가로 지름 100, 세로 지름 100
			super.paintComponent(g);
			for(int i=0;i<100;i++) {
				int x = (int)(Math.random()*150+25);
				int y = (int)(Math.random()*400+25);
				int re = (int)(Math.random()*256);
				int gr = (int)(Math.random()*256);
				int bl = (int)(Math.random()*256);
				g.setColor(new Color(re,gr,bl,255/2));
				g.drawRect(x, y, 100, 100);
			}
			super.paintComponent(g);
			g.drawArc(50, 100, 100, 100, 90, 270);  // 중심 (50,100) 가로길이 100, 세로길이 100, 시작위치, 그리는 각도(360 = 원)
			super.paintComponent(g);
			int polyX[] = {150,0,150,300};
			int polyY[] = {0,300,600,300};
			g.setColor(Color.cyan);
			g.fillPolygon(polyX, polyY, 4);  //  면
			g.drawPolygon(polyX,polyY,4);    //  선
		}
	}
	
	public static void main(String[] args) {
		new PaintPanelTest02();
	}
}
