package lecture;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveLabel extends JFrame {
	// JLabel�� �ϳ� ����� ������ hello�� ä��� �����¿� Ű�� ������ 10px�� �̵�
	// keyAdapter �̿��ؼ� �����̱�
	private JLabel label = new JLabel("hello");

	public MoveLabel() {
		setTitle("�����¿� Ű�� ������ �̵�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = this.getContentPane();
		contentPane.addKeyListener(new MyKeyListener());
		contentPane.setLayout(null);
		
		contentPane.add(label);
		label.setLocation(50, 50);
		label.setSize(100, 20);
		
		setSize(300, 300);
		setVisible(true);
		contentPane.setFocusable(true);
		contentPane.requestFocus();
	}

	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			switch(keyCode) {
			 case KeyEvent.VK_LEFT:
				 label.setLocation(label.getX()-10, label.getY());
				 break;
			 case KeyEvent.VK_RIGHT:
				 label.setLocation(label.getX()+10, label.getY());
				 break;
			 case KeyEvent.VK_UP:
				 label.setLocation(label.getX(), label.getY()-10);
				 break;
			 case KeyEvent.VK_DOWN:
				 label.setLocation(label.getX(), label.getY()+10);
				 break;
			}
		}
	}
	public static void main(String[] args) {
		new MoveLabel();
	}
}
