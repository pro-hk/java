package practice;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex06 extends JFrame {
	private JLabel label = new JLabel("C");
	public Ex06() {
		setSize(300, 300);
		setVisible(true);
		setTitle("클릭 연습용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(null);

		label.addMouseListener(new Mouse());
		label.setLocation(100, 100);
		label.setSize(10,10);
		
		contentPane.add(label);
	}
	
	class Mouse implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent e) {
			int x = (int)(Math.random()*250+10);
			int y = (int)(Math.random()*250+10);
			label.setLocation(x, y);
		}
		@Override
		public void mousePressed(MouseEvent e) {}
		@Override
		public void mouseReleased(MouseEvent e) {}
		@Override
		public void mouseEntered(MouseEvent e) {}
		@Override
		public void mouseExited(MouseEvent e) {}
	}

	public static void main(String[] args) {
		new Ex06();
	}
}
