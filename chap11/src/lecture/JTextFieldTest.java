package lecture;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTextFieldTest extends JFrame {
	public JTextFieldTest() {
		setTitle("텍스트필드 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("이름"));
		contentPane.add(new JTextField("이름을 쓰세요", 20));
		contentPane.add(new JLabel("학과"));
		contentPane.add(new JTextField("학과를 쓰세요", 20));
		contentPane.add(new JLabel("주소"));
		contentPane.add(new JTextField("주소를 쓰세요", 20));
		
		contentPane.add(new JScrollPane(new JTextArea("나는 문어 꿈을 꾸는 문어..",5,25))); // 5줄 20자  
		// JScrollPane : 스크롤 생성
		
		setSize(280, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTextFieldTest();
	}
}
