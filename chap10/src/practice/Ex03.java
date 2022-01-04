package practice;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex03 extends JFrame {
	public Ex03() {
		setSize(500, 500);
		setVisible(true);
		setTitle("Left 키로 문자열 교체");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		contentPane.add(label);
		
		contentPane.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {
				int left = e.getKeyCode();
				if(left == 37 ) {
					if(label.getText().equals("Love Java")) {
						label.setText("avaJ evoL");						
					}
					else {
						label.setText("Love Java");
					}
				}
			}
		});
		contentPane.setFocusable(true);
		contentPane.requestFocus();
		
	}
	public static void main(String[] args) {
		new Ex03();
	}
}
