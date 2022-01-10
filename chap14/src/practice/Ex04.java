package practice;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class Ex04 extends JFrame {
	public Ex04() {
		setTitle("���ڰ� �ƴ� Ű�� �ԷµǴ� ��� ���â �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JToolBar toolBar = new JToolBar("�й�");
		JTextField tf = new JTextField(20);
		
		tf.addKeyListener(new MyKeyListener());
		
		toolBar.add(new JLabel("�й� :"));
		toolBar.add(tf);
		
		add(toolBar,BorderLayout.SOUTH);
		
		setSize(300,300);
		setVisible(true);
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyTyped(KeyEvent e) {
//			System.out.println(e.getKeyChar());
			if(e.getKeyChar() < '0' || e.getKeyChar() > '9') {  // ���ڰ� �ƴ�
				JOptionPane.showMessageDialog(null, e.getKeyChar()+"�� ���� Ű�� �ƴմϴ�\r\n���ڸ� �Է��ϼ���.","���",JOptionPane.ERROR_MESSAGE);
				e.consume();
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex04();
	}
}
