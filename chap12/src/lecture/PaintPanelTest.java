package lecture;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintPanelTest extends JFrame {
	private MyPanel myPanel = new MyPanel();
	
	public PaintPanelTest() {
		setTitle("PaintPanelTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(myPanel);  // ���� JFrame�� ���� �ִ� Container(Panel)�� ���� ����ŷ� �ٲ�ġ��
		
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			g.setColor(Color.blue);
			g.drawRect(10, 10, 50, 50);   // (10,10) ����  50X50������
			g.setColor(Color.red);
			g.drawRect(50, 50, 50, 50);   // (50,50) 50X50
			g.setColor(Color.green);
			g.drawRect(90, 90, 50, 50);   // (90,90) 50X50
//			super.paintComponent(g);  // ������ �ִ� �͵� ����� ����
		}
	}
	
	public static void main(String[] args) {
		new PaintPanelTest();
	}
}
