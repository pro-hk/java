package lecture;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTextAreaTest extends JFrame {
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(10,20);
	public JTextAreaTest() {
		setTitle("TextArea 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("글자를 입력 후 Enter를 누르세요"));
		contentPane.add(tf);
		contentPane.add(new JScrollPane(ta,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));
				// 스크롤바 생성 관련..
		
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf = (JTextField)e.getSource();
				ta.append(tf.getText()+"\r\n");  // \r\n : 줄바꿈
				tf.setText("");
			}
		});
		
		setSize(280, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTextAreaTest();
	}
}
