package lecture;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerTest extends JFrame {
	private JLabel messages[];
	public KeyListenerTest() {
		setTitle("Ű�̺�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.addKeyListener(new MyKeyListener());
		messages = new JLabel[3];
		messages[0] = new JLabel("getKeyCode()");
		messages[1] = new JLabel("getKeyChar()");
		messages[2] = new JLabel("getKeyText()");
		for(int i=0;i<3;i++) {
			contentPane.add(messages[i]);
			messages[i].setSize(800, 50);
			messages[i].setOpaque(true);
			messages[i].setBackground(Color.white);
			
		}

		setSize(500, 500);
		setVisible(true);
		contentPane.setFocusable(true);
		contentPane.requestFocus();
	}
	// �����ʸ� �޾Ƽ� �̺�Ʈ�� ���� �� �ִ�.
	// ActionEvent �� ��ư���� ����
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			messages[0].setText(Integer.toString(keyCode));
			messages[1].setText(Character.toString(keyChar));
			messages[2].setText(e.getKeyText(keyCode));
		}
	}
	public static void main(String[] args) {
		new KeyListenerTest();
	}
}
