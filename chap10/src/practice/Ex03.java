package practice;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex03 extends JFrame {
	private JLabel label = new JLabel("Love Java");
	StringBuffer sb = new StringBuffer(label.getText());
	
	public Ex03() {
		setSize(300, 300);
		setVisible(true);
		setTitle("Left 키로 문자열 교체");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
//		label.addKeyListener(new Keyborad());
		label.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					sb.reverse();
					label.setText(sb.toString());
				}
			}
		});
		label.setFocusable(true);
		label.requestFocus();
		
		contentPane.add(label);
	}
	/*
	class Keyborad implements KeyListener{
		@Override
		public void keyTyped(KeyEvent e) {}
		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_LEFT) {
				sb.reverse();
				label.setText(sb.toString());
			}
		}
		@Override
		public void keyReleased(KeyEvent e) {}
	}
	*/
	public static void main(String[] args) {
		new Ex03();
	}
}