package practice;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex01 extends JFrame {
	JLabel label = new JLabel("Love Java");
	
	public Ex01() {
		setSize(300, 300);
		setVisible(true);
		setTitle("마우스 올리기 내리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		label.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				label.setText("사랑해");
			}
			public void mouseExited(MouseEvent e) {
				label.setText("Love Java");
			}
		});
//		label.addMouseListener(new Mymouse());
		/*
		label.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {
			label.setText("사랑해");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
			label.setText("Love Java");
			}
		});
		*/
		contentPane.add(label);
	}
	/*
	public class Mymouse implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent e) {}
		@Override
		public void mousePressed(MouseEvent e) {}
		@Override
		public void mouseReleased(MouseEvent e) {}
		@Override
		public void mouseEntered(MouseEvent e) {
			label.setText("사랑해");
		}
		@Override
		public void mouseExited(MouseEvent e) {
			label.setText("Love Java");
		}
	}
	*/
	
	public static void main(String[] args) {
		new Ex01();
	}
}
