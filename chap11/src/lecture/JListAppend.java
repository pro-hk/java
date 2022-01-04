package lecture;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class JListAppend extends JFrame {
	private JTextField tf = new JTextField(20);
	private Vector<String> vec = new Vector<>();
	private JList<String> list = new JList<>(vec);
	public JListAppend() {
		setTitle("TextListAppend 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("글자를 입력 후 Enter를 누르세요"));
		contentPane.add(tf);
		contentPane.add(new JScrollPane(list,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));
				// 스크롤바 생성 관련..
		
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf = (JTextField)(e.getSource());
				vec.add(tf.getText());
				tf.setText("");
				list.setListData(vec);
			}
		});
		vec.add("장성호");
		vec.add("이성규");
		setSize(280, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JListAppend();
	}
}
