package practice;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex05 extends JFrame {
	public Ex05() {
		setSize(500, 500);
		setVisible(true);
		setTitle("+,- 키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		label.setFont(new Font("Arial", Font.PLAIN, 10));
		
		contentPane.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				Font f = label.getFont();
				int size = f.getSize();
				if(code == 61) {
					label.setFont(new Font("Arial", Font.PLAIN, size+5));
				}
				else if (code == 45 && size>5) {
					label.setFont(new Font("Arial", Font.PLAIN, size-5));
				}
			}
		});
		
		contentPane.add(label);
		contentPane.setFocusable(true);
		contentPane.requestFocus();
	}
	public static void main(String[] args) {
		new Ex05();
	}
}
