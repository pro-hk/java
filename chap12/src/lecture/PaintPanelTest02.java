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
		
		this.setContentPane(myPanel);  // ���� JFrame�� ���� �ִ� Container(Panel)�� ���� ����ŷ� �ٲ�ġ��
		
		setSize(300, 600);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			g.setColor(new Color(0xff0000));
			g.setFont(new Font("���� ���",Font.BOLD,24));
			g.drawString("I Love Java", 50, 50);
			g.drawString("I Hate Java", 100, 100);
			super.paintComponent(g);
			for(int i=0;i<5;i++) {
				g.setFont(new Font("���� ���",Font.BOLD,i*10+10));
				g.drawString("Hello"+i, 10, 50+50*i);
			}
			super.paintComponent(g);
			g.setColor(Color.red);
			g.drawLine(10, 10, 100, 100);  // (10,10) to (100,100)
			g.setColor(Color.blue);
			g.drawOval(50, 50, 10, 100);  // ������ (50,50), ���� ���� 100, ���� ���� 100
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
			g.drawArc(50, 100, 100, 100, 90, 270);  // �߽� (50,100) ���α��� 100, ���α��� 100, ������ġ, �׸��� ����(360 = ��)
			super.paintComponent(g);
			int polyX[] = {150,0,150,300};
			int polyY[] = {0,300,600,300};
			g.setColor(Color.cyan);
			g.fillPolygon(polyX, polyY, 4);  //  ��
			g.drawPolygon(polyX,polyY,4);    //  ��
		}
	}
	
	public static void main(String[] args) {
		new PaintPanelTest02();
	}
}
