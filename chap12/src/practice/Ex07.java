package practice;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex07 extends JFrame {
	private MyPanel myPanel = new MyPanel();
	
	public Ex07() {
		setTitle("마우스로 폐다각형 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(myPanel);
		
		pack();
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		private int x;
		private int y;
		
		
		private Vector<Integer> mouseXvec = new Vector<>();
		private Vector<Integer> mouseYvec = new Vector<>();
		
		public MyPanel() {
			setPreferredSize(new Dimension(300,300));
			addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					System.out.println(e.getX());
					mouseXvec.add(e.getX());
					mouseYvec.add(e.getY());
					repaint();
				}
			});
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.green);
			int posX[] = new int[mouseXvec.size()];
			int posY[] = new int[mouseYvec.size()];
			for(int i=0;i<mouseXvec.size();i++) {
				posX[i] = mouseXvec.get(i);
				posY[i] = mouseYvec.get(i);
			}
			g.drawPolygon(posX, posY, posX.length);
		}
	}
	
	public static void main(String[] args) {
		new Ex07();
	}
}
