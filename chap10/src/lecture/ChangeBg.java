package lecture;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ChangeBg extends JFrame {
	private JLabel label = new JLabel();
	private Container contentPane;
	public ChangeBg() {
		setTitle("Ű���� �̺�Ʈ ���� ���Դϴ�.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = this.getContentPane();
		contentPane.addKeyListener(new MyKeyListener());
		
		
		setSize(300,300);
		setVisible(true);
		
		contentPane.setFocusable(true);
		contentPane.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
	// f1 Ű�� ������ ���� �ʷ����� �ٲ��, %�� ������ ��������� ����
	// Ư������, �빮�� ����Ʈ ������ ���� keycode�� ����
	public void keyPressed(KeyEvent e) {
//		System.out.println("keychar==="+e.getKeyChar());
//		System.out.println("keycode==="+e.getKeyCode());
		if(e.getKeyChar()=='%') {
			contentPane.setBackground(Color.yellow);
		} else if(e.getKeyCode()==KeyEvent.VK_F1) { // VK ���� KeyChar�� �ȵ�
			contentPane.setBackground(Color.green);
		}
	}
}
	
	public static void main(String[] args) {
		new ChangeBg();
	}
}
