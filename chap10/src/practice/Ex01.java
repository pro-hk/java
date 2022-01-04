package practice;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex01 extends JFrame {
	private JLabel label = new JLabel("Love Java");
	public Ex01() {
		setSize(500, 500);
		setVisible(true);
		setTitle("마우스 올리기 내리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		
		contentPane.add(label);
		label.addMouseListener(new mouseListener());
	}
	class mouseListener implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent e) {}
		@Override
		public void mousePressed(MouseEvent e) {}
		@Override
		public void mouseReleased(MouseEvent e) {}
		@Override
		public void mouseEntered(MouseEvent e) {
			label.setText("Love Java");
		}
		@Override
		public void mouseExited(MouseEvent e) {
			label.setText("사랑해");
		}
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
