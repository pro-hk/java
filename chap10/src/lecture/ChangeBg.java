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
		setTitle("키보드 이벤트 연습 중입니다.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = this.getContentPane();
		contentPane.addKeyListener(new MyKeyListener());
		
		
		setSize(300,300);
		setVisible(true);
		
		contentPane.setFocusable(true);
		contentPane.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
	// f1 키를 누르면 색이 초록으로 바뀌고, %를 누르면 노란색으로 변경
	// 특수문자, 대문자 시프트 누르기 전과 keycode가 같음
	public void keyPressed(KeyEvent e) {
//		System.out.println("keychar==="+e.getKeyChar());
//		System.out.println("keycode==="+e.getKeyCode());
		if(e.getKeyChar()=='%') {
			contentPane.setBackground(Color.yellow);
		} else if(e.getKeyCode()==KeyEvent.VK_F1) { // VK 사용시 KeyChar는 안됨
			contentPane.setBackground(Color.green);
		}
	}
}
	
	public static void main(String[] args) {
		new ChangeBg();
	}
}
