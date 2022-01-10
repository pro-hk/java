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
		setTitle("숫자가 아닌 키가 입력되는 경우 경고창 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JToolBar toolBar = new JToolBar("학번");
		JTextField tf = new JTextField(20);
		
		tf.addKeyListener(new MyKeyListener());
		
		toolBar.add(new JLabel("학번 :"));
		toolBar.add(tf);
		
		add(toolBar,BorderLayout.SOUTH);
		
		setSize(300,300);
		setVisible(true);
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyTyped(KeyEvent e) {
//			System.out.println(e.getKeyChar());
			if(e.getKeyChar() < '0' || e.getKeyChar() > '9') {  // 숫자가 아님
				JOptionPane.showMessageDialog(null, e.getKeyChar()+"는 숫자 키가 아닙니다\r\n숫자를 입력하세요.","경고",JOptionPane.ERROR_MESSAGE);
				e.consume();
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex04();
	}
}
