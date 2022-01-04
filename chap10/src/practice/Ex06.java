package practice;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex06 extends JFrame {
	public Ex06() {
		setSize(500, 500);
		setVisible(true);
		setTitle("클릭 연습용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("C");
		label.setSize(50,50);
		label.setLocation(100, 100);
		
		label.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = (int)(Math.random()*450);
				int y = (int)(Math.random()*450);
				label.setLocation(x, y);
			}
		});
		
		contentPane.add(label);
	}

	public static void main(String[] args) {
		new Ex06();
	}

}
