package lecture;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class MouseEventListenerTest extends JFrame {
	private JLabel label = new JLabel("HELLO");
	
	public MouseEventListenerTest() {
		setTitle("MouseEventListenerTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(null);
		
		contentPane.addMouseListener(new MyMouseListener());
		contentPane.add(label);
		label.setSize(50,30);

		setSize(500, 500);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {}
		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			label.setLocation(x, y);
		}
		@Override
		public void mouseReleased(MouseEvent e) {}
		@Override
		public void mouseEntered(MouseEvent e) {}
		@Override
		public void mouseExited(MouseEvent e) {}
	}
	public static void main(String[] args) {
		new MouseEventListenerTest();
	}
}
