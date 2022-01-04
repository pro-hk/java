package practice;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex04 extends JFrame {
	public Ex04() {
		setSize(500, 500);
		setVisible(true);
		setTitle("Left 키로 문자열 이동");
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
					String firstTxt = label.getText().substring(0, 1);
					String remainTxt = label.getText().substring(1);
					label.setText(remainTxt+firstTxt);
				}
			}
		});
		contentPane.setFocusable(true);
		contentPane.requestFocus();
		
	}
	public static void main(String[] args) {
		new Ex04();
	}
}
