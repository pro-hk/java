package practice;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex04 extends JFrame {
	private JLabel label = new JLabel("Love Java");
	public Ex04() {
		setSize(300, 300);
		setVisible(true);
		setTitle("Left 키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		label.addKeyListener(new left());
		label.setFocusable(true);
		label.requestFocus();
		
		contentPane.add(label);
	}
	
	class left implements KeyListener{
		@Override
		public void keyTyped(KeyEvent e) {}
		@Override
		public void keyPressed(KeyEvent e) {
			String sb = label.getText();
//			StringBuffer sb = new StringBuffer(label.getText());
			if(e.getKeyCode()==KeyEvent.VK_LEFT) {
				label.setText(sb.substring(1)+sb.substring(0, 1));
			}
			if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
				int last = sb.length()-1;
				label.setText(sb.substring(last)+sb.substring(0, last));
			}
		}
		@Override
		public void keyReleased(KeyEvent e) {}
		
	}
	
	public static void main(String[] args) {
		new Ex04();
	}
}