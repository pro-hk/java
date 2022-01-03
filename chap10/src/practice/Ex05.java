package practice;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex05 extends JFrame {
	private JLabel label = new JLabel("Love Java");
	
	public Ex05() {
		setSize(300, 300);
		setVisible(true);
		setTitle("+,- 키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		label.setFont(new Font("Arial", Font.PLAIN,10));
		label.addKeyListener(new Keyboard());
		label.setFocusable(true);
		label.requestFocus();
		
		contentPane.add(label);
	}
	
	class Keyboard implements KeyListener{
		@Override
		public void keyTyped(KeyEvent e) {}
		@Override
		public void keyPressed(KeyEvent e) {
			Font f = label.getFont();
			int size = f.getSize();
			if(e.getKeyCode()==KeyEvent.VK_ADD && size < 50) {
				label.setFont(new Font("Arial", Font.PLAIN,size+5));
			} else if (e.getKeyCode()==KeyEvent.VK_SUBTRACT && size >5) {
				//if(size < 5) return;
				label.setFont(new Font("Arial", Font.PLAIN,size-5));
			}
		}
		@Override
		public void keyReleased(KeyEvent e) {}
	}

	public static void main(String[] args) {
		new Ex05();
	}
}
